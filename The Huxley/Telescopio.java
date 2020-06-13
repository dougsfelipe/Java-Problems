

import java.util.Scanner;

public class Telescopio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int telescopio = in.nextInt();
		int estrelas = in.nextInt();
		int q=0;
		int estrela[] = new int[estrelas];
		
		for (int i = 0; i < estrela.length; i++) {
			estrela[i]=in.nextInt();
		}
		
		for (int i = 0; i < estrela.length; i++) {
			if((telescopio*estrela[i])>=40000000){
				q++;
			}
		}
		
		System.out.println(q);
		
		

	}

}
