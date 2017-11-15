package controller;

import java.util.ArrayList;
import java.util.List;

import model.ValoresUC3;

public class CalculosUC3 implements Calculo {
	private final double w = 2*Math.PI*60;
	
	ValoresUC3 valor;
	
	public CalculosUC3() {		
		valor = new ValoresUC3();
	}
	
	@Override
	public void calcular() {
		setFormaOndaFund();		
		setFormaOndaH1();
		setFormaOndaH2();
		setFormaOndaH3();
		setFormaOndaH4();
		setFormaOndaH5();
		setFormaOndaH6();
		setFormaOndaDistRes();
		setFourier();
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
	
	
	public boolean getIsHarmPar() {
		return valor.getIsHarmPar();
	}


	public void setIsHarmPar(boolean isHarmPar) {
		valor.setIsHarmPar(isHarmPar);
	}


	public int getNumHarm() {
		return valor.getNumHarm();
	}


	public void setNumHarm(int numHarm) {
		valor.setNumHarm(numHarm);
	}


	public double getAmpH1() {
		return valor.getAmpH1();
	}


	public void setAmpH1(double ampH1) {
		if(ampH1 < 0 || ampH1 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpH1(ampH1);
	}


	public double getAngH1() {
		return valor.getAngH1();
	}


	public void setAngH1(double angH1) {
		if(angH1 < -180 || angH1 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngH1(angH1);
	}


	public int getOrdH1() {
		return valor.getOrdH1();
	}


	public void setOrdH1(int ordH1) {
		if(isHarmonicoValido(ordH1))
			valor.setOrdH1(ordH1);
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH2() {
		return valor.getAmpH2();
	}


	public void setAmpH2(double ampH2) {
		if(ampH2 < 0 || ampH2 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpH2(ampH2);
	}


	public double getAngH2() {
		return valor.getAngH2();
	}


	public void setAngH2(double angH2) {
		if(angH2 < -180 || angH2 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngH2(angH2);
	}


	public int getOrdH2() {
		return valor.getOrdH2();
	}


	public void setOrdH2(int ordH2) {
		if(isHarmonicoValido(ordH2))
			valor.setOrdH2(ordH2);
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH3() {
		return valor.getAmpH3();
	}


	public void setAmpH3(double ampH3) {
		if(ampH3 < 0 || ampH3 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpH3(ampH3);
	}


	public double getAngH3() {
		return valor.getAngH3();
	}


	public void setAngH3(double angH3) {
		if(angH3 < -180 || angH3 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngH3(angH3);
	}


	public int getOrdH3() {
		return valor.getOrdH3();
	}


	public void setOrdH3(int ordH3) {
		if(isHarmonicoValido(ordH3))
			valor.setOrdH3(ordH3);
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH4() {
		return valor.getAmpH4();
	}


	public void setAmpH4(double ampH4) {
		if(ampH4 < 0 || ampH4 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpH4(ampH4);
	}


	public double getAngH4() {
		return valor.getAngH4();
	}


	public void setAngH4(double angH4) {
		if(angH4 < -180 || angH4 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngH4(angH4);
	}


	public int getOrdH4() {
		return valor.getOrdH4();
	}


	public void setOrdH4(int ordH4) {
		if(isHarmonicoValido(ordH4))
			valor.setOrdH4(ordH4);
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH5() {
		return valor.getAmpH5();
	}


	public void setAmpH5(double ampH5) {
		if(ampH5 < 0 || ampH5 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpH5(ampH5);
	}


	public double getAngH5() {
		return valor.getAngH5();
	}


	public void setAngH5(double angH5) {
		if(angH5 < -180 || angH5 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngH5(angH5);
	}


	public int getOrdH5() {
		return valor.getOrdH5();
	}


	public void setOrdH5(int ordH5) {
		if(isHarmonicoValido(ordH5))
			valor.setOrdH5(ordH5);
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}


	public double getAmpH6() {
		return valor.getAmpH6();
	}


	public void setAmpH6(double ampH6) {
		if(ampH6 < 0 || ampH6 > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		valor.setAmpH6(ampH6);
	}


	public double getAngH6() {
		return valor.getAngH6();
	}


	public void setAngH6(double angH6) {
		if(angH6 < -180 || angH6 > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		valor.setAngH6(angH6);
	}


	public int getOrdH6() {
		return valor.getOrdH6();
	}


	public void setOrdH6(int ordH6) {
		if(isHarmonicoValido(ordH6))
			valor.setOrdH6(ordH6);
		else
			throw new IllegalArgumentException("O valor da ordem harmônica é inválido");
	}
	
	
	private boolean isHarmonicoValido(int ordem) {
		if(ordem%2 == 0 && valor.getIsHarmPar()) {
			return true;
		}
		else if(ordem%2 == 1 && !valor.getIsHarmPar())
			return true;
		return false;
	}

	
	//saídas
	
	public double getFourier() {
		return valor.getFourier();
	}
		
	
	//gráficos
	
	public List<Double> getFormaOndaFund() {
		return valor.getFormaOndaFund();
	}

	
	public List<Double> getFormaOndaH1() {
		return valor.getFormaOndaH1();
	}


	public List<Double> getFormaOndaH2() {
		return valor.getFormaOndaH2();
	}


	public List<Double> getFormaOndaH3() {
		return valor.getFormaOndaH3();
	}


	public List<Double> getFormaOndaH4() {
		return valor.getFormaOndaH4();
	}


	public List<Double> getFormaOndaH5() {
		return valor.getFormaOndaH5();
	}


	public List<Double> getFormaOndaH6() {
		return valor.getFormaOndaH6();
	}
	
	
	public List<Double> getFormaOndaDistRes(){
		return valor.getFormaOndaDistRes();
	}


	//cálculos saídas
	
	private void setFourier() {
		valor.setFourier(0.0);
	}
	
	//cálculos gráficos
	
	private void setFormaOndaFund() {
		List<Double> formaOndaFund = new ArrayList<>();
		formaOndaFund.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaFund.add(valor.getAmpV() * Math.cos(w * x + Math.toRadians(valor.getAngV())));
			x += 0.0001;
		}
		valor.setFormaOndaFund(formaOndaFund);
	}

	
	private void setFormaOndaH1() {
		List<Double> formaOndaH1 = new ArrayList<>();
		formaOndaH1.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH1.add(valor.getAmpH1() * Math.cos(valor.getOrdH1() * w * x + Math.toRadians(valor.getAngH1())));
			x += 0.0001;
		}
		valor.setFormaOndaH1(formaOndaH1);
	}


	private void setFormaOndaH2() {
		List<Double> formaOndaH2 = new ArrayList<>();
		formaOndaH2.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH2.add(valor.getAmpH2() * Math.cos(valor.getOrdH2() * w * x + Math.toRadians(valor.getAngH2())));
			x += 0.0001;
		}
		valor.setFormaOndaH2(formaOndaH2);
	}


	private void setFormaOndaH3() {
		List<Double> formaOndaH3 = new ArrayList<>();
		formaOndaH3.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH3.add(valor.getAmpH3() * Math.cos(valor.getOrdH3() * w * x + Math.toRadians(valor.getAngH3())));
			x += 0.0001;
		}
		valor.setFormaOndaH3(formaOndaH3);
	}


	private void setFormaOndaH4() {
		List<Double> formaOndaH4 = new ArrayList<>();
		formaOndaH4.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH4.add(valor.getAmpH4() * Math.cos(valor.getOrdH4() * w * x + Math.toRadians(valor.getAngH4())));
			x += 0.0001;
		}
		valor.setFormaOndaH4(formaOndaH4);
	}


	private void setFormaOndaH5() {
		List<Double> formaOndaH5 = new ArrayList<>();
		formaOndaH5.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH5.add(valor.getAmpH5() * Math.cos(valor.getOrdH5() * w * x + Math.toRadians(valor.getAngH5())));
			x += 0.0001;
		}
		valor.setFormaOndaH5(formaOndaH5);
	}


	private void setFormaOndaH6() {
		List<Double> formaOndaH6 = new ArrayList<>();
		formaOndaH6.clear();
		
		double x = 0;
		
		while (x <= 0.1) {
			formaOndaH6.add(valor.getAmpH6() * Math.cos(valor.getOrdH6() * w * x + Math.toRadians(valor.getAngH6())));
			x += 0.0001;
		}
		valor.setFormaOndaH6(formaOndaH6);
	}
	
	
	private void setFormaOndaDistRes() {
		List<Double> formaOndaDistRes = new ArrayList<>();
		formaOndaDistRes.clear();
		
		double soma = 0;
		int i;
		
		for(i = 0; i < getFormaOndaH1().size(); i++) {
			soma = 0;
			switch(getNumHarm()) {
			case 6:
				soma += getFormaOndaH6().get(i);
			case 5:
				soma += getFormaOndaH5().get(i);
			case 4:
				soma += getFormaOndaH4().get(i);
			case 3:
				soma += getFormaOndaH3().get(i);
			case 2:
				soma += getFormaOndaH2().get(i);
			case 1:
				soma += getFormaOndaH1().get(i);
			}
			formaOndaDistRes.add(getFormaOndaFund().get(i) + soma);
		}
		valor.setFormaOndaDistRes(formaOndaDistRes);
	}
}
