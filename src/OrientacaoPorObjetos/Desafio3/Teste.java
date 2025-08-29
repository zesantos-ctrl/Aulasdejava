package OrientacaoPorObjetos.Desafio3;

public class Teste {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.definirModelo("s15");
        carro.definirPreco(30000,40000,60000);
        carro.exibirFicha();
    }
}
