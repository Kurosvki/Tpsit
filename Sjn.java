package it.edu.iisgubbio.sjn;

import java.util.Arrays;

public class Sjn{ 
	String processo[];
	int arrivo[];		
	int esecuzione[];	
	int servizio[];		
	int attesa[];
	
	String[] misto;
	
	
	public Sjn(int numProcessi) {
		processo = new String[numProcessi];
		arrivo = new int[numProcessi];
		esecuzione = new int[numProcessi];
		servizio = new int[numProcessi];
		attesa = new int[numProcessi];
		
		
		for(int c = 0; c <= numProcessi - 1;c++) {
			
			processo[c] = c + "";
		}
	}

	public void setEsecuzione(String processo, int tempoEsecuzione) {
		String numeroProcesso = processo;
		
		for(int c = 0; c <= this.processo.length - 1;c++) {
			if (numeroProcesso.equals(this.processo[c])) {
				esecuzione[c]= tempoEsecuzione;
			}
		}
	}

	public void ordina() {
		
		int appoggioEsecuzione=0;
		String appoggioProcesso;
		int appoggioArrivo=0;
		
		for(int c=0;c<=esecuzione.length - 1;c++) {
			for(int i = esecuzione.length - 2;i>= c;i--) {
				
				if(esecuzione[i]>esecuzione[i+1]) {
					appoggioProcesso=processo[i];
					processo[i]=processo[i+1];
					processo[i+1]=appoggioProcesso;
					
					appoggioEsecuzione=esecuzione[i];
					esecuzione[i]=esecuzione[i+1];
					esecuzione[i+1]=appoggioEsecuzione;
					
					appoggioArrivo=arrivo[i];
					arrivo[i]=arrivo[i+1];
					arrivo[i+1]=appoggioArrivo;
				}
			}
		}
		
		int servizioTot = 0;
		servizio[0]= 0;
		servizioTot =+ esecuzione[0];
		for (int c = 1; c <= this.processo.length - 1;c++) {
			servizio[c]= servizioTot;
			servizioTot += esecuzione[c];
		}
	}
	
	public String getEsecuzione() {return Arrays.toString(esecuzione);}
	
	public String getProcessi() {
		return Arrays.toString(processo);
	}
	
	public String getServizio() {
		return Arrays.toString(servizio);
	}
	
	public double getAttesaMedia() {

		double attesaTot = 0;
		for (int c = 0; c <= processo.length - 1;c++) {
			attesaTot += attesa[c];
		}
		return attesaTot/this.processo.length;
	}

}