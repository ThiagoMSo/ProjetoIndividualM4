import java.util.ArrayList;

class BibliotecaDeMidias {
    private ArrayList<Midia> midias;
    private ArrayList<String> usuarios;
    private ArrayList<Playlist> playlists;

    public BibliotecaDeMidias() {
        midias = new ArrayList<Midia>();
        usuarios = new ArrayList<String>();
        playlists = new ArrayList<Playlist>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void removerMidia(int indice) {
        midias.remove(indice);
    }

    public void adicionarUsuario(String usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(int indice) {
        usuarios.remove(indice);
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removerPlaylist(int indice) {
        playlists.remove(indice);
    }

    public void tocarPlaylist(int indice) {
        Playlist playlist = playlists.get(indice);
        for (int i = 0; i < playlist.getTamanho(); i++) {
            Midia midia = playlist.getMidiaAtual();
            System.out.println("Tocando: " + midia.getTitulo() + " - " + midia.getAno() + " - " + midia.getGenero());
            playlist.proximaMidia();
        }
    }
}