package controller;

import java.util.ArrayList;
import java.util.List;

import model.ValoresUC2;

public class CalculosUC2 implements Calculo{
	private final double w = 2*Math.PI*60;
	
	ValoresUC2 valor; 
	
	public CalculosUC2() {
		valor = new ValoresUC2();
	}
	
	@Override
	public void calcular() {
		setFatorPot();
		setPotAparente();
		setPotReativa();
		setPotAtiva();
		setFormaOndaTensao();
		setFormaOndaCorrente();
		setFormaOndaPotInst();
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

	
	//saídas
	
	public double getPotAtiva() {
		return valor.getPotAtiva();
	}


	public double getPotReativa() {
		return valor.getPotReativa();
	}


	public double getPotAparente() {
		return valor.getPotAparente();
	}


	public double getFatorPot() {
		return valor.getFatorPot();
	}
	
	//graficos
	
	public List<Double> getFormaOndaTensao() {
		return valor.getFormaOndaTensao();
	}
	
	
	public List<Double> getFormaOndaCorrente() {
		return valor.getFormaOndaCorrente();
	}
	
	
	public List<Double> getFormaOndaPotInst() {
		return valor.getFormaOndaPotInst();
	}
	
	
	//calculos saídas
	
	private void setPotAtiva() {
		valor.setPotAtiva(valor.getAmpV() * valor.getAmpI() * Math.cos(Math.toRadians(valor.getAngV() - valor.getAngI())));
	}


	private void setPotReativa() {
		valor.setPotReativa(valor.getAmpV() * valor.getAmpI() * Math.sin(Math.toRadians(valor.getAngV() - valor.getAngI())));
	}


	private void setPotAparente() {
		valor.setPotAparente(valor.getAmpV() * valor.getAmpI());
	}


	private void setFatorPot() {
		valor.setFatorPot(Math.cos(Math.toRadians(valor.getAngV() - valor.getAngI())));
	}
	
	
	//cálculos gráficos
	
	private void setFormaOndaTensao() {
		double x = 0;
		
		List<Double> formaOndaTensao = new ArrayList<>();
		formaOndaTensao.clear();
		
		while (x <= 0.1) {
			formaOndaTensao.add(valor.getAmpV() * Math.cos(w * x + Math.toRadians(valor.getAngV())));
			x += 0.0001;
		}
		valor.setFormaOndaTensao(formaOndaTensao);
	}

	private void setFormaOndaCorrente() {
		double x = 0;
		
		List<Double> formaOndaCorrente = new ArrayList<>();
		formaOndaCorrente.clear();
		
		while (x <= 0.1) {
			formaOndaCorrente.add(valor.getAmpI() * Math.cos(w * x + Math.toRadians(valor.getAngI())));
			x += 0.0001;
		}
		valor.setFormaOndaCorrente(formaOndaCorrente);
	}

	private void setFormaOndaPotInst() {
		double x;
		int aux;
		
		List<Double> formaOndaPotInst = new ArrayList<>();
		formaOndaPotInst.clear();
		
		for(aux = 0; aux < valor.getFormaOndaCorrente().size(); aux++) {
			x = valor.getFormaOndaCorrente().get(aux) * valor.getFormaOndaTensao().get(aux);
			formaOndaPotInst.add(x);
		}
		valor.setFormaOndaPotInst(formaOndaPotInst);
	}
}
