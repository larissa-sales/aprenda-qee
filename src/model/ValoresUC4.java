package model;

import java.util.ArrayList;
import java.util.List;

public class ValoresUC4 {
	private double ampV;
	private double angV;
	private double ampI;
	private double angI;
	private int ordemH;
	private double potLiq;
	private double potDist;
	private double tpf;
	private List<Double> formaOndaTensao;
	private List<Double> formaOndaCorrenteHarm;
	private List<Double> formaOndaPotHarmInst;
	
	public ValoresUC4() {
		formaOndaTensao = new ArrayList<>();
		formaOndaCorrenteHarm = new ArrayList<>();
		formaOndaPotHarmInst = new ArrayList<>();
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

		public double getAmpI() {
			return ampI;
		}

		public void setAmpI(double ampI) {
			this.ampI = ampI;
		}

		public double getAngI() {
			return angI;
		}

		public void setAngI(double angI) {
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
		
		public void setPotLiq(double potLiq) {
			this.potLiq = potLiq;
		}

		public double getPotDist() {
			return potDist;
		}
		
		public void setPotDist(double potDist) {
			this.potDist = potDist;
		}

		public double getTpf() {
			return tpf;
		}
		
		public void setTpf(double tpf) {
			this.tpf = tpf;
		}


		//gráficos
					
		public List<Double> getFormaOndaTensao() {
			return formaOndaTensao;
		}

		public void setFormaOndaTensao(List<Double> formaOndaTensao) {
			this.formaOndaTensao = formaOndaTensao;
		}

		public List<Double> getFormaOndaCorrenteHarm() {
			return formaOndaCorrenteHarm;
		}
		
		public void setFormaOndaCorrenteHarm(List<Double> formaOndaCorrenteHarm) {
			this.formaOndaCorrenteHarm = formaOndaCorrenteHarm;
		}

		public List<Double> getFormaOndaPotHarmInst() {
			return formaOndaPotHarmInst;
		}
		
		public void setFormaOndaPotHarmInst(List<Double> formaOndaPotHarmInst) {
			this.formaOndaPotHarmInst = formaOndaPotHarmInst;
		}
}
