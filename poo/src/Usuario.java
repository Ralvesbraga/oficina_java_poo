public class Usuario {
    private Long id;
    private String situacao;
    private DadosPessoais dadosPessoais;
    private String nomeUsuario;
    private String senha;

    public Usuario(Long id,
        String situacao, 
        DadosPessoais dadosPessoais,
        String nomeUsuario,
        String senha) {
            this.id = id;
            this.situacao = situacao;
            this.dadosPessoais = dadosPessoais;
            this.nomeUsuario = nomeUsuario;
            this.senha = senha;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    
}