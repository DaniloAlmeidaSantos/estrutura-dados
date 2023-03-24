package strategy;

public class UsaImposto {
	
	public static void main(String[] args) {
		ListaImposto ip1 = ListaImposto.IP1;
		ListaImposto ip2 = ListaImposto.IP2;
		ListaImposto ip3 = ListaImposto.IP3;
		
		double orcamento = 300.40;
		
		System.out.println(orcamento + ip1.retornaOrcamento(orcamento));
		System.out.println(orcamento + ip2.retornaOrcamento(orcamento));
		System.out.println(orcamento + ip3.retornaOrcamento(orcamento));
	}
	
}
