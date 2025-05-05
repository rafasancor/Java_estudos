/*1 - Crie um conjunto (Set) para armazenar números inteiros.
2 - Adicione cinco números 10, 20, 30, 40 e 50 ao conjunto com entradas feitas pelo usuário.
3 - Verifique se o número 30 está presente no conjunto. Mostre uma mensagem.
4 - Adicione os números 20, 60 e 70 ao conjunto.
5 - Remova o número 40 do conjunto.
6 - Mostre o tamanho atual do conjunto.
7 - Mostre os elementos do conjunto.
8 - Esvazie o conjunto. */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 - Crie um conjunto (Set) para armazenar números inteiros.
        Set<Integer> numeros = new TreeSet<>();

        //2 - Adicione cinco números 10, 20, 30, 40 e 50 ao conjunto com entradas feitas pelo usuário.
        System.out.println("Digite 5 números inteiros para adicionar ao conjunto.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número para preencher o índice " + i + ":");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        // numeros.add(10);
        // numeros.add(20);
        // numeros.add(30);
        // numeros.add(40);
        // numeros.add(50);

        // 3 - Verifique se o número 30 está presente no conjunto. Mostre uma mensagem.
        if(numeros.contains(30)){
            System.out.println("\n30 existe no conjunto.");
        }
        else{
            System.out.println("\n30 nao existe no conjunto.");
        }

        //4 - Adicione os números 20, 60 e 70 ao conjunto.
        numeros.add(20);
        numeros.add(60);
        numeros.add(70);

        //5 - Remova o número 40 do conjunto.
        numeros.remove(40);

        //6 - Mostre o tamanho atual do conjunto.
        System.out.println("Tamanho do conjunto: " + numeros.size());
        System.out.println();

        //7 - Mostre os elementos do conjunto.
        System.out.println("Mostrando elementos do conjunto: " + numeros);

        //8 - Esvazie o conjunto. */
        numeros.clear();
        System.out.println("Elementos do conjunto: " + numeros);

        if(numeros.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        }

        sc.close();
    }
}
