package controller;

import java.util.ArrayList;
import java.util.List;

import model.ValoresUC4;

public class CalculosUC4 implements Calculo{
	private final double w = 2*Math.PI*60;
	
	ValoresUC4 valor;
	
	public CalculosUC4() {
		valor = new ValoresUC4();
	}
	
	@Override
	public void calcular() {
		setPotLiq();
		setPotDist(); 
		setTpf();		
		setFormaOndaTensao();
		setFormaOndaCorrenteHarm();
		setFormaOndaPotHarmInst();		
	}
	
	
	//validação entradas
	
	public double getAmpV() {
		return valor.getAmpV();
	}

	public void setAmpV(double ampV) {
		if(ampV < 0 || ampV > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpV(ampV);
	}

	public double getAngV() {
		return valor.getAngV();
	}

	public void setAngV(double angV) {
		if(angV < -180 || angV > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");		
		valor.setAngV(angV);
	}

	public double getAmpI() {
		return valor.getAmpI();
	}

	public void setAmpI(double ampI) {
		if(ampI < 0 || ampI > 100) throw new IllegalArgumentException("Amplitude da Corrente deve estar entre 0 e 100");
		valor.setAmpI(ampI);
	}

	public double getAngI() {
		return valor.getAngI();
	}

	public void setAngI(double angI) {
		if(angI < -180 || angI > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngI(angI);
	}

	public int getOrdemH() {
		return valor.getOrdemH();
	}

	public void setOrdemH(int ordemH) {
		valor.setOrdemH(ordemH);
	}

	
	//saídas
	
	public double getPotLiq() {
		return valor.getPotLiq();
	}

	public double getPotDist() {
		return valor.getPotDist();
	}

	public double getTpf() {
		return valor.getTpf();
	}

	
	//cálculos saídas
	
	private void setPotLiq() {
		valor.setPotLiq(0);
	}

	private void setPotDist() {
		valor.setPotDist(valor.getAmpV() * valor.getAmpI());
	}

	private void setTpf() {
		valor.setTpf(0.0);
	}
	
	
	//gráficos
	
		
	public List<Double> getFormaOndaTensao() {
		return valor.getFormaOndaTensao();
	}

	public List<Double> getFormaOndaCorrenteHarm() {
		return valor.getFormaOndaCorrenteHarm();
	}

	public List<Double> getFormaOndaPotHarmInst() {
		return valor.getFormaOndaPotHarmInst();
	}
	
	
	//cálculos gráficos
	
	private void setFormaOndaTensao() {
		List<Double> formaOndaTensao = new ArrayList<>();
		formaOndaTensao.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaTensao.add(valor.getAmpV() * Math.cos(w * x + Math.toRadians(valor.getAngV())));
			x += 0.0001;
		}
		valor.setFormaOndaTensao(formaOndaTensao);
	}
	
	private void setFormaOndaCorrenteHarm() {
		List<Double> formaOndaCorrenteHarm = new ArrayList<>();
		formaOndaCorrenteHarm.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaCorrenteHarm.add(valor.getAmpV() * Math.cos(valor.getOrdemH() * w * x + Math.toRadians(valor.getAngV())));
			x += 0.0001;
		}
		valor.setFormaOndaCorrenteHarm(formaOndaCorrenteHarm);
	}

	private void setFormaOndaPotHarmInst() {
		List<Double> formaOndaPotHarmInst = new ArrayList<>();
		formaOndaPotHarmInst.clear();
		
		double x = 0;
		int aux;
		
		for(aux = 0; aux < valor.getFormaOndaCorrenteHarm().size(); aux++) {
			x = valor.getFormaOndaCorrenteHarm().get(aux) * valor.getFormaOndaTensao().get(aux);
			formaOndaPotHarmInst.add(x);
		}
		valor.setFormaOndaPotHarmInst(formaOndaPotHarmInst);
	}
}
