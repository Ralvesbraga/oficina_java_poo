public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Smart TV");
        produto.setPreco(1000.00);
        produto.setCategoriaProduto(ECategoriaProduto.valueOf("ELETRONICOS"));
        System.out.println(produto.getCategoriaProduto());
        produto.exibirDetalhes();
        
        produto.aplicarDesconto(101);
        produto.exibirDetalhes();

        // Instanciando diferentes métodos de pagamento
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento pix = new Pix();
        System.out.println(pix.pagar(produto.getPreco()));
        System.out.println(cartao.pagar(produto.getPreco()));


        // Faz o casting (conversão) de Cliente para Usuario
        Usuario cliente = new Cliente(1l, null, null, "emanuelgameplays", "123", "12345");
    }
}
