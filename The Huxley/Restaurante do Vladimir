package lista_treinamento;

import java.util.Scanner;

public class Valdimir {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String lanche =in.nextLine();
		String sabor = in.nextLine();
		int quantidade =in.nextInt();
		double preco=0;
		
		lanche=lanche.toUpperCase();
		sabor=sabor.toUpperCase();
		
		if(lanche.equals("PIZZA")){
			if(sabor.equals("CALABRESA")||sabor.equals("MARGUERITA")){
				preco=(20.60*quantidade)+(quantidade*2);
			}else{
				preco=(30.90*quantidade)+(quantidade*2);
			}
		}
		
		
		if(lanche.equals("LASANHA")){
			if(sabor.equals("QUEIJO")){
				preco=(18*quantidade)+(quantidade*2);
			}else if(sabor.equals("BOLONHESA")){
				preco=(23*quantidade)+(quantidade*2);
			}
		}
		
		
		System.out.printf("%.2f",preco);

	}

}
