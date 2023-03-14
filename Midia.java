import java.util.Arrays;

class Midia {
    private String titulo;
    private int ano;
    private String genero;

    public Midia(String titulo, int ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

class Musica extends Midia {
    private Musico musico;
    private double duracao;

    public Musica(String titulo, int ano, String genero, Musico musico, double duracao) {
        super(titulo, ano, genero);
        this.musico = musico;
        this.duracao = duracao;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + getTitulo() + '\'' +
                ", ano=" + getAno() +
                ", genero='" + getGenero() + '\'' +
                ", musico=" + musico +
                ", duracao=" + duracao +
                '}';
    }
}

class Filme extends Midia {
    private Ator[] atores;
    private String[] diretores;
    private String produtor;

    public Filme(String titulo, int ano, String genero, int i, Ator[] atores, String[] diretores, String produtor, String s) {
        super(titulo, ano, genero);
        this.atores = atores;
        this.diretores = diretores;
        this.produtor = produtor;
    }

    public Ator[] getAtores() {
        return atores;
    }

    public void setAtores(Ator[] atores) {
        this.atores = atores;
    }

    public String[] getDiretores() {
        return diretores;
    }

    public void setDiretores(String[] diretores) {
        this.diretores = diretores;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + getTitulo() + '\'' +
                ", ano=" + getAno() +
                ", genero='" + getGenero() + '\'' +
                ", atores=" + Arrays.toString(atores) +
                ", diretores=" + Arrays.toString(diretores) +
                ", produtor='" + produtor + '\'' +
                '}';
    }
}
