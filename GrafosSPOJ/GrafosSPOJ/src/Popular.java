import java.util.ArrayList;
import java.util.Scanner;

public class Popular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantidade de alunos:");
		int qtdAlunos = teclado.nextInt();	
		int[][] cedulas = new int[qtdAlunos][qtdAlunos];
		int[] qtdvotos = new int[qtdAlunos];
		int vencedor = 0;
		int soma = 0;
		ArrayList<Integer> vencedores = new ArrayList<>();

		while(qtdAlunos != 0) {
			for(int idxlinha = 0;idxlinha<qtdAlunos;idxlinha++) {
				for(int idxColuna = 0;idxColuna<qtdAlunos;idxColuna++) {
					System.out.println("Quantidade de votos do: ");
					int valor = teclado.nextInt();
					cedulas[idxlinha][idxColuna] = valor;
				}
			}
			
			for(int coluna=0; coluna<qtdAlunos;coluna++) {
				
				for(int linha=0; linha<qtdAlunos;linha++) {
					int voto = cedulas[linha][coluna];
						soma += voto;
				}
				qtdvotos[coluna] = soma;
				soma = 0;
			}
			for(int i=0;i<qtdvotos.length;i++) {
				if(vencedor < qtdvotos[i]) {
					vencedor = qtdvotos[i];
				}
			}
			vencedores.add(vencedor);
			vencedor = 0;
			System.out.println("Quantidade de alunos:");
			qtdAlunos = teclado.nextInt();
			cedulas = new int[qtdAlunos][qtdAlunos];	
			qtdvotos = new int[qtdAlunos];
		}
		
		for (Integer integer : vencedores) {
			System.out.println(integer);
		}
	}	

}
