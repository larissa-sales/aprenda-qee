package controller;

import java.util.ArrayList;
import java.util.List;

public class CalculosUC3 implements Calculo {
	private final double w = 2*Math.PI*60;
	

	private double ampV;
	private double angV;
	private double fourier;
	private boolean isHarmPar;
	private int numHarm;
	private double ampH1;
	private double angH1;
	private int ordH1;
	private double ampH2;
	private double angH2;
	private int ordH2;
	private double ampH3;
	private double angH3;
	private int ordH3;
	private double ampH4;
	private double angH4;
	private int ordH4;
	private double ampH5;
	private double angH5;
	private int ordH5;
	private double ampH6;
	private double angH6;
	private int ordH6;
	private List<Double> formaOndaFund;
	private List<Double> formaOndaDistRes;
	private List<Double> formaOndaH1;
	private List<Double> formaOndaH2;
	private List<Double> formaOndaH3;
	private List<Double> formaOndaH4;
	private List<Double> formaOndaH5;
	private List<Double> formaOndaH6;
	
	public CalculosUC3() {
		formaOndaFund = new ArrayList<>();
		formaOndaDistRes = new ArrayList<>();
		formaOndaH1 = new ArrayList<>();
		formaOndaH2 = new ArrayList<>();
		formaOndaH3 = new ArrayList<>();
		formaOndaH4 = new ArrayList<>();
		formaOndaH5 = new ArrayList<>();
		formaOndaH6 = new ArrayList<>();
	}
	
	
	@Override
	public void calcular() {
		calculaFormaOndaFund();
		calculaFormaOndaDistRes();
		calculaFourier();
		calculaFormaOndaH1();
		calculaFormaOndaH2();
		calculaFormaOndaH3();
		calculaFormaOndaH4();
		calculaFormaOndaH5();
		calculaFormaOndaH6();
	}

	//entradas
	
	public double getAmpV() {
		return ampV;
	}


	public void setAmpV(double ampV) {
		this.ampV = ampV;
	}


	public double getAngV() {
		return angV;
	}


	public void setAngV(double angV) {
		this.angV = angV;
	}
	
	
	public boolean getIsHarmPar() {
		return isHarmPar;
	}


	public void setIsHarmPar(boolean isHarmPar) {
		this.isHarmPar = isHarmPar;
	}


	public int getNumHarm() {
		return numHarm;
	}


	public void setNumHarm(int numHarm) {
		this.numHarm = numHarm;
	}


	public double getAmpH1() {
		return ampH1;
	}


