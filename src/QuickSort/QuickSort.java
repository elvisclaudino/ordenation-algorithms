package QuickSort;

public class QuickSort {
    public void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(array, inicio, fim); // Obtém a posição do pivô

            // Imprime o array após cada iteração
            System.out.print("Iteração: ");
            printArray(array);

            quickSort(array, inicio, posicaoPivo - 1); // Ordena a subárvore à esquerda do pivo
            quickSort(array, posicaoPivo + 1, fim); // Ordena a subárvore à direita do pivo
        }
    }
    public int separar(int[] array, int inicio, int fim) {
        int pivo = array[fim]; // Define o pivô como o último elemento do array
        int i = inicio; // Define o índice i como o primeiro elemento do array

        for (int j = inicio; j < fim; j++) { // Percorre o array da posição inicial até a posição final
            if (array[j] <= pivo) { // Se o elemento atual for menor ou igual ao pivô
                int troca = array[i]; // Troca o elemento atual com o elemento na posição i
                array[i] = array[j]; // Troca o elemento atual com o elemento na posição i
                array[j] = troca; // Troca o elemento atual com o elemento na posição i
                i++; // Incrementa o índice i
            }
        }

        int troca = array[i]; // Troca o elemento na posição i com o elemento na posição final
        array[i] = array[fim]; // Troca o elemento na posição i com o elemento na posição final
        array[fim] = troca; // Troca o elemento na posição i com o elemento na posição final
        return i; // Retorna a posição final do pivô
    }

    public void printArray(int[] array) { // Exibe o array
        for (int value : array) { // Para cada elemento do array
            System.out.print(value + " "); // Exibe o elemento
        }
        System.out.println(); // Pula uma linha
    }
}
