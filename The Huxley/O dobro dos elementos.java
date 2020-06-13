package lista_treinamento;

import java.util.Scanner;

public class Dobro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] numero = new int[n];
		
		for (int i = 0; i < numero.length; i++) {
			numero[i]=in.nextInt();
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]*2);
		}

	}

}
