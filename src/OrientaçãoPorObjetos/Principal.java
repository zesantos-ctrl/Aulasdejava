package OrientaçãoPorObjetos;

import OrientaçãoPorObjetos.Screenmatchmodels.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        //CTRL + CLIQUE = Navegação entre abas

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
        /*
        meuFilme.somaDasAvaliacoes = 10;
        meuFilme.totalDeAvaliacao = 1;
        System.out.println(meuFilme.pegaMedia());//encapsulamento
        */
    }
}
