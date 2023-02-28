import java.util.Arrays;

public class Quicksort <T extends Comparable <T>> {
    
    public static <T extends Comparable <T>> void sort(T[] arr) {
        //arr = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length);
    }
    
    /** Recursively sor the array */
    private static <T extends Comparable <T>> void sort(T[] arr, int from, int to) {
        if (to - from < 2) return;
        
        int pivot = partition(arr, from, to);
        sort(arr, from, pivot);
        sort(arr, pivot + 1, to);
    }
    
    /** 
    * Partition the array so that all values less than to a pivot value
    * are located on the left of the array and all greater or equal are
    * on the right of the array. Return the location of the pivot.
    */
    private static <T extends Comparable <T>> int partition(T[] arr, int from, int to) {
        T pivot = arr[from]; //Choose the first element as the pivot.
        int lf = from, rf = to;
        
        //Move all small elements to the left and large to the right.
        while (true) {
            while (less(arr, arr[++lf], pivot)) //Probe lf to the right.
                if (lf == to - 1) break;
            while (less(arr, pivot, arr[--rf])) //Probe rf to the left.
                if (rf == from) break;
            
            if (rf < lf) break; //If the fingers cross, stop.
            swap(arr, lf, rf);
        }
        
        swap(arr, rf, from); //Swap the pivot into position.
        
        return rf;
    }
    
    /* Swap arr[a] and arr[b] */
    private static <T extends Comparable <T>>void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
      private static <T extends Comparable <T>> boolean less(T[] arr, T a, T b){
        return a.compareTo(b) < 0;
    }
    
    public static void main(String[] args) {
        Integer[] arr = {18, -19, 2, -6, -17, -3, 0, -4, 18, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}