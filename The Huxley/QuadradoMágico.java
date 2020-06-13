import java.util.Scanner;

public class QuadradoMagica {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		int n=in.nextInt();
		
		int[][] matriz = new int[n][n];
		
		int[] soma1 = new int[n];
		int[] soma2 = new int[n];
		int soma3=0;
		int soma4=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=in.nextInt();
			}
		}
		
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < soma2.length; j++) {
				soma1[i]=soma1[i]+matriz[i][j];
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < soma2.length; j++) {
				soma2[i]=soma2[i]+matriz[j][i];
			}
		}
		int d=0;
		for (int i = matriz.length-1; i >= 0; i--) {
			
				
					soma4=soma4+matriz[d][i];
					d++;
				
			
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < soma2.length; j++) {
				if(j==1){
					soma3=soma3+matriz[i][j];
				}
				
			}
		}
		
		
		
		boolean teste=true;
		
		for (int i = 0; i < soma2.length; i++) {
			for (int j = 0; j < soma2.length; j++) {
				
			
			if(soma1[i]!=soma2[j] || soma1[i]!=soma1[j]||soma2[i]!=soma2[j]||soma1[i]!=soma3||soma1[i]!=soma4||soma2[i]!=soma3||soma2[i]!=soma4){
				teste=false;
			}
			
			}
		}
		
		
		if(teste){
			System.out.println(soma1[0]);
		}else{
			System.out.println("-1");
		}
	}

}
