package TrabalhandoComListas.Desafio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Zé", 21);
        Pessoa pessoa2 = new Pessoa("Ingrid" , 18);
        Pessoa pessoa3 = new Pessoa("Gabriel", 20);




        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanaho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).toString());
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
