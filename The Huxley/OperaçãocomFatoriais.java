package lista_treinamento;

import java.util.Scanner;

public class Fatorias {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//while
		
		
		int x=in.nextInt();
		int n=in.nextInt();
		int fatorial;
		double soma;
		
		if(n==0){
			soma=0;
		}else{
		soma=x;
		
		for (int i = 2; i < (n+1); i++) {
			if(i%2==0){
				soma=soma - fator(i, x);
			}else{
				soma = soma + fator(i, x);
			}}
		}
		
		
		//while de novo
		
		while(x!=0||n!=0){
			
			
			System.out.println();
			System.out.printf("%.6f",soma);
			
			
			
			x=in.nextInt();
			 n=in.nextInt();
			
			
			 if(n==0){
					soma=0;
				}else{
				soma=x;
				
				for (int i = 2; i < (n+1); i++) {
					if(i%2==0){
						soma=soma - fator(i, x);
					}else{
						soma = soma + fator(i, x);
					}}
				}
			
			
		}
		
		}
				
		

public static double fator(double i,int x){
			
			
	
			double divisor = Math.pow(x, (2*(i-1)));
			
			double dividendo = ((2*1)-1);
			
			for(int t = 1;t <= ((2*i)-1); t++){
                dividendo = dividendo*t;
            } 
			double fator2=divisor/dividendo;
			
			return fator2;
			
			
			
		
			}
}
		

	
