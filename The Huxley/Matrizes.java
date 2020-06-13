import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		
		int n =in.nextInt();
		int m =in.nextInt();
		
		
		while(n!=0 || m!=0){
			
			
			if(n==0 || m ==0){
				System.out.println("0.00");
				
				n =in.nextInt();
				m =in.nextInt();
			}else{
		float t=0;
				
				
		int[][] matriz= new int[n][m];
		int s=1;
		//parametros
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j]=s;
				s++;
			}
		}
		
		
		
		
		//Soma 
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				t=t+matriz[i][j];
			}
			
		}
		
		
		//linhas 
		float c=0,d=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(i==0){
					c=c+matriz[i][j];
				}
				if(i==n-1){
					d=d+matriz[i][j];
				}
			}
			
		}
		
		
		
		//Colunas
		
		float a=0,b=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(j==0){
					a=a+matriz[i][j];
				}
				if(j==m-1){
					b=b+matriz[i][j];
				}
			}
		}
		
		
		//Diagonal 1
		float x=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(j==i){
					x=x+matriz[i][j];
				}
			}
		}
		
		
		
		//Diagonal 2
		
		float y=0;
		int j=m-1;
		for (int i = n-1; i >= 0; i--) {
			if(j>=0){
					y=y+matriz[i][j];
					
					
						j--;}
			}
		if(m==1){
			y=matriz[n-1][m-1];
		}
		
		
		
		
		//calculo
		
		
		float resu = ( t - (x+y) + (a *b) - (c*d) ) / (n*m);
		
		//imprimir
		
		
		
		
		
		
		System.out.printf("%.2f",resu);
		System.out.println();
		
		
		
		
		n =in.nextInt();
		m =in.nextInt();
			}
	}
		
		
	
	}
	

}
