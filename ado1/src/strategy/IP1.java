package strategy;

public class IP1 implements Imposto {
	@Override
	public double calculaOrcamento(double orcamento) {
		return orcamento * 0.10;
	}
}
