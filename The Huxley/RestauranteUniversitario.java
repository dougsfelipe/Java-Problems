import java.util.Scanner;

public class Restaurante_Universitario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int almoco = in.nextInt();
		int cedulas = in.nextInt();
		
		double troco=0;
		
		for (int i = 1; i <= almoco; i++) {
			
			if(cedulas==2){
				
				troco=troco+0.75;
			}
			
			if(cedulas==5){
				troco=troco+1.75;
			}
			
			if(cedulas==10){
				
				troco=troco+6.75;
			}
			if(cedulas==20){
				
				troco=troco+16.75;
			}
			
			
		}
		
		int quantidade = (int) (troco/3.25);
		System.out.println(quantidade);
		
		

	}

}
