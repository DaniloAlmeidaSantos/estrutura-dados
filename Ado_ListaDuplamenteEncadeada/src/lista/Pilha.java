package lista;

public class Pilha {
    private static Elemento inicio = null, atual, aux;

    public static void push(Object object) {
    	if (object instanceof Integer) {
    		if (empty()) {
    			inicio = new Elemento(null, null, object);
    			aux = inicio;
    		} else {
    			atual = new Elemento(null, aux, object);
    			aux.setProx(atual);
    			aux = atual;
    		}
    	} else {
    		System.out.println("Objeto inválido!");
    	}
    }

    public static int pop() {
    	if (!empty()) {
    		int n = (Integer) atual.getObjeto();
    		atual.setAnt(null);
    		atual.setProx(null);
    		return n;
    	} else {
            throw new IllegalArgumentException("Pilha vazia");
    	}
    }
    
    public static boolean empty() {
    	return inicio == null;
    }
    
    public static int size() {
    	Elemento e = inicio;
    	int count = 0;
    	
    	while (e != null) { 
    		e = e.getProx();
    		count++;
    	}
    	
    	return count;
    }
    
    
    public static int top() {
    	return (Integer) atual.getObjeto();
    }
}
