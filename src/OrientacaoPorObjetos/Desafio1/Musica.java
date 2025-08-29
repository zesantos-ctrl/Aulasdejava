package OrientacaoPorObjetos.Desafio1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0;
        this.numAvaliacoes = 0;
    }

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        if (numAvaliacoes > 0) {
            return avaliacao / numAvaliacoes;
        } else {
            return 0;
        }
    }
}
