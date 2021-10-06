package sorting_algorithms;

public class bubble_Sort {
    int[] intArray = {20, 35, -15, 7, 55, 1, -22};
    
    public static void main(String[] args) {
        doSorting();

        printSortedArray();
    }
    
    private void doSorting() {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (i != j && intArray[i] > intArray[i + 1]) {
                    swapElements(intArray, i, i + 1);
                }
            }
        }
    }
    
    private void printSortedArray() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    private static void swapElements(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
