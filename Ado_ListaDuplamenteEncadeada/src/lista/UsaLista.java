package lista;

import java.util.Scanner;

public class UsaLista {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Deseja utilizar uma lista do tipo Pilha [1] ou Fila [2]");
		int opcao = teclado.nextInt();
		if (opcao == 1) {
			inserePilha();
		} else {
			insereFila();
		}
	}
	
	private static void insereFila() {
		int[] fila = new int[3];
		int size = 3;
        int op;
        Scanner teclado = new Scanner(System.in);
        int n = 12;
        while (true) {
            System.out.print("Opção<< ");
            op=teclado.nextInt();

            switch(op){
                case 1:  Fila.enqueue(size, n);
                break;
                
                case 2: Fila.dequeue(size);
                break;
                
                case 3: System.exit(0);
                break;
                
                default: System.out.println("Opção inválida!");
            }
            Fila.exibe(size);
            n++;
        }

	}
	
	private static void inserePilha() {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			System.out.println("Escolha a opção!");
			System.out.println("[1] - Inserir\n[2] - Remover" + "\n[3] - Topo\n[4] - Pilha vazia"
					+ "\n[5] - Quantidade de elementos" + "\n[6] - Sair\n");
			System.out.print("<< ");
			int opc = teclado.nextInt();
			switch (opc) {
			case 1:
				System.out.print("Digite o valor: ");
				int n = teclado.nextInt();
				Pilha.push(n);
				break;

			case 2:
				try {
					int r = Pilha.pop();
					System.out.println("Valor " + r + " removido!");
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				try {
					System.out.println(Pilha.top() + " está no topo!");
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				System.out.println(Pilha.empty());
				break;

			case 5:
				try {
					System.out.println("Quantidade de elementos: " + Pilha.size());
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Operação inválida!");
			}
		}
	}

}
