package model;

import java.util.ArrayList;
import java.util.List;

public class ValoresUC3 {
	
	private double ampV;
	private double angV;
	private String fourier;
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
	private List<Double> formaOndaH1;
	private List<Double> formaOndaH2;
	private List<Double> formaOndaH3;
	private List<Double> formaOndaH4;
	private List<Double> formaOndaH5;
	private List<Double> formaOndaH6;
	private List<Double> formaOndaDistRes;
	
	public ValoresUC3() {
		formaOndaFund = new ArrayList<>();
		formaOndaDistRes = new ArrayList<>();
		formaOndaH1 = new ArrayList<>();
		formaOndaH2 = new ArrayList<>();
		formaOndaH3 = new ArrayList<>();
		formaOndaH4 = new ArrayList<>();
		formaOndaH5 = new ArrayList<>();
		formaOndaH6 = new ArrayList<>();
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
			this.ampH1 = ampH1;
		}

		public double getAngH1() {
			return angH1;
		}

		public void setAngH1(double angH1) {
			this.angH1 = angH1;
		}

		public int getOrdH1() {
			return ordH1;
		}

		public void setOrdH1(int ordH1) {
			this.ordH1 = ordH1;
			}


		public double getAmpH2() {
			return ampH2;
		}

		public void setAmpH2(double ampH2) {
			this.ampH2 = ampH2;
		}

		public double getAngH2() {
			return angH2;
		}

		public void setAngH2(double angH2) {
			this.angH2 = angH2;
		}

		public int getOrdH2() {
			return ordH2;
		}
		
		public void setOrdH2(int ordH2) {
			this.ordH2 = ordH2;
		}


		public double getAmpH3() {
			return ampH3;
		}

		public void setAmpH3(double ampH3) {
			this.ampH3 = ampH3;
		}

		public double getAngH3() {
			return angH3;
		}

		public void setAngH3(double angH3) {
			this.angH3 = angH3;
		}

		public int getOrdH3() {
			return ordH3;
		}

		public void setOrdH3(int ordH3) {
				this.ordH3 = ordH3;
		}


		public double getAmpH4() {
			return ampH4;
		}

		public void setAmpH4(double ampH4) {
			this.ampH4 = ampH4;
		}

		public double getAngH4() {
			return angH4;
		}

		public void setAngH4(double angH4) {
			this.angH4 = angH4;
		}

		public int getOrdH4() {
			return ordH4;
		}

		public void setOrdH4(int ordH4) {
				this.ordH4 = ordH4;
		}


		public double getAmpH5() {
			return ampH5;
		}

		public void setAmpH5(double ampH5) {
			this.ampH5 = ampH5;
		}

		public double getAngH5() {
			return angH5;
		}

		public void setAngH5(double angH5) {
			this.angH5 = angH5;
		}

		public int getOrdH5() {
			return ordH5;
		}

		public void setOrdH5(int ordH5) {
				this.ordH5 = ordH5;
		}


		public double getAmpH6() {
			return ampH6;
		}

		public void setAmpH6(double ampH6) {
			this.ampH6 = ampH6;
		}

		public double getAngH6() {
			return angH6;
		}

		public void setAngH6(double angH6) {
			this.angH6 = angH6;
		}

		public int getOrdH6() {
			return ordH6;
		}

		public void setOrdH6(int ordH6) {
				this.ordH6 = ordH6;
		}
		
		
		//saídas
		
		public String getFourier() {
			return fourier;
		}
		
		public void setFourier(String fourier) {
			this.fourier = fourier;
		}
		
		
		//gráficos
		
		public List<Double> getFormaOndaFund() {
			return formaOndaFund;
		}
		
		
		public void setFormaOndaFund(List<Double> formaOndaFund) {
			this.formaOndaFund = formaOndaFund;
		}
		

		public List<Double> getFormaOndaH1() {
			return formaOndaH1;
		}
		
		
		public void setFormaOndaH1(List<Double> formaOndaH1) {
			this.formaOndaH1 = formaOndaH1;
		}
		

		public List<Double> getFormaOndaH2() {
			return formaOndaH2;
		}
		
		
		public void setFormaOndaH2(List<Double> formaOndaH2) {
			this.formaOndaH2 = formaOndaH2;
		}


		public List<Double> getFormaOndaH3() {
			return formaOndaH3;
		}
		
		
		public void setFormaOndaH3(List<Double> formaOndaH3) {
			this.formaOndaH3 = formaOndaH3;
		}


		public List<Double> getFormaOndaH4() {
			return formaOndaH4;
		}
		
		
		public void setFormaOndaH4(List<Double> formaOndaH4) {
			this.formaOndaH4 = formaOndaH4;
		}


		public List<Double> getFormaOndaH5() {
			return formaOndaH5;
		}
		
		
		public void setFormaOndaH5(List<Double> formaOndaH5) {
			this.formaOndaH5 = formaOndaH5;
		}


		public List<Double> getFormaOndaH6() {
			return formaOndaH6;
		}
		
		
		public void setFormaOndaH6(List<Double> formaOndaH6) {
			this.formaOndaH6 = formaOndaH6;
		}
		
		
		public List<Double> getFormaOndaDistRes(){
			return formaOndaDistRes;
		}
		
		
		public void setFormaOndaDistRes(List<Double> formaOndaDistRes) {
			this.formaOndaFund = formaOndaDistRes;
		}
		


}