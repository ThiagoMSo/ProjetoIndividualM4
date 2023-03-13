import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando alguns artistas
        Musico musico1 = new Musico("Beyoncé", "04/09/1981", "28 Grammys", "Feminino", "Vocal");
        Musico musico2 = new Musico("Ed Sheeran", "17/02/1991", "4 Grammys", "Masculino", "Instrumento");

        // Criando algumas mídias
        Musica musica1 = new Musica("Crazy in Love", 2003, "Pop", musico1, 3.56);
        Musica musica2 = new Musica("Shape of You", 2017, "Pop", musico2, 3.54);


        // Criando uma playlist e adicionando algumas mídias
        Playlist playlist1 = new Playlist();
        playlist1.adicionarMidia(musica1);
        playlist1.adicionarMidia(musica2);
        // Criando uma biblioteca de mídias e adicionando as mídias
        BibliotecaDeMidias biblioteca = new BibliotecaDeMidias();
        biblioteca.adicionarMidia(musica1);
        biblioteca.adicionarMidia(musica2);

        // Adicionando usuários e playlists
        biblioteca.adicionarUsuario("João");
        biblioteca.adicionarUsuario("Maria");
        biblioteca.adicionarPlaylist(playlist1);

        // Tocando a primeira playlist
        biblioteca.tocarPlaylist(0);

        // Chamar o método toString() para verificar se a representação em String está correta
        System.out.println(musico1.toString());

        // Chamar o método toString() para verificar se a representação em String está correta
        System.out.println(musica1.toString());

    }
}