public class Pix implements MetodoPagamento {
    private static final double TAXA_FIXA = 0;

    @Override
    public double calcularValorComTaxa(double valorBase) {
        return valorBase + TAXA_FIXA;
    }

    @Override
    public String pagar(double valorBase) {
        double valorFinal = this.calcularValorComTaxa(valorBase);
        return String.format("QRCode Pix gerado no valor de %.2f.", valorFinal);
    }
    
}
