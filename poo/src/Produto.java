public class Produto {
    private Long id;
    private String nome;
    private Double preco;
    private ECategoriaProduto categoriaProduto;

    public Produto(Long id, String nome, Double preco, ECategoriaProduto categoriaProduto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto(){
    }

    public double aplicarDesconto(double percentual) {
        double desconto = preco * (percentual/100);
        this.setPreco(preco - desconto);
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + preco);
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public Long getId() {
        return id;
    }

    public ECategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço do produto deve ser maior que 0!");
        }
    }

    public void setCategoriaProduto(ECategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

}
