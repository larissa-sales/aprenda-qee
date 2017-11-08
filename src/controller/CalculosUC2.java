package controller;

public class CalculosUC2 implements Calculo{
	private double AmpV;
	private double AngV;
	private double AmpI;
	private double AngI;
	
	
	@Override
	public void calcular() {
		// TODO Auto-generated method stub
		
	}


	public double getAmpV() {
		return AmpV;
	}


	public void setAmpV(double ampV) {
		if(ampV < 0 || ampV > 220) throw new IllegalArgumentException("Amplitude da Tensão deve estar entre 0 e 220");
		
		AmpV = ampV;
	}


	public double getAngV() {
		return AngV;
	}


	public void setAngV(double angV) {
		if(angV < -180 || angV > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		AngV = angV;
	}


	public double getAmpI() {
		return AmpI;
	}


	public void setAmpI(double ampI) {
		if(ampI < 0 || ampI > 100) throw new IllegalArgumentException("Amplitude da Corrente deve estar entre 0 e 100");
		AmpI = ampI;
	}


	public double getAngI() {
		return AngI;
	}


	public void setAngI(double angI) {
		if(angI < -180 || angI > 180) throw new IllegalArgumentException("Ângulo deve estar entre -180 e 180");
		AngI = angI;
	}
	
}
