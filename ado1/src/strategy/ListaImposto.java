package strategy;

public enum ListaImposto {

	IP1 {
		public double retornaOrcamento(double orcamento) {
			Imposto imposto = new IP1();
			return imposto.calculaOrcamento(orcamento);
		}
	},
	IP2 {
		public double retornaOrcamento(double orcamento) {
			Imposto imposto = new IP2();
			return imposto.calculaOrcamento(orcamento);
		}
	},
	IP3 {
		public double retornaOrcamento(double orcamento) {
			Imposto imposto = new IP3();
			return imposto.calculaOrcamento(orcamento);
		}
	};
	
	public abstract double retornaOrcamento(double orcamento);

}
