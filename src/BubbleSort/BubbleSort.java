package BubbleSort;

public class BubbleSort {

    public void BubbleSort(int[] array){

        // Bubble Sort - O(n^2)
        int aux; // armazena os valores temporariamente
        for (int i=0; i < array.length; ++i){ //compara para quando ser necessario fazer a troca
            for (int j=i; j < array.length; ++j){ //
                if (array[i]>array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (int i=0; i<array.length; ++i)
            System.out.println(array[i] + " ");
    }

    public void printArray(int[] array) {
        for(int value : array) { // Percorre o array
            System.out.print(value + " "); // Exibe o valor atual
        }
        System.out.println(); // Pula uma linha
    }
}

