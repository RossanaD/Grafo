//Rossana Ariadna Schumann Dullius
package SPOJNatureza;

import java.util.Stack;

public class BuscaProfundidade<T> {
	
	private int tempo;
	private Stack<Vertice<T>> pilha;
	private int count;
	private int maior = 0;
	
	public BuscaProfundidade(){
		tempo = 0;
		pilha = new Stack<>();
		count = 0;
	}
	
	public void DFS(Grafo<T> graf) {
    	for(Vertice<T> vertice : graf.getAllVertice()) {	
    		vertice.setCor(0);
    	}
    	for(Vertice<T> v : graf.getAllVertice()) {
    			DFSVisit(v);   			
    	}
    }
    public void DFSVisit(Vertice<T> u) {
    	pilha.push(u);
    	count++;
    	u.setCor(1);
    	tempo = tempo+1;
    	for(int i=0;i<u.getArestasSaida().size();i++) {
    		Vertice<T> proximo = u.getArestasSaida().get(i).getFim();
    			pilha.push(proximo);
    			DFSVisit(proximo);
    	}
    	if(count > maior) {
    		maior = count;
    	}
    	pilha.pop();
    	count--;
    }
    
    public int getTempo() {
    	return tempo;
    }
    
    public String toString() {
    	return "Maior cadeia alimentar: "+maior;
    }
}
