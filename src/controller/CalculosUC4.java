package controller;

import java.util.ArrayList;
import java.util.List;

public class CalculosUC4 implements Calculo{
	private final double w = 2*Math.PI*60;
	
	private double ampV;
	private double angV;
	private double ampI;
	private double angI;
	private int ordemH;
	private double potLiq;
	private double potDist;
	private double tpf;
	private List<Double> formaOndaTensaoFund;
	private List<Double> formaOndaCorrenteHarm;
	private List<Double> formaOndaPotHarmInst;
	
	public CalculosUC4() {
		formaOndaTensaoFund = new ArrayList<>();
		formaOndaCorrenteHarm = new ArrayList<>();
		formaOndaPotHarmInst = new ArrayList<>();
	}
	
	@Override
	public void calcular() {
		calculaPotLiq();
		calculaPotDist(); 
		calculaTpf();		
	}
	
	
	//entradas
	
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

	public int getOrdemH() {
		return ordemH;
	}

	public void setOrdemH(int ordemH) {
		this.ordemH = ordemH;
	}

	
	//saídas
	
	public double getPotLiq() {
		return potLiq;
	}

	public double getPotDist() {
		return potDist;
	}

	public double getTpf() {
		return tpf;
	}

	
	//cálculos saídas
	
	private void calculaPotLiq() {
		potLiq = 0;
	}

	private void calculaPotDist() {
		potDist = 0;
	}

	private void calculaTpf() {
		tpf = (ampV * ampI * Math.cos(Math.toRadians(angI + angV))) / (ampV * ampI);
	}
	
	
	//gráficos
	
	public List<Double> getFormaOndaTensaoFund() {
		return formaOndaTensaoFund;
	}

	public List<Double> getFormaOndaCorrenteHarm() {
		return formaOndaCorrenteHarm;
	}

	public List<Double> getFormaOndaPotHarmInst() {
		return formaOndaPotHarmInst;
	}
	
	
	//cálculos gráficos
	
	private void calculaFormaOndaTensaoFund() {
		formaOndaTensaoFund.clear();
	}

	private void calculaFormaOndaCorrenteHarm() {
		formaOndaCorrenteHarm.clear();
	}

	private void calculaFormaOndaPotHarmInst() {
		formaOndaPotHarmInst.clear();
	}
	
	
}
