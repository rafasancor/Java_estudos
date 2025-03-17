import java.util.Scanner;
class Procura {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = {1, 2, 3, 4, 5}, num;
		boolean encontrado = false;
		System.out.print("Informe numero: ");
		num = input.nextInt();
		for(int i = 1; i < 5; i++){
			if(vetor[i] == num){
				System.out.print("Elemento encontrado no indice: " + i);
				encontrado = true;
				break;
				}
			}
		if(encontrado == false){
			System.out.print("Elemento nao encontrado!");
		}
		input.close();
	}
}