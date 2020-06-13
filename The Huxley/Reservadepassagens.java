import java.util.Scanner;

public class Caracteristicas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] numeroVoo = new int[37];
		int[] lugar = new int[37];		
		
		int[] id = new int[37];
		int[] voo = new int[37];
		
		
		 
		for (int i = 0; i < numeroVoo.length; i++) {
			numeroVoo[i]=in.nextInt();
			lugar[i]=in.nextInt();
			
		}
			
		int i=0;
		
		id[i]=in.nextInt();
		int cont = 0;
		
		while(id[i]!=9999){
			voo[i]=in.nextInt();
			i++;
			cont++;
			id[i]=in.nextInt();
			
		}
		 
		int contteste=0;
			
		for (int j = 0; j < cont; j++) {
			
			contteste=0;
			for (int k = 0; k < voo.length; k++) {
				if(voo[j]==numeroVoo[k]){
					contteste++;;
				}
			}
			
			
			for (int j2 = 0; j2 < 37; j2++) {
				
				
				if(voo[j]==numeroVoo[j2] && lugar[j2]>=1){
					
					System.out.println(id[j]);
					lugar[j2]--;
					
				}else if(voo[j]==numeroVoo[j2] && lugar[j2]<1){
					
					System.out.println("INDISPONIVEL");
					
					
				
				
				
								
				
				
				
				
			}
			
			
			
		
		}
			
			if(contteste==0){
				System.out.println("INDISPONIVEL");
			}
		
	
		
		
		
		

	}}}
	
	


