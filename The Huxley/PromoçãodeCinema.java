package lista_treinamento;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade =in.nextInt();
		String nome;
		int cont=0;
		
		while(idade!=111){
			nome = in.next();
			
			if(idade>60 || idade <11){
				cont++;
			}
			
			if(idade>25 && idade<35 && nome.equalsIgnoreCase("M")){
				cont++;
			}
			idade =in.nextInt();
		}
		System.out.println(cont);

	}

}
