package lista;

public class Fila {
	private static int p = 0, u = 0, nElem = 0;
	private static Elemento inicio = null, atual, aux;

	public static void enqueue(Object object, int n) {
		if (object instanceof Integer) {
			int size = (Integer) object;
			if (!cheia(size)) {
				if (empty()) {
					inicio = new Elemento(null, null, n);
					aux = inicio;
					nElem++;
				} else {
					atual = new Elemento(null, aux, n);
					aux.setProx(atual);
					aux = atual;
					nElem++;
				}
			} else {
				System.out.println("Fila cheia");
			}
		}
		
	}

	public static boolean cheia(int size) {
		return nElem == size;
	}

	public static void dequeue(int size) {
		if (!empty()) {
			Elemento e = inicio;
			while (e != null) {
				if ((Integer) e.getObjeto() == 0) {					
					e = e.getProx();
				} else {
					System.out.println(e.getObjeto() + " removido da fila!");
					inicio = e.getProx();
					aux = inicio;
					nElem--;
					break;
				}
			}
		} else {
			System.out.println("Fila vazia!");
		}
	}

	public static boolean empty() {
		return nElem == 0;
	}

	public static void exibe(int size) {
		Elemento e = inicio;
    	int count = 0;
    	
    	while (e != null) {
			System.out.println("fila[" + count + "]=" + e.getObjeto());
    		e = e.getProx();
    		count++;
    	}
	}

}
