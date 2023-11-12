package BubbleSort;

public class BubbleSort {
    public void BubbleSort(int[] array){
        // Bubble Sort - O(n^2)
        int aux; // armazena os valores temporariamente
        for (int i=0; i < array.length; ++i){ //compara para quando ser necessario fazer a troca
            for (int j=i; j < array.length; ++j){ // percorre o array
                if (array[i]>array[j]){ //compara se o valor da posição i é maior que o valor da posição j
                    aux = array[i]; //armazena o valor da posição i em aux
                    array[i] = array[j]; //armazena o valor da posição j na posição i
                    array[j] = aux; //armazena o valor de aux na posição j
                }
            }
            // Imprime o array após cada iteração externa
            System.out.print("Iteração " + (i + 1) + ": ");
            printArray(array);
        }
    }

    public void printArray(int[] array) {
        for(int value : array) { // Percorre o array
            System.out.print(value + " "); // Exibe o valor atual
        }
        System.out.println(); // Pula uma linha
    }
}

