package OrientacaoPorObjetos.Principal;

import OrientacaoPorObjetos.Screenmatch.modelos.Filme;
import OrientacaoPorObjetos.Screenmatch.modelos.Serie;
import OrientacaoPorObjetos.Screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class principalComListas {
    public static void main(String[] args) {
        Filme meufilme = new Filme("O poderoso chefão", 1970);
        meufilme.avalia(6);
        Filme outroFilme = new Filme("Carros", 2005);
        outroFilme.avalia(9);
        Filme filmeDoZe = new Filme("Incriveis", 2004);
        filmeDoZe.avalia(10);
        Serie horaDeAventura = new Serie("Hora de aventura", 2010);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoZe);
        lista.add(meufilme);
        lista.add(outroFilme);
        lista.add(horaDeAventura);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());

        }
    }
}
