package funcional.desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //item 1 e 2 do exercicio
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        //mockando
        produto1.setNome("Note");produto1.setPreco(12000);produto1.setCategoria("eletrônicos");
        produto1.setAvaliacao(5);produto1.setEmEstoque(true);

        produto2.setNome("agenda");produto2.setPreco(120);produto2.setCategoria("papelaria");
        produto2.setAvaliacao(4);produto2.setEmEstoque(true);

        produto3.setNome("Note");produto3.setPreco(12000);produto3.setCategoria("eletrônicos");
        produto3.setAvaliacao(5);produto3.setEmEstoque(true);

        //lista
        List<Produto> lista = Arrays.asList(produto1, produto2, produto3);

        //montando logica do fliter separado so pra ver como fica
        Predicate<Produto> criterio = p -> p.isEmEstoque() && p.getAvaliacao() >= 4;

        List<Produto> listaFinal = lista.stream()
                .filter(criterio)
                .map(p -> {
                    Produto novoProduto = new Produto();
                    double precoFinal;
                    if(p.getCategoria().equals("eletrônicos")){
                        precoFinal = p.getPreco() * 0.85;
                    } else {
                        precoFinal = p.getPreco() * 0.90;
                    }
                    novoProduto.setNome(p.getNome());
                    novoProduto.setPreco(precoFinal);
                    novoProduto.setCategoria(p.getCategoria());
                    return novoProduto;
                })
                .toList();

        listaFinal.forEach(System.out::println);

        //item 03 do exercicio
        Map<String, List<Produto>> grupo = listaFinal.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
        grupo.forEach((categoria, pFinal) ->{
            System.out.println(categoria+":");
            pFinal.forEach(System.out::println);
        });

        //item 4 do exercicio
        System.out.println("Ranking:");
        List<Produto> ranking = listaFinal.stream()
                .sorted(Comparator.comparingDouble(Produto::getPreco))
                .limit(2)
                .toList().reversed();
        ranking.forEach(System.out::println);
    }
}
