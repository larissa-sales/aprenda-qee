package controller;

import java.util.ArrayList;
import java.util.List;

public class CalculosUC2 implements Calculo{
	private final double w = 2*Math.PI*60;
	
	private double ampV;
	private double angV;
	private double ampI;
	private double angI;
	private double potAtiva;
	private double potReativa;
	private double potAparente;
	private double fatorPot;	
	private List<Double> formaOndaTensao;
	private List<Double> formaOndaCorrente;
	private List<Double> formaOndaPotInst;
	
	public CalculosUC2() {
		formaOndaTensao = new ArrayList<>();
		formaOndaCorrente = new ArrayList<>();
		formaOndaPotInst = new ArrayList<>();
	}
	
	@Override
	public void calcular() {
		calculaFatorPot();
		calculaPotAparente();
		calculaPotReativa();
		calculaPotAtiva();
		calculaFormaOndaTensao();
		calculaFormaOndaCorrente();
		calculaFormaOndaPotInst();
	}


	public double getAmpV() {
		return ampV;
	}


	public void setAmpV(double ampV) {
		if(ampV < 0 || ampV > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		
		this.ampV = ampV;
	}


	public double getAngV() {
		return angV;
	}


	public void setAngV(double angV) {
		if(angV < -180 || angV > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angV = angV;
	}


	public double getAmpI() {
		return ampI;
	}


	public void setAmpI(double ampI) {
		if(ampI < 0 || ampI > 100) throw new IllegalArgumentException("Amplitude da Corrente deve estar entre 0 e 100");
		this.ampI = ampI;
	}


	public double getAngI() {
		return angI;
	}


	public void setAngI(double angI) {
		if(angI < -180 || angI > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angI = angI;
	}


	public double getPotAtiva() {
		return potAtiva;
	}


	public double getPotReativa() {
		return potReativa;
	}


	public double getPotAparente() {
		return potAparente;
	}


	public double getFatorPot() {
		return fatorPot;
	}
	
	private void calculaPotAtiva() {
		potAtiva = ampV * ampI * Math.cos(Math.toRadians(angV - angI));
	}


	private void calculaPotReativa() {
		potReativa = ampV * ampI * Math.sin(Math.toRadians(angV - angI));;
	}


	private void calculaPotAparente() {
		potAparente = ampV * ampI;
	}


	private void calculaFatorPot() {
		fatorPot = Math.cos(Math.toRadians(angV - angI));
	}

	public List<Double> getFormaOndaTensao() {
		return formaOndaTensao;
	}

	public List<Double> getFormaOndaCorrente() {
		return formaOndaCorrente;
	}

	public List<Double> getFormaOndaPotInst() {
		return formaOndaPotInst;
	}
	
	private void calculaFormaOndaTensao() {
		double x = 0;
		while (x <= 0.1) {
			formaOndaTensao.add(ampV*Math.cos(w*x+Math.toRadians(angV)));
			x += 0.0001;
		}
	}

	private void calculaFormaOndaCorrente() {
		double x = 0;
		while (x <= 0.1) {
			formaOndaCorrente.add(ampI*Math.cos(w*x+Math.toRadians(angI)));
			x += 0.0001;
		}		
	}

	private void calculaFormaOndaPotInst() {
		for(int aux = 0; aux < formaOndaTensao.size(); aux++) {
			formaOndaPotInst.add(formaOndaTensao.get(aux) * formaOndaCorrente.get(aux));
		}
		
	}
}
