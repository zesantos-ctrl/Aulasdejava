package OrientacaoPorObjetos.Screenmatch.calculo;

import OrientacaoPorObjetos.Screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


   public void inclui(Titulo titulo) {
       this.tempoTotal += titulo.getDuracaoEmMinutos();
   }


    public int getTempoTotal() {
        return tempoTotal;
    }
}
