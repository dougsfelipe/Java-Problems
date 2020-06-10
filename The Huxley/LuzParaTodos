
import java.util.Scanner;


public class HuxleyCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		grafos luz = new grafos(n);

		// inicializar os vertices com seu "nome"
		for (int i = 0; i < n; i++) {
			luz.vertice(i);
		}

		int custo1 = in.nextInt();
		int custo2 = in.nextInt();

		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int l = in.nextInt();

			luz.aresta(u, v, l);
		}

		int t1 = luz.MST();

		int t2 = luz.MST_bfs();

		

		

		System.out.println(custo1 * t1 + " " + custo2 * t2);

	}

	static class No {
		int valor;
		No prox;
		int pos;
		int peso;

		No(int valor) {
			this.valor = valor;
			this.prox = null;
			this.peso = 0;
			this.pos = valor;

		}
	}

	// minheap
	static class minheap {
		No numero[];
		int heap_size = 0;
		int[] pos;

		// construtor
		public minheap(int num) {
			this.heap_size = 0;
			numero = new No[num];
			pos = new int[num];

		}

		void heapify(int i) {
			int menor = i;
			int l = 2 * i;
			int r = 2 * i + 1;

			if (l < this.heap_size && this.numero[l].peso < this.numero[menor].peso)
				menor = l;

			if (r < this.heap_size && this.numero[r].peso < this.numero[menor].peso)
				menor = r;

			if (menor != i) {
				No swap = this.numero[i];
				this.numero[i] = this.numero[menor];
				this.numero[menor] = swap;


				heapify(menor);
			}
		}

		// inserir na heap

		void inserir(No valor) {

			heap_size = heap_size + 1;
			int i = heap_size;
			this.numero[i] = valor;
			int pai = i / 2;

			while (pai > 0 && this.numero[i].peso < this.numero[pai].peso) {

				No aux = this.numero[pai];
				this.numero[pai] = this.numero[i];
				this.numero[i] = aux;

				i = pai;
				pai = pai / 2;

			}
		}

		// deletar na heap
		No delete() {

			if (heap_size == 1) {
				heap_size--;
				No aux = this.numero[1];
				this.numero[1] = null;
				return aux;
			}

			No root = this.numero[1];
			No ultimo = this.numero[heap_size];
			this.numero[1] = this.numero[heap_size];
			this.numero[heap_size] = null;

			// Update position of last node
			this.pos[root.valor] = this.heap_size - 1;
			this.pos[ultimo.valor] = 0;

			heap_size--;
			heapify(1);

			return root;

		}

		// checa se esta vazia

		boolean esta_vazia() {
			return this.heap_size == 0;
		}

		
		

		

	}

	// Grafos com lista de adjacencia

	static class grafos {
		int valor;
		No[] adjacentes;
		int atual;
		int vertices;
		boolean[] marcado;
		int[] chave;
		int[] parent;
		int[] ordem;

		// inicializa grafico de tamanho V(vertive)
		grafos(int V) {

			valor = V;

			this.adjacentes = new No[V];
			this.vertices = V;
			this.atual = 0;
			this.marcado = new boolean[V];

			this.chave = new int[V];
			this.parent = new int[V];
			this.ordem = new int[V];

		}

		// coloca o valor do vertice no array de nos
		void vertice(int valor) {
			No novo = new No(valor);
			this.adjacentes[this.atual++] = novo;

		}

		// coloca uma aresta ligada a um vertice
		void aresta(int v1, int v2, int peso) {


		    
		    No temporario = new No(v2);
		    temporario.peso = peso;
		    temporario.prox = this.adjacentes[v1];
		    this.adjacentes[v1] = temporario;
		    temporario = this.adjacentes[v1];
		    No temps2 = new No(v1);
		    temps2.peso=0;
		    temps2.prox = temporario;
		    this.adjacentes[v1] = temps2;
		    
		    
		    
		    No temporario2 = new No(v1);
		    temporario2.peso = peso;
		    temporario2.prox = this.adjacentes[v2];
		    this.adjacentes[v2] = temporario2;
		    
		    temporario2 = this.adjacentes[v2];
		    No temps3 = new No(v2);
		    temps3.peso=0;
		    temps3.prox = temporario2;
		    this.adjacentes[v2] = temps3;
		    

		    

			

		}

		int MST() {

			minheap heap = new minheap(this.vertices+50000);

			for (int i = 0; i < adjacentes.length; i++) {
				this.parent[i] = -1;
				this.chave[i] = 9999;

				this.marcado[i] = false;

			}

			this.parent[0] = 0;

			this.chave[0] = 0;

			No temp2 = new No(0);
			temp2.peso = 0;

			heap.inserir(temp2);
			int visitados = 0;

			int anterior = 0;

			while (!heap.esta_vazia() &&visitados != this.vertices) {
				No auxx = heap.delete();

				auxx = this.adjacentes[auxx.valor];
				int u = auxx.valor;

				if (!marcado[u]) {
					marcado[u] = true;
					visitados++;
					

					while (auxx != null&&visitados != this.vertices) {
						int v = auxx.valor;

						if (marcado[v] == false && auxx.peso < chave[v]) {

							
							chave[v] = auxx.peso;
							parent[v] = u;

							No temp = new No(v);
							temp.peso = chave[v];

							heap.inserir(temp);

						}
						auxx = auxx.prox;
					}
				}
			}
			
			
			int soma = 0;
			for (int i = 0; i < adjacentes.length; i++) {
				soma = soma + chave[i];
			}
			return soma;
		}

		int MST_bfs() {

			minheap heap = new minheap(this.vertices+50000);

			for (int i = 0; i < adjacentes.length; i++) {
				this.parent[i] = -1;
				this.ordem[i] = 9999;
				this.marcado[i] = false;

			}

			this.parent[0] = 0;
			int cont = 0;
			this.ordem[0] = cont;
			No temp3 = new No(0);
			temp3.peso = 0;
			heap.inserir(temp3);
			int soma_fina = 0;
			int visitados = 0;

			while (!heap.esta_vazia()) {

				No auxx = heap.delete();

				if (!marcado[auxx.valor]&&visitados != this.vertices) {

					if (this.ordem[auxx.valor] != cont && cont > 0) {

					} else {
						cont++;

					}

					auxx = this.adjacentes[auxx.valor];
					int u = auxx.valor;

					marcado[u] = true;

					visitados++;
					
					
					

					
					while (auxx != null) {
						int v = auxx.valor;

						if (this.marcado[v] == false && cont < ordem[v]&&visitados != this.vertices) {
							
							

							ordem[v] = cont;
							parent[v] = u;

							soma_fina = soma_fina + ordem[v];

							No temp4 = new No(v);

							temp4.peso = ordem[v];

							heap.inserir(temp4);

						}
						auxx = auxx.prox;
					}
				}
			}
			int soma = 0;

			return soma_fina;

		}
	}
}
