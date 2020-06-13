package lista_treinamento;

import java.util.Scanner;

public class ListaOg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int maoEsquerda,maoDireita,soma;
		
		maoEsquerda=in.nextInt();
		maoDireita=in.nextInt();
		
		while((maoEsquerda!=0)||(maoDireita!=0)){
			soma=maoEsquerda+maoDireita;
			System.out.println(soma);
			maoEsquerda=in.nextInt();
			maoDireita=in.nextInt();
		}
		

	}

}
