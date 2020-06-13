import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//declara??o de variaveis
		int n = in.nextInt();
		int soma=0;
		
		int[] array = new int[n];
		
		//ler array
		for (int i = 0; i < array.length; i++) {
			array[i]=in.nextInt();
		}
		
		//substituir array
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0){
				array[i]=1;
			}else{
				array[i]=-1;
			}
			
		}
		
		//imprimir e somar array
		
		for (int i = 0; i < array.length; i++) {
			soma=soma + array[i];
		}
		
		System.out.println(soma);

	}
}
