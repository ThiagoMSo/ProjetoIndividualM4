import java.time.LocalDate;

public class Main {
            public static void main(String[] args) {
                // Criando músicos
                Musico musico1 = new Musico("Lady Gaga", "28 de março de 1986", "430 prêmios", "Feminino", "Filme1"  );
                Musico musico2 = new Musico("Beyoncé", "4 de setembro de 1981", "32 gramofones", "Feminino", "Filme2");

                // Criando atores
                Ator ator1 = new Ator("Lady G", "10/05/1980", "5", "Feminino", "Graduação em Atuação");
                Ator ator2 = new Ator("By", "10/05/1970", "5", "Feminino", "Graduação em Atuação");

                // Criando músicas
                Musica musica1 = new Musica("Telephone", 2009, "Pop", musico1, 9.3);
                Musica musica2 = new Musica("Telephone 2", 2024, "Rock", musico2, 4.2);

                // Criando filmes
                Filme filme1 = new Filme("Telephone", 2009, "Amizade", 16, new Ator[]{ator1, ator2}, new String[]{"Diretor 1"}, "Estúdio 1", "curta-metragem começa como uma continuação do final de \"Paparazzi\", depois de Gaga ser presa por homicídio do namorado por envenenamento. Na cena, a cantora é encaminhada para uma prisão feminina, direcionada para a sua cela por duas agentes penitenciárias, que a despem");
                Filme filme2 = new Filme("Filme 2", 2020, "Comédia", 12, new Ator[]{ator2}, new String[]{"Diretor 2"}, "Estúdio 2", "Sinopse 2");

                // Criando a playlist
                Playlist playlist = new Playlist("Minha playlist");
                playlist.adicionarMidia(musica1);
                playlist.adicionarMidia(musica2);
                playlist.adicionarMidia(filme1);
                playlist.adicionarMidia(filme2);

                // Exibindo as informações da playlist
                System.out.println("Informações da playlist:");
                System.out.println("Título: " + playlist.getTitulo());
                System.out.println("Total de duração: " + playlist.getTotalDuracao() + " minutos");
                System.out.println("Mídias na playlist:");
                for (Midia midia : playlist.getMidias()) {
                    System.out.println(midia);
                }

                // Chamar o método toString() para verificar se a representação em String está correta
                System.out.println(ator1.toString());

                // Chamar o método toString() para verificar se a representação em String está correta
                System.out.println(musico1.toString());

                // Chamar o método toString() para verificar se a representação em String está correta
                System.out.println(filme1.toString());

                // Chamar o método toString() para verificar se a representação em String está correta
                System.out.println(musica1.toString());
            }
}