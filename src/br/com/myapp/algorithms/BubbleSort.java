package br.com.myapp.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		//inicialização do array
		int[] numbers = {64, 34, 25, 12, 22, 11, 90};
		
		//Loop para o comprimento do array
		for(int i = 0; i < numbers.length - 1; i++) {
			
			//Loop interno para comparar e trocar elementos
			for(int j = 0; j < numbers.length - i - 1; j++) {
				
				//Verifica se o número do índice atual é maior do que o próximo
				if(numbers[j] > numbers[j + 1]) {
					
					//Substitui o valor do índice atual pelo próximo
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					
				}
				
			}
			
		}
		
		System.out.println("Array ordenada: ");
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i] + " ");
			
		}
		
		System.out.println();
		
	}
	
}
