package controller;

import java.util.List;

public class CalculosUC3 implements Calculo {
	private boolean IsHarmPar;
	private int NumHarm;
	private double AmpH1;
	private double AngH1;
	private int OrdH1;
	private double AmpH2;
	private double AngH2;
	private int OrdH2;
	private double AmpH3;
	private double AngH3;
	private int OrdH3;
	private double AmpH4;
	private double AngH4;
	private int OrdH4;
	private double AmpH5;
	private double AngH5;
	private int OrdH5;
	private double AmpH6;
	private double AngH6;
	private int OrdH6;
	private List<Double> formaOndaFund;
	private List<Double> formaOndaH1;
	private List<Double> formaOndaH2;
	private List<Double> formaOndaH3;
	private List<Double> formaOndaH4;
	private List<Double> formaOndaH5;
	private List<Double> formaOndaH6;
	
	
	@Override
	public void calcular() {
		// TODO Auto-generated method stub
		
	}


	//entradas
	
	public boolean isIsHarmPar() {
		return IsHarmPar;
	}


	public void setIsHarmPar(boolean isHarmPar) {
		IsHarmPar = isHarmPar;
	}


	public int getNumHarm() {
		return NumHarm;
	}


	public void setNumHarm(int numHarm) {
		NumHarm = numHarm;
	}


	public double getAmpH1() {
		return AmpH1;
	}


	public void setAmpH1(double ampH1) {
		AmpH1 = ampH1;
	}


	public double getAngH1() {
		return AngH1;
	}


	public void setAngH1(double angH1) {
		AngH1 = angH1;
	}


	public int getOrdH1() {
		return OrdH1;
	}


	public void setOrdH1(int ordH1) {
		OrdH1 = ordH1;
	}


	public double getAmpH2() {
		return AmpH2;
	}


	public void setAmpH2(double ampH2) {
		AmpH2 = ampH2;
	}


	public double getAngH2() {
		return AngH2;
	}


	public void setAngH2(double angH2) {
		AngH2 = angH2;
	}


	public int getOrdH2() {
		return OrdH2;
	}


	public void setOrdH2(int ordH2) {
		OrdH2 = ordH2;
	}


	public double getAmpH3() {
		return AmpH3;
	}


	public void setAmpH3(double ampH3) {
		AmpH3 = ampH3;
	}


	public double getAngH3() {
		return AngH3;
	}


	public void setAngH3(double angH3) {
		AngH3 = angH3;
	}


	public int getOrdH3() {
		return OrdH3;
	}


	public void setOrdH3(int ordH3) {
		OrdH3 = ordH3;
	}


	public double getAmpH4() {
		return AmpH4;
	}


	public void setAmpH4(double ampH4) {
		AmpH4 = ampH4;
	}


	public double getAngH4() {
		return AngH4;
	}


	public void setAngH4(double angH4) {
		AngH4 = angH4;
	}


	public int getOrdH4() {
		return OrdH4;
	}


	public void setOrdH4(int ordH4) {
		OrdH4 = ordH4;
	}


	public double getAmpH5() {
		return AmpH5;
	}


	public void setAmpH5(double ampH5) {
		AmpH5 = ampH5;
	}


	public double getAngH5() {
		return AngH5;
	}


	public void setAngH5(double angH5) {
		AngH5 = angH5;
	}


	public int getOrdH5() {
		return OrdH5;
	}


	public void setOrdH5(int ordH5) {
		OrdH5 = ordH5;
	}


	public double getAmpH6() {
		return AmpH6;
	}


	public void setAmpH6(double ampH6) {
		AmpH6 = ampH6;
	}


	public double getAngH6() {
		return AngH6;
	}


	public void setAngH6(double angH6) {
		AngH6 = angH6;
	}


	public int getOrdH6() {
		return OrdH6;
	}


	public void setOrdH6(int ordH6) {
		OrdH6 = ordH6;
	}

	
	//saídas
	
	//cálculos saídas
	
	//gráficos
	
	public List<Double> getFormaOndaFund() {
		return formaOndaFund;
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
	}


	private void calculaFormaOndaH1() {
		formaOndaH1.clear();
	}


	private void calculaFormaOndaH2() {
		formaOndaH2.clear();
	}


	private void calculaFormaOndaH3() {
		formaOndaH3.clear();
	}


	private void calculaFormaOndaH4() {
		formaOndaH4.clear();
	}


	private void calculaFormaOndaH5() {
		formaOndaH5.clear();
	}


	private void calculaFormaOndaH6() {
		formaOndaH6.clear();
	}
}
