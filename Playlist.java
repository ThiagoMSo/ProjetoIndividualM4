import java.util.ArrayList;
import java.util.Collections;

class Playlist {
    private ArrayList<Midia> midias;

    private int index;
    private int tamanho;
    private String totalDuracao;
    private String titulo;

    public Playlist(String minhaPlaylist) {
        midias = new ArrayList<Midia>();
        index = 0;
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void removerMidia(int indice) {
        midias.remove(indice);
        if (index >= midias.size()) {
            index = midias.size() - 1;
        }
    }

    public Midia getMidiaAtual() {
        return midias.get(index);
    }

    public void proximaMidia() {
        index++;
        if (index >= midias.size()) {
            index = 0;
        }
    }

    public void midiaAnterior() {
        index--;
        if (index < 0) {
            index = midias.size() - 1;
        }
    }

    public void misturarMidias() {
        Collections.shuffle(midias);
        index = 0;
    }
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTotalDuracao() {

        return totalDuracao;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }
}