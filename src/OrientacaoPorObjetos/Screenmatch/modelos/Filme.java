package OrientacaoPorObjetos.Screenmatch.modelos;

import OrientacaoPorObjetos.Screenmatch.calculo.Classificado;

public class Filme extends Titulo implements Classificado {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}