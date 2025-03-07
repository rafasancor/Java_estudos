//Escreva um programa que mostre o resultado da série: 1/100 + 2/99 + 3/98 + 4/97 + ... + 100/1.

class SerieNumDen {
    public static void main(String[] args) {
        float numerador = 1;
        float denominador = 100;
        float soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%.0f / %.0f\n", numerador, denominador);
            soma = soma + numerador/ denominador;
            
            numerador++;
            denominador--;
            
        }
        
        System.out.printf("Resultado da soma: %.2f", soma);
        
    }
}