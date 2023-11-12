package QuickSort;

public class Teste {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(); // Instancia a classe QuickSort
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28}; // Cria um array de inteiros

        // O Pivot será o ultimo elemento

        System.out.println("Array desordenado: "); // Exibe o array desordenado
        quickSort.printArray(array); // Chama o método printArray para exibir o array
        System.out.println(); // Pula uma linha

        quickSort.quickSort(array, 0, array.length - 1); // Chama o método quickSort para ordenar o array
        System.out.println(); // Pula uma linha

        System.out.println("Array ordenado: "); // Exibe o array ordenado
        quickSort.printArray(array); // Chama o método printArray para exibir o array
    }
}
