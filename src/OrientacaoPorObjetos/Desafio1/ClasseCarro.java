package OrientacaoPorObjetos.Desafio1;

public class ClasseCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Mazda";
        meuCarro.ano = 1978;
        meuCarro.cor = "Vermelho";


        meuCarro.exibeFichaTecnica();
        int idade = meuCarro.calcularIdade(2023);
        System.out.println(" " + idade + " anos" );
    }
}