	public void setAmpH1(double ampH1) {
		if(ampH1 < 0 || ampH1 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		this.ampH1 = ampH1;
	}


	public double getAngH1() {
		return angH1;
	}


	public void setAngH1(double angH1) {
		if(angH1 < -180 || angH1 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angH1 = angH1;
	}


	public int getOrdH1() {
		return ordH1;
	}


	public void setOrdH1(int ordH1) {
		if(isHarmonicoValido(ordH1))
			this.ordH1 = ordH1;
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH2() {
		return ampH2;
	}


	public void setAmpH2(double ampH2) {
		if(ampH2 < 0 || ampH2 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		this.ampH2 = ampH2;
	}


	public double getAngH2() {
		return angH2;
	}


	public void setAngH2(double angH2) {
		if(angH2 < -180 || angH2 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angH2 = angH2;
	}


	public int getOrdH2() {
		return ordH2;
	}


	public void setOrdH2(int ordH2) {
		if(isHarmonicoValido(ordH2))
			this.ordH2 = ordH2;
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH3() {
		return ampH3;
	}


	public void setAmpH3(double ampH3) {
		if(ampH3 < 0 || ampH3 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		this.ampH3 = ampH3;
	}


	public double getAngH3() {
		return angH3;
	}


	public void setAngH3(double angH3) {
		if(angH3 < -180 || angH3 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angH3 = angH3;
	}


	public int getOrdH3() {
		return ordH3;
	}


	public void setOrdH3(int ordH3) {
		if(isHarmonicoValido(ordH3))
			this.ordH3 = ordH3;
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH4() {
		return ampH4;
	}


	public void setAmpH4(double ampH4) {
		if(ampH4 < 0 || ampH4 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		this.ampH4 = ampH4;
	}


	public double getAngH4() {
		return angH4;
	}


	public void setAngH4(double angH4) {
		if(angH4 < -180 || angH4 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angH4 = angH4;
	}


	public int getOrdH4() {
		return ordH4;
	}


	public void setOrdH4(int ordH4) {
		if(isHarmonicoValido(ordH4))
			this.ordH4 = ordH4;
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH5() {
		return ampH5;
	}


	public void setAmpH5(double ampH5) {
		if(ampH5 < 0 || ampH5 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		this.ampH5 = ampH5;
	}


	public double getAngH5() {
		return angH5;
	}


	public void setAngH5(double angH5) {
		if(angH5 < -180 || angH5 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angH5 = angH5;
	}


	public int getOrdH5() {
		return ordH5;
	}


	public void setOrdH5(int ordH5) {
		if(isHarmonicoValido(ordH5))
			this.ordH5 = ordH5;
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH6() {
		return ampH6;
	}


	public void setAmpH6(double ampH6) {
		if(ampH6 < 0 || ampH6 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		this.ampH6 = ampH6;
	}


	public double getAngH6() {
		return angH6;
	}


	public void setAngH6(double angH6) {
		if(angH6 < -180 || angH6 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		this.angH6 = angH6;
	}


	public int getOrdH6() {
		return ordH6;
	}


	public void setOrdH6(int ordH6) {
		if(isHarmonicoValido(ordH6))
			this.ordH6 = ordH6;
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}
	
	
	//validação
	
	private boolean isHarmonicoValido(int ordem) {
		if(ordem%2 == 0 && isHarmPar) {
			return true;
		}
		else if(ordem%2 == 1 && !isHarmPar)
			return true;
		return false;
	}

	
	//saídas
	
	public double getFourier() {
		return fourier;
	}
	
	
	//cálculos saídas
	
	private void calculaFourier() {
		fourier = 0.0;
	}
	
	
	//gráficos
	
	public List<Double> getFormaOndaFund() {
		return formaOndaFund;
	}
	
	public List<Double> getFormaOndaDistRes(){
		return formaOndaDistRes;
	}


	public List<Double> getFormaOndaH1() {
		return formaOndaH1;
	}


	public List<Double> getFormaOndaH2() {
		return formaOndaH2;
	}


	public List<Double> getFormaOndaH3() {
		return formaOndaH3;
	}


	public List<Double> getFormaOndaH4() {
		return formaOndaH4;
	}


	public List<Double> getFormaOndaH5() {
		return formaOndaH5;
	}


	public List<Double> getFormaOndaH6() {
		return formaOndaH6;
	}

	
	//cálculos gráficos
	
	private void calculaFormaOndaFund() {
		formaOndaFund.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaFund.add(ampV * Math.cos(w * x + Math.toRadians(angV)));
			x += 0.0001;
		}	
	}
	
	
	private void calculaFormaOndaDistRes() {
		double soma = 0;
		
		formaOndaDistRes.clear();
		for(int i = 0; i < formaOndaH1.size(); i++) {
			soma = 0;
			switch(numHarm) {
			case 6:
				soma += formaOndaH6.get(i);
			case 5:
				soma += formaOndaH5.get(i);
			case 4:
				soma += formaOndaH4.get(i);
			case 3:
				soma += formaOndaH3.get(i);
			case 2:
				soma += formaOndaH2.get(i);
			case 1:
				soma += formaOndaH1.get(i);
			}
			formaOndaDistRes.add(formaOndaFund.get(i)+soma);
		}
	}

	
	private void calculaFormaOndaH1() {
		formaOndaH1.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH1.add(ampH1 * Math.cos(ordH1 * w * x + Math.toRadians(angH1)));
			x += 0.0001;
		}
	}


	private void calculaFormaOndaH2() {
		formaOndaH2.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH2.add(ampH2 * Math.cos(ordH2 * w * x + Math.toRadians(angH2)));
			x += 0.0001;
		}
	}


	private void calculaFormaOndaH3() {
		formaOndaH3.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH3.add(ampH3 * Math.cos(ordH3 * w * x + Math.toRadians(angH3)));
			x += 0.0001;
		}
	}


	private void calculaFormaOndaH4() {
		formaOndaH4.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH4.add(ampH4 * Math.cos(ordH4 * w * x + Math.toRadians(angH4)));
			x += 0.0001;
		}
	}


	private void calculaFormaOndaH5() {
		formaOndaH5.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH5.add(ampH5 * Math.cos(ordH5 * w * x + Math.toRadians(angH5)));
			x += 0.0001;
		}
	}


	private void calculaFormaOndaH6() {
		formaOndaH6.clear();
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH6.add(ampH6 * Math.cos(ordH6 * w * x + Math.toRadians(angH6)));
			x += 0.0001;
		}
	}
	
}
