package InsertionSort;

public class InsertionSort {
    public void insertionSort(int[] array) {
        int vetorLength = array.length; // Pega o tamanho do array

        for(int i = 1; i < vetorLength; i++) { // Percorre o array
            int key = array[i]; // Pega o valor atual do array
            int j = i - 1; // Pega o valor anterior do array

            while (j >= 0 && array[j] > key) { // Enquanto o valor anterior for maior que o atual
                array[j + 1] = array[j]; // O valor anterior recebe o valor atual
                j--; // Decrementa o valor anterior
            }

            array[j + 1] = key; // O valor atual recebe o valor anterior

            System.out.println("Iteração " + i + ":"); // Exibe a iteração atual
            printArray(array); // Exibe o array
        }
    }

    public void printArray(int[] array) {
        for(int value : array) { // Percorre o array
            System.out.print(value + " "); // Exibe o valor atual
        }
        System.out.println(); // Pula uma linha
    }
}
