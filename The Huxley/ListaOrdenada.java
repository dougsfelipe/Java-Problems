import java.util.Scanner;

public class Q2 {

	
	private int valor;
	private Q2 prox;
	
	
	//Inicializando
	public Q2(int valor){
		this.valor=valor;
		this.prox=null;
	}
	
	
	//Definir um valor
	public void setvalor(int valor){
		this.valor=valor;
	}
	
	//Pegar Um valor
	public  int getvalor(){
		return this.valor;
	}
	
	//Inserir na proximo no vazio
	public void Inserir(int valor){
		if(this.prox==null){
			
			this.prox=new Q2(valor);
			
			this.prox.valor=valor;
		}
		
		
		else{
			this.prox.Inserir(valor);
		}
	}
	
	
	//Ordem
	public void Ordem(){
		Q2 auxiliar = this;
		while(auxiliar != null)
		{
			Q2 auxiliar2 = auxiliar.prox;
			while(auxiliar2 != null)
			{
				if(auxiliar.getvalor() > auxiliar2.getvalor()){
					int x = auxiliar.getvalor();
					auxiliar.setvalor(auxiliar2.getvalor());
					auxiliar2.setvalor(x);
				}
				auxiliar2 = auxiliar2.prox;
			}
			auxiliar = auxiliar.prox;
		}
		
	}
	
	
	public void Imprimir(){
		System.out.println(this.valor);
		if(this.prox!=null){
			this.prox.Imprimir();
		}
	}
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 int n = in.nextInt();
		 
		 if(n>0){
		 
		 int y=in.nextInt();
		 Q2 novo = new Q2(y);
		 
		
		 
		 for (int i = 0; i < n-1; i++) {
			 y = in.nextInt();
			novo.Inserir(y);
		}
		 
		 novo.Ordem();
		 novo.Imprimir();
		 }
		 

	}

}
