package strategy;

public class IP2 implements Imposto {
	@Override
	public double calculaOrcamento(double orcamento) {
		return orcamento * 0.15;
	}
}
