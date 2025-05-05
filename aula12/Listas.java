/*1 - Crie uma lista (List) de números inteiros chamada numeros.
2 - Adicione os seguintes números à lista: 1, 10, 20, 21, 30, 40, 50.
3 - Verifique se o número 30 está presente na lista. Mostre uma mensagem.
4 - Verifique se o número 15 está presente na lista. Mostre uma mensagem.
5 - Adicione o número 60 à lista.
6 - Mostre a lista após as operações de adição e remoção.
7 - Ordene a lista em ordem crescente. Mostre a lista.
8 - Ordene a lista em ordem decrescente. Mostre a lista.
9 - Crie uma nova lista chamada numerosPares.
10 - Adicione apenas os numeros pares da lista numeros à lista numerosPares.
11 - Mostre a lista numerosPares.
12 - Esvazie as listas criadas. Mostre as listas após a limpeza para verificar se as mesmas estão vazias. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // 1 - Crie uma lista (List) de números inteiros chamada numeros.
        List<Integer> numeros = new ArrayList<>();

        // 2 - Adicione os seguintes números à lista: 1, 10, 20, 21, 30, 40, 50.
        Collections.addAll(numeros, 1, 10, 20, 21, 30, 40, 50);

        // 3 - Verifique se o número 30 está presente na lista. Mostre uma mensagem.
        if (numeros.contains(30)) {
            System.out.println("O número 30 está presente na lista.");
        } else {
            System.out.println("O número 30 NÃO está presente na lista.");
        }

        // 4 - Verifique se o número 15 está presente na lista. Mostre uma mensagem.
        if (numeros.contains(15)) {
            System.out.println("O número 15 está presente na lista.");
        } else {
            System.out.println("O número 15 NÃO está presente na lista.");
        }

        // 5 - Adicione o número 60 à lista.
        numeros.add(60);

        // 6 - Mostre a lista após as operações de adição e verificação.
        System.out.println("Lista após adição do número 60:");
        System.out.println(numeros);

        // 7 - Ordene a lista em ordem crescente. Mostre a lista.
        Collections.sort(numeros);
        System.out.println("Lista em ordem crescente:");
        System.out.println(numeros);

        // 8 - Ordene a lista em ordem decrescente. Mostre a lista.
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista em ordem decrescente:");
        System.out.println(numeros);

        // 9 - Crie uma nova lista chamada numerosPares.
        List<Integer> numerosPares = new ArrayList<>();

        // 10 - Adicione apenas os números pares da lista numeros à lista numerosPares.
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                numerosPares.add(num);
            }
        }

        // 11 - Mostre a lista numerosPares.
        System.out.println("Lista de números pares:");
        System.out.println(numerosPares);

        // 12 - Esvazie as listas criadas. Mostre as listas após a limpeza para verificar se estão vazias.
        numeros.clear();
        numerosPares.clear();

        System.out.println("Listas após limpeza:");
        System.out.println("numeros: " + numeros);
        System.out.println("numerosPares: " + numerosPares);
    }
}

