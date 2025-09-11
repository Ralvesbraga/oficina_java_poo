public class CartaoCredito implements MetodoPagamento {
    private static final double TAXA_PERCENTUAL = 0.025;

    @Override
    public double calcularValorComTaxa(double valorBase) {
        return valorBase * (1 + TAXA_PERCENTUAL);
    }

    @Override
    public String pagar(double valorBase) {
        double valorTotal = calcularValorComTaxa(valorBase);
        return String.format("Pagamento de R$ %.2f realizado com cartão de crédito.", valorTotal);  
    }

}
