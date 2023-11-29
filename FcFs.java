package it.edu.iisgubbio.fcfs;

public class FcFs {
	
	String processi[];
	int tArrivo[];
	int tEsecuzione[];
	int tServizio[];
	public String Fcfs(String x) {
		return x;
	}
	/**
	 * Assegna un nome ai processi
	 * @param x scorre la lunghezza del processo e assegna un nome
	 */
	public void setP() {
		for(int x=0;x<this.processi.length;x++) {
			this.processi[x]+=x;
		}
	}
	/**
	 * Prendo il tempo di arrivo
	 * @param x scorre tempo di arrivo
	 * @return ritorna il tempo di arrivo
	 */
	public int[] getTarrivo() {
		for(int x=0;x<tArrivo.length;x++) {
			tArrivo[x]=x;
		}
		return tArrivo;
	}
	/**
	 * Tempo che ci mette per essere eseguito
	 */
	public void setTesecuzione(int[] te) {
		this.tEsecuzione = te;
	}
	/**
	 * Calcolo del tempo che server per essere eseguito
	 * @param x scorre il tempo di servizio
	 * @return ritorna il tempo di servizio
	 */
	public int[] getTs() {
		for (int x=0;x<tServizio.length;x++) {
			tServizio[x]=tEsecuzione[x]+tArrivo[x-1];
		}
		return tServizio;
	}
	}

	