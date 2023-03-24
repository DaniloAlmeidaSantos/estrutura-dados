package strategy;

public class IP3 implements Imposto {
	@Override
	public double calculaOrcamento(double orcamento) {
		return orcamento * 0.25;
	}
}
