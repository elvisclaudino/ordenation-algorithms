package InsertionSort;

public class Teste {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort(); // Instancia a classe InsertionSort
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28}; // Cria um array de inteiros

        System.out.println("Array desordenado: "); // Exibe o array desordenado
        insertionSort.printArray(array); // Chama o método printArray para exibir o array
        System.out.println(); // Pula uma linha

        insertionSort.insertionSort(array); // Chama o método insertionSort para ordenar o array
        System.out.println(); // Pula uma linha

        System.out.println("Array ordenado: "); // Exibe o array ordenado
        insertionSort.printArray(array); // Chama o método printArray para exibir o array
    }
}
