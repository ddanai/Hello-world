import java.util.Arrays;

public class SelectionSort <T extends Comparable<T>> {
    
    /**
    * Sorts arr with out modifying the original.
    */
    public static <T extends Comparable <T>> void sort(T[] arr) {
        
        //Copy values into a new array.
        /*T[] x = new T[arr.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = arr[i];
        }*/
        
        //Place the next smallest value into each index.
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr, j, smallest)){
                    smallest = j;
                }
            }
            
            swap(arr, i, smallest);
        }
    }
    
      private static <T extends Comparable <T>> boolean less(T[] arr, int a, int b){
        return arr[a].compareTo(arr[b]) < 0;
    }
    
    /*Swap index a and b in arr */
    private static <T extends Comparable <T>>void swap(T[] arr, int a, int b) {
      T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    /* Test client */
    public static void main(String[] args) {
        Integer[] arr = {18, -19, 2, -6, -17, -3, 0, -4, 18, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}