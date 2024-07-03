package sorting;
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Compare current element with next element
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, then the array is sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
