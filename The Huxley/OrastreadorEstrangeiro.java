import java.util.Scanner;

class No{
	int valor;
	No proximo;
	
	public No(int valor){
		this.valor = valor;
		proximo = null;
	}
}

public class HuxleyCode  {
	
	 No cabeca,calda;
	 int size=0;
	
	public HuxleyCode (){
		cabeca = calda = null;
		
	}
	
	public void addfim(No a){
		
		if(size==0){
			cabeca = a;
			calda = a;
		}else{
			calda.proximo = a;
			calda = a;
		}
		
		size++;
		
	}
	
	
	public void delini(){
        No noAtual;
        
        noAtual = cabeca;
        if ( size == 1){
                cabeca = calda = null;
           }
           else{
               
                  cabeca = noAtual.proximo;
               
               
           }
           size--;
       }
	
	public int getsize(){
		return size;
	}
	
	public void delfim(HuxleyCode  lista){
        No noAtual;
        No noAnterior = null;
        noAtual  = lista.cabeca;
        noAnterior = lista.cabeca;
        
        while(noAtual.proximo != null){
        noAnterior = noAtual;
        noAtual = noAtual.proximo;
        }
        noAnterior.proximo = null;
        lista.calda = noAnterior;
        size--;
	
	}
	
	public void exibirLista(){
	    No temp = cabeca;
	    
	    int contador = 1;
	    if ( size!=0 ){
	        while (contador <= size){
	            System.out.print(temp.valor+" ");
	            temp = temp.proximo;
	            contador++;
	        }
	    }
	    
	 }
	
	public void cont(HuxleyCode  l1) {
		
		
		
		 No noAtual;
	        No noAnterior = null;
	        noAtual  = l1.cabeca;
	        noAnterior = l1.cabeca;
	        
	        while(noAtual.proximo != null){
	        noAnterior = noAtual;
	        noAtual = noAtual.proximo;
	        }
	        System.out.print(noAtual.valor+" ");
	        noAnterior.proximo = null;
	        l1.calda = noAnterior;
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		HuxleyCode  buffer = new HuxleyCode ();
		HuxleyCode  aux = new HuxleyCode ();
		
		
		int q = in.nextInt();
		int p = in.nextInt();
		int cont = 0;
		
		String exe = "sdas";
		while (in.hasNext()) {
		
		for (int i = 0; i < p && in.hasNext(); i++) {
			 exe = in.next();
			int num = in.nextInt();
			if (exe.equals ("RECV")) {
				if(buffer.getsize()<q){
					while(num>0 && buffer.getsize()!= q){
						buffer.addfim(new No(cont));
						cont++;
						num--;
					}
				}
				
				if(buffer.getsize()>=q && num!=0){
					while(num>0){
					aux.addfim(new No(cont));
					cont++;
					num--;
					}
				}	
			}else{
				while(num!=0 && buffer.getsize() > 0){
					System.out.print(buffer.cabeca.valor+" ");
					buffer.delini();
					num --;
				}
				System.out.println("");
			}
		}
		
	
			while(buffer.size < q && aux.size !=0){
				buffer.addfim(new No(aux.calda.valor));
				aux.delfim(aux);
			}
		}
		buffer.exibirLista();
		System.out.println();
		
		for (int i = 0; i < aux.getsize(); i++) {
			aux.cont(aux);
		}
		
	}
}



