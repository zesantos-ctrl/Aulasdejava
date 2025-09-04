package OrientacaoPorObjetos.Principal;

import OrientacaoPorObjetos.Screenmatch.calculo.Recomendacao;
import OrientacaoPorObjetos.Screenmatch.modelos.Episodio;
import OrientacaoPorObjetos.Screenmatch.modelos.Filme;
import OrientacaoPorObjetos.Screenmatch.modelos.Serie;
import OrientacaoPorObjetos.Screenmatch.calculo.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFicha();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avalições: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegarMedia());


        Serie horaDeAventura  = new Serie("Hora de aventura", 2010);
        horaDeAventura.exibirFicha();
        horaDeAventura.setTemporadas(10);
        horaDeAventura.setEpisodiosPorTemporadas(283);
        horaDeAventura.setMinutosPorEpisodios(11);
        System.out.println("Duração da serie: " + horaDeAventura.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Carros", 2005);
        outroFilme.setDuracaoEmMinutos(120);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(horaDeAventura);
        System.out.println(calculadora.getTempoTotal());


        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(horaDeAventura);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        //começo de arrayList
        Filme filmeDoZe = new Filme("Incriveis", 2004);
        filmeDoZe.setDuracaoEmMinutos(200);
        filmeDoZe.avalia(9);

        ArrayList<Filme> listasDeFilmes = new ArrayList<>();
        listasDeFilmes.add(filmeDoZe);
        listasDeFilmes.add(meuFilme);
        listasDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listasDeFilmes.size());
        System.out.println("Primeiro filme: " + listasDeFilmes.get(0).toString());


    }
}
