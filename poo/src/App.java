public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Smart TV");
        produto.setPreco(1000.00);
        produto.setCategoriaProduto(ECategoriaProduto.valueOf("ELETRONICOS"));
        System.out.println(produto.getCategoriaProduto());
        produto.exibirDetalhes();
        
        
        produto.exibirDetalhes();

        produto.aplicarDesconto(101);
        produto.exibirDetalhes();
    }
}
