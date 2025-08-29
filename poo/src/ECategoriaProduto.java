public enum ECategoriaProduto {
    ELETRONICOS("Eletrônicos"),
    ELETRODOMESTICOS("Eletrodomésticos");

    String nome;

    ECategoriaProduto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
