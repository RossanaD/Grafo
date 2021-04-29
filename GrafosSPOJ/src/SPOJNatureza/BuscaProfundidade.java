package SPOJNatureza;


public class BuscaProfundidade<T> {
	
	private int tempo;
	private Vertice<T> inicio;
	
	public BuscaProfundidade(Vertice<T> ini){
		tempo = 0;
		inicio = ini;
	}
	
	public void DFS(Grafo<T> graf) {
    	for(Vertice<T> vertice : graf.getAllVertice()) {	
    		vertice.setCor(0);
    	}
    	for(Vertice<T> v : graf.getAllVertice()) {
    		if(v.getCor() == 0) {
    			if(v.getDado() == inicio.getDado()) {
    				DFSVisit(v);
    			}   			
    		}
    	}
    }
    public void DFSVisit(Vertice<T> u) {
    	u.setCor(1);
    	tempo = tempo+1;
    	for(int i=0;i<u.getArestasSaida().size();i++) {
    		Vertice<T> proximo = u.getArestasSaida().get(i).getFim();
    		if(proximo.getCor() == 0) {
    			DFSVisit(proximo);
    		}
    	}
    	
    }
    
    public int getTempo() {
    	return tempo;
    }
    
    public String toString() {
    	return "Relações: "+tempo;
    }
}
