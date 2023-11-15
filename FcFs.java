package it.edu.iisgubbio.fcfs;

public class FcFs {
	
	String processi;
	int tArrivo[];
	int tEsecuzione[];
	int tServizio[];
	int tAttesa[];

	public String FcFs(String processi) {
		return processi;
	}
	
	public int [] arrivo() {
		return tArrivo;
	}
	
	public int[] esecuzione() {
		return tEsecuzione;
	}
	
	public int[] servizio() {
		return tServizio;
	}
	public int[] attesa() {
		return tAttesa;
	}
} 
