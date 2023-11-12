package QuickSort;

public class QuickSort {

    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(array, inicio, fim);
            quickSort(array, inicio, posicaoPivo - 1); // Ordena a subárvore à esquerda do pivo
            quickSort(array, posicaoPivo + 1, fim); // Ordena a subárvore à direita do pivo
        }
    }
    public static int separar(int[] array, int inicio, int fim) {
        int pivo = array[inicio];
        int i = inicio + 1;
        while (i <= fim) {
            if (array[i] <= pivo)
                i++;
            else if (pivo < array[fim])
                fim--;
            else {
                int troca = array[i];
                array[i] = array[fim];
                array[fim] = troca;
                i++;
                fim--;
            }
        }
        array[inicio] = array[fim];
        array[fim] = pivo;
        return fim; // Retorna a posição final do pivô
    }
    public void printArray(int[] array) {
        for(int value : array) { // Percorre o array
            System.out.print(value + " "); // Exibe o valor atual
        }
        System.out.println(); // Pula uma linha
    }
}
