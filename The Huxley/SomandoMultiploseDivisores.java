package lista_treinamento;

import java.util.Scanner;

public class Limites {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1=in.nextInt();
		int num2=in.nextInt();
		int soma=0;
		
		
		if(num2>num1){
		for (int i = num1; i < num2; i++) {
			
			if(i%4==0 && 1000%i==0){
				soma=soma+i;
			}
			
		}
		System.out.println(soma);
					}else{
						
						for (int i = num2; i < num1; i++) {
							
							if(i%4==0 && 1000%i==0){
								soma=soma+i;
							}
							
						
						}
						
						System.out.println(soma);
						
						
					}
	}

}
