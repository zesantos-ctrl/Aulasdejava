package OrientaçãoPorObjetos.Desafio2;

public class Pessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Luri");
        pessoa.setIdade(25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.verificarIdade();
    }


}

