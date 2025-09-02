package OrientacaoPorObjetos.Screenmatch.calculo;

public class Recomendacao {

    public void filtra(Classificado classificado) {
        if (classificado.getClassificacao() >= 4) {
            System.out.println("Está entre os prefiridos do momento");
        } else if (classificado.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no memento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
