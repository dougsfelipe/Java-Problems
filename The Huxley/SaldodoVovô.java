package lista_treinamento;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int dias = in.nextInt();
		int saldo = in.nextInt();
		
		int saque[] =new int[dias];
		
		for (int i = 0; i < saque.length; i++) {
			saque[i]=in.nextInt();
		}
		int menor=(saldo+saque[0]);
		for (int i = 0; i < saque.length; i++) {
			saldo=saldo+saque[i];
			if(saldo<menor){
				menor=saldo;
			}
		}
		System.out.println(menor);

	}

}
