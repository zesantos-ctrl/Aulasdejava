package OrientacaoPorObjetos;

import OrientacaoPorObjetos.Screenmatch.modelos.Filme;
import OrientacaoPorObjetos.Screenmatch.modelos.Serie;
import OrientacaoPorObjetos.Screenmatch.calculo.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFicha();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avalições: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegarMedia());


        Serie horaDeAventura  = new Serie();
        horaDeAventura.setNome("Hora de aventura");
        horaDeAventura.setAnoDeLancamento(2010);
        horaDeAventura.exibirFicha();
        horaDeAventura.setTemporadas(10);
        horaDeAventura.setEpisodiosPorTemporadas(283);
        horaDeAventura.setMinutosPorEpisodios(11);
        System.out.println("Duração da serie: " + horaDeAventura.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Carros");
        outroFilme.setAnoDeLancamento(2005);
        outroFilme.setDuracaoEmMinutos(120);






        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());





    }
}
