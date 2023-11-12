package BubbleSort;



public class Teste {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(); // Instancia a classe bubbleSort
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28}; // Cria um array de inteiros

        System.out.println("Array desordenado: "); // Exibe o array desordenado
        bubbleSort.printArray(array); // Chama o método printArray para exibir o array
        System.out.println(); // Pula uma linha

        bubbleSort.BubbleSort(array); // Chama o método BubbleSort para ordenar o array
        System.out.println(); // Pula uma linha

        System.out.println("Array ordenado: "); // Exibe o array ordenado
        bubbleSort.printArray(array); // Chama o método printArray para exibir o array
    }
}
