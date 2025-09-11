public class Cliente extends Usuario {
    private String numeroCliente;

    public Cliente(Long id, String situacao, DadosPessoais dadosPessoais, String nomeUsuario, String senha, String numeroCliente) {
        super(id, situacao, dadosPessoais, nomeUsuario, senha);
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
