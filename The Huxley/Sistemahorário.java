package lista_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class dias {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int horas = in.nextInt();
		int minutos = in.nextInt();
		
		String j,s;
		
		int teste = horas -12;
		
		NumberFormat nf = new DecimalFormat("00");
			if(teste>0){
				
				horas=Math.abs(teste);
				j=nf.format(horas);
				s=nf.format(minutos);
				System.out.println(j);
				System.out.println(s);
				
				System.out.println("pm");
			}else if(horas==0){
				
				
				
				s=nf.format(minutos);
				System.out.println("12");
				System.out.println(s);
				System.out.println("am");
				
			}else if(teste==00){
				s=nf.format(minutos);
				System.out.println("12");
				System.out.println(s);
				System.out.println("pm");
				
			}
			
			else{
				
				j=nf.format(horas);
				s=nf.format(minutos);
				System.out.println(j);
				System.out.println(s);
				System.out.println("am");
				
			}

	}

}
