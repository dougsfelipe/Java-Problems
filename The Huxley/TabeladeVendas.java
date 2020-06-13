import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		// declara??o de variaveis
		int dias = in.nextInt();
		
		int quantdias=dias;
		double soma =0;
		double media;
		double mediapdia;
		
		
		
		
		double[] array = new double[dias];
		
		
		int[] dias1 = new int[dias];
		int[] dias2 = new int[dias];
		
		
		//leitura de array
		
		
		for (int i = 0; i < dias; i++) {
			array[i]=in.nextDouble();
		}
		
		//quantidade de dias
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==0){
				quantdias--;
				
			}
		}
		
		//soma dos dias
		
		
		for (int i = 0; i < array.length; i++) {
			soma=soma+array[i];
		}
		
		//maior e menor faturamento
		
		double maior=array[0];
		double menor = 0;
		
		for (int i = 0; i < dias2.length; i++) {
			if(array[i]!=0){
				menor=array[i];
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>maior){
				maior=array[i];
				
			}
			
			if(array[i]<menor && array[i]>0){
				menor=array[i];
				
			}
			
		}
		
		//dias de menor e maior faturamento
		for (int i = 0; i < dias2.length; i++) {
			if(maior==array[i]){
				dias1[i]=i+1;
			}
			
			if(menor==array[i]){
				dias2[i]=i+1;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		//calculos
		media=soma/dias;
		mediapdia=soma/quantdias;
		
		
		int cont=0,cont2=1;
		for (int i = 0; i < dias2.length; i++) {
			if(dias2[i]!=0){
				cont++;
			}
		}
		
		//impressao
		
		
		
		
		if(soma==0){
			System.out.println("0");
			System.out.println("0.00");
			System.out.println("0.00");
			System.out.println("0.00");
			System.out.println("0 ");
			System.out.println("0.00");
			System.out.println("0");
		}else{
			
			
			
		System.out.println(quantdias);
		System.out.printf("%.2f",media);
		System.out.println();
		
	
		
		System.out.printf("%.2f",mediapdia);
		System.out.println();
		
		System.out.println(maior);
		
		
		for (int i = 0; i < dias2.length; i++) {
			if(dias1[i]!=0){
				System.out.print(dias1[i]+" ");
			}
		}
		
		System.out.println();
		
		System.out.println(menor);
		
	
		for (int i = 0; i < dias2.length; i++) {
			if(dias2[i]!=0 && cont>cont2){
				System.out.print(dias2[i]+" ");
				cont2++;
			}else if(dias2[i]!=0){
				System.out.print(dias2[i]);
			}
		}
		System.out.println();
		
		}
		
		

	}

}
