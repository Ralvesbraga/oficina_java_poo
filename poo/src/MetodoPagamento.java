public interface MetodoPagamento {
    double calcularValorComTaxa(double valorBase);

    String pagar(double valorBase);
}
