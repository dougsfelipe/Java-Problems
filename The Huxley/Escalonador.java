package lista3;

import java.util.Scanner;

public class HuxleyCode {

	int numero;
	int prioridade;
	int original;

	public HuxleyCode(int num, int pri, int pri2) {
		prioridade = pri;
		numero = num;
		original = pri2;
	}

	static int pais(int i) {
		return (i - 1) / 2;
	}

	static int esquerda(int i) {
		return 2 * i + 1;
	}

	static int direita(int i) {
		return 2 * i + 2;
	}

	static void permuto(int a, int b) {
		int aux = a;
		a = b;
		b = aux;
	}

	static void heapfy(int i, HuxleyCode[] vetor, int n) {
		int l = esquerda(i);
		int r = direita(i);
		int m = i;
		if (l < n && (vetor[l].prioridade < vetor[m].prioridade
				|| ((vetor[l].prioridade == vetor[m].prioridade) && (vetor[l].numero < vetor[m].numero)))) {
			m = l;
		}
		if (r < n && (vetor[r].prioridade < vetor[m].prioridade
				|| ((vetor[r].prioridade == vetor[m].prioridade) && (vetor[r].numero < vetor[m].numero)))) {
			m = r;
		}
		if (m != i) {
			HuxleyCode aux = vetor[i];
			vetor[i] = vetor[m];
			vetor[m] = aux;
			heapfy(m, vetor, n);
		}
	}

	static void bubbleup(int[] vetor) {
		int i = vetor.length - 1;
		while (i > 0 && vetor[i] >= vetor[(i - 1) / 2]) {
			int a = vetor[i];
			vetor[i] = vetor[(i - 1) / 2];
			vetor[(i - 1) / 2] = a;
			i = (i - 1) / 2;
		}
	}

	static void inserir(int num, int prio, HuxleyCode[] vetor, int n, int original) {

		int i = n - 1;
		HuxleyCode teste = new HuxleyCode(num, prio, original);
		vetor[i] = teste;

		
		while (i != 0 && ((vetor[pais(i)].prioridade > vetor[i].prioridade)
				|| (vetor[pais(i)].prioridade == vetor[i].prioridade && vetor[pais(i)].numero > vetor[i].numero))) {

			HuxleyCode aux = vetor[i];
			vetor[i] = vetor[pais(i)];
			vetor[pais(i)] = aux;

			i = pais(i);
		}
	}

	static HuxleyCode delete(HuxleyCode[] vetor, int n) {

		if (n == 0) {
			vetor[0] = null;

		}

		HuxleyCode aux1 = vetor[0];
		vetor[0] = vetor[n];
		vetor[n] = null;
		n--;
		heapfy(0, vetor, n);

		return aux1;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		HuxleyCode[] heap = new HuxleyCode[10];

		int size = 0;

		int[] Nprioridades = new int[10];
		int[] Ntempo = new int[10];
		int[] Nrodadas = new int[10];

		int ncpu = in.nextInt();

		HuxleyCode[] cpu = new HuxleyCode[ncpu];
		int[] Ncpu = new int[ncpu];

		String comando = in.next();

		while (!comando.equals("END")) {

			if (comando.equals("NEW")) {
				int num = in.nextInt();
				int prio = in.nextInt();
				size++;
				inserir(num, prio, heap, size, prio);
				Nprioridades[prio]++;

			} else if (comando.equals("STA")) {
				int num = in.nextInt();
				String nome = in.next();

				if (nome.equals("O")) {
					if(cpu[num]!=null) {
						Ntempo[cpu[num].original] = Ntempo[cpu[num].original] + (20 - cpu[num].prioridade);
						Ncpu[num] = Ncpu[num] + (20 - cpu[num].prioridade);
						cpu[num] = null;
						
					}

				} else {

					Ncpu[num] = Ncpu[num] + (20 - cpu[num].prioridade);
					Ntempo[cpu[num].original] = Ntempo[cpu[num].original] + (20 - cpu[num].prioridade);
					if (cpu[num].prioridade < 9) {
						cpu[num].prioridade = cpu[num].prioridade + 1;
					}
					size++;
					inserir(cpu[num].numero, cpu[num].prioridade, heap, size, cpu[num].original);

					cpu[num] = null;

				}

			}

			for (int i = 0; i < cpu.length; i++) {

				if (cpu[i] == null && size > 0) {

					cpu[i] = heap[0];
					Nrodadas[heap[0].original] = Nrodadas[heap[0].original] + 1;

					delete(heap, size - 1);
					size--;
				}
			}

			comando = in.next();

		}

		System.out.println("STATS BY PRIORITY");
		System.out.println();

		System.out.println("0: " + Nprioridades[0] + " " + Ntempo[0] + " " + Nrodadas[0]);
		System.out.println("1: " + Nprioridades[1] + " " + Ntempo[1] + " " + Nrodadas[1]);
		System.out.println("2: " + Nprioridades[2] + " " + Ntempo[2] + " " + Nrodadas[2]);
		System.out.println("3: " + Nprioridades[3] + " " + Ntempo[3] + " " + Nrodadas[3]);
		System.out.println("4: " + Nprioridades[4] + " " + Ntempo[4] + " " + Nrodadas[4]);
		System.out.println("5: " + Nprioridades[5] + " " + Ntempo[5] + " " + Nrodadas[5]);
		System.out.println("6: " + Nprioridades[6] + " " + Ntempo[6] + " " + Nrodadas[6]);
		System.out.println("7: " + Nprioridades[7] + " " + Ntempo[7] + " " + Nrodadas[7]);
		System.out.println("8: " + Nprioridades[8] + " " + Ntempo[8] + " " + Nrodadas[8]);
		System.out.println("9: " + Nprioridades[9] + " " + Ntempo[9] + " " + Nrodadas[9]);

		System.out.println();
		System.out.println("STATS BY CPU");
		System.out.println();

		for (int i = 0; i < Ncpu.length; i++) {
			System.out.println(i + ": " + Ncpu[i]);
		}

	}

}