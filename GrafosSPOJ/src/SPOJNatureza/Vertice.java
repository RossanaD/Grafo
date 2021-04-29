package SPOJNatureza;

import java.util.ArrayList;

public class Vertice<T> {
	private T dado;
	private ArrayList<Aresta<T>> arestaEntrada;
	private ArrayList<Aresta<T>> arestaSaida;
	
	public Vertice(T dado) {
		super();
		this.dado = dado;
		this.arestaEntrada = new ArrayList<Aresta<T>>();
		this.arestaSaida = new ArrayList<Aresta<T>>();
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
	
	 public void adicionarArestaEntrada(Aresta<T> aresta){
	        this.arestaEntrada.add(aresta);
	    }
	    
	    public void adicionarArestaSaida(Aresta<T> aresta){
	        this.arestaSaida.add(aresta);
	    }

	    public ArrayList<Aresta<T>> getArestasEntrada() {
	        return arestaEntrada;
	    }

	    public ArrayList<Aresta<T>> getArestasSaida() {
	        return arestaSaida;
	    }
}
