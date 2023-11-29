package it.edu.iisgubbio.fcfs;

public class FcFs {
	
	String processi[];
	int tArrivo[];
	int tEsecuzione[];
	int tServizio[];
	public String Fcfs(String x) {
		return x;
	}
	//Assegno un nome ai processi	
	public void setP() {
		for(int x=0;x<this.processi.length;x++) {
			this.processi[x]+=x;
		}
	}
	//Prendo il tempo di arrivo
	public int[] getTarrivo() {
		for(int x=0;x<tArrivo.length;x++) {
			tArrivo[x]=x;
		}
		return tArrivo;
	}
	//Tempo che ci mette per essere eseguito
	public void setTesecuzione(int[] te) {
		this.tEsecuzione = te;
	}
	//Calcolo del tempo che server per essere eseguito
	public int[] getTs() {
		for (int x=0;x<tServizio.length;x++) {
			tServizio[x]=tEsecuzione[x]+tArrivo[x-1];
		}
		return tServizio;
	}
	}

	