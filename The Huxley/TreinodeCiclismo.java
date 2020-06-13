import java.util.Scanner;

public class ciclista {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 
		 double dias[] = new double[7];
		 int desempenho=0;
		 
		 
		 for (int i = 0; i < dias.length; i++) {
			dias[i]=in.nextDouble();
		}
		 
		 for (int i = 0; i < dias.length; i++) {
			if(dias[i]>=8){
				desempenho=desempenho+1;
			}
			
		}
		 
		 if(desempenho>=5){
			 System.out.println("Desempenho otimo");
		 }else if(desempenho==4 || desempenho==3){
			 System.out.println("Desempenho razoavel");
		 }else{
			 System.out.println("Desempenho ruim");
		 }
		 
	}

}
