


	import java.util.Scanner;

	public class Listas {
		
		private int valor;
		private Listas no;
		private Listas proximo;
		
		
		public Listas(int valor){
			this.valor = valor;
			this.proximo=null;
			
		}
		
		public void setvalor(int valor){
			this.valor=valor;
		}
		public int getvalor(){
			return this.valor;
		}
		
		
		
		public void Inserir(int valor){
			if(this.proximo==null){
				this.proximo=new Listas(valor);
				this.proximo.valor=valor;
			}
			else{
				this.proximo.Inserir(valor);
			}
		}
		
		//ordena?ao de lista
		
		public void Ordenar(){
			Listas aux = this;
			while(aux != null)
			{
				Listas aux2 = aux.proximo;
				while(aux2 != null)
				{
					if(aux.getvalor() > aux2.getvalor()){
						int x = aux.getvalor();
						aux.setvalor(aux2.getvalor());
						aux2.setvalor(x);
					}
					aux2 = aux2.proximo;
				}
				aux = aux.proximo;
			}
			
		}
		
		
		// escrever o array Normal
		
		
		public void Imprimir(){
		
			System.out.print(this.valor+" ");
			if(this.proximo!=null){
				this.proximo.Imprimir();
			}
		}
		
		
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int n = in.nextInt();
			Listas novo = new Listas(n);
			
			
			
			while (in.hasNextInt()) {
				novo.Inserir(in.nextInt());
				
			}
			
			novo.Ordenar();
			
			novo.Imprimir();
		}
		}





		

