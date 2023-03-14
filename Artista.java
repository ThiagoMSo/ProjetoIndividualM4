
class Artista {
    private String nome;
    public String dataNascimento;
    protected String premiacoes;
    String genero;

    public Artista(String nome, String dataNascimento, String premiacoes, String genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

class Ator extends Artista {
        private String formacao;

    public Ator(String nome, String dataNascimento, String premiacoes, String genero, String formacao) {
        super(nome, dataNascimento, premiacoes, genero);
        this.formacao = formacao;
    }



    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}

class Musico extends Artista {
    private String atuacao;


    public Musico(String nome, String dataNascimento, String premiacoes, String genero, String atuacao) {
        super(nome, dataNascimento, premiacoes, genero);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Musico" +
                "nome='" + getNome() + '\'' +
                ", Data de Nascimento=" + getDataNascimento() +
                ", Premiações=" + getPremiacoes() + '\'' +
                ", Gênero=" + getGenero() + '\'' +
                '}';
    }
}