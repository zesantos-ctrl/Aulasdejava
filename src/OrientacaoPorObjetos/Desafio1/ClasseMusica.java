package OrientacaoPorObjetos.Desafio1;

public class ClasseMusica {
    public static void main(String[] args) {
        Musica musica = new Musica("Imprevisto","Yago Oproprio", 2022);

        musica.exibeFichaTecnica();
        musica.avalia(10);
        musica.avalia(6);

        System.out.println("Média de avaliações: " + musica.pegaMedia());

    }
}
