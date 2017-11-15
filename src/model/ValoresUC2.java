package model;

import java.util.ArrayList;
import java.util.List;

public class ValoresUC2 {
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
	
	public ValoresUC2() {
		formaOndaTensao = new ArrayList<>();
		formaOndaCorrente = new ArrayList<>();
		formaOndaPotInst = new ArrayList<>();
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

		
		//saídas
		
		public double getPotAtiva() {
			return potAtiva;
		}
		
		
		public void setPotAtiva(double potAtiva) {
			this.potAtiva = potAtiva;
		}


		public double getPotReativa() {
			return potReativa;
		}

		
		public void setPotReativa(double potReativa) {
			this.potReativa = potReativa;
		}



		public double getPotAparente() {
			return potAparente;
		}
		
		
		public void setPotAparente(double potAparente) {
			this.potAparente = potAparente;
		}


		public double getFatorPot() {
			return fatorPot;
		}
		
		
		public void setFatorPot(double fatorPot) {
			this.fatorPot = fatorPot;
		}

		
		//gráficos
		
		public List<Double> getFormaOndaTensao() {
			return formaOndaTensao;
		}
		
		
		public void setFormaOndaTensao(List<Double> formaOndaTensao) {
			this.formaOndaTensao = formaOndaTensao;
		}


		public List<Double> getFormaOndaCorrente() {
			return formaOndaCorrente;
		}
		
		
		public void setFormaOndaCorrente(List<Double> formaOndaCorrente) {
			this.formaOndaCorrente = formaOndaCorrente;
		}

		public List<Double> getFormaOndaPotInst() {
			return formaOndaPotInst;
		}
		
		
		public void setFormaOndaPotInst(List<Double> formaOndaPotInst) {
			this.formaOndaPotInst = formaOndaPotInst;
		}
		
}
