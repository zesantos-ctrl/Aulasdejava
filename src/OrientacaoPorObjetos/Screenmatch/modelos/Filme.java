package OrientacaoPorObjetos.Screenmatch.modelos;

import OrientacaoPorObjetos.Screenmatch.calculo.Classificado;

public class Filme extends Titulo implements Classificado {
    private String diretor;

    //arraylist
    public Filme(String nome, int anoDeLancamento) {
      super(nome,anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegarMedia() / 2;
    }


    //começo de ArrayList
    @Override
    public String toString() {
    return "Filme: " + this.getNome() +  "(" + this.getAnoDeLancamento() + ")";
    }
}