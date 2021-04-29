package SPOJNatureza;

import java.util.Scanner;

public class NaturezaSPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Grafo<String> grafo = new Grafo<String>();
		
		
		int qtdAnimais, qtdRelacoes, count = 0;
		String sair = "N";
		System.out.println("Quantidade de animais");
		qtdAnimais = teclado.nextInt();
		System.out.println("Quantidade de relações");
		qtdRelacoes = teclado.nextInt();
		while(qtdAnimais != 0 && qtdRelacoes != 0) {
			for(int i=0;i<=qtdAnimais;i++) {
				String animal = teclado.nextLine();
				grafo.adicionarVertice(animal);
			}
			for(int j=0;j<qtdRelacoes;j++) {
				System.out.println("Presa");
				String presa = teclado.nextLine();
				System.out.println("Predador");
				String predador = teclado.nextLine();
				grafo.adicionarAresta(presa, predador);			
			}
			System.out.println("Quantidade de animais");
			qtdAnimais = teclado.nextInt();
			System.out.println("Quantidade de relações");
			qtdRelacoes = teclado.nextInt();	
		}
		System.out.println(grafo.toString());
	}

}
