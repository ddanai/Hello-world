import java.util.Arrays;

public class SelectionSort <T extends Comparable<T>> {
    
    /**
    * Sorts arr with out modifying the original.
    */
    public static T[] sort(T[] arr) {
        
        //Copy values into a new array.
        T[] x = new T[arr.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = arr[i];
        }
        
        //Place the next smallest value into each index.
        for (int i = 0; i < x.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[smallest]) {
                    smallest = j;
                }
            }
            
            swap(x, i, smallest);
        }
        
        return x;
    }
    
    /*Swap index a and b in arr */
    private static void swap(T[] arr, int a, int b) {
      T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    /* Test client */
    public static void main(String[] args) {
        int[] arr = {18, -19, 2, -6, -17, -3, 0, -4, 18, 8};
        System.out.println(Arrays.toString(sort(arr)));
    }
}