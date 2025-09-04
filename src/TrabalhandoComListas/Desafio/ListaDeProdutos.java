package TrabalhandoComListas.Desafio;

import java.util.ArrayList;

public class ListaDeProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> listaProduto = new ArrayList<>();

        Produto produto1 = new Produto("Café",30,7);
        Produto produto2 = new Produto("bife",20,4);
        Produto produto3 = new Produto("Arroz",23,6);
        Produto produto4 = new Produto("Feijão",15,9);


        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto4);

        System.out.println("Tamanho da lista: " + listaProduto);
        System.out.println("Produto: " + listaProduto.get(0).getNome());

        for (Produto produto : listaProduto) {
            System.out.println(produto);
        }

        Produto produtoNovo = new Produto("Novo produto", 15.99, 5);
        System.out.println(produtoNovo);


       ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C" , 12.75, 2, "2023-02-12");
        System.out.println(produtoPerecivel);

    }
}
