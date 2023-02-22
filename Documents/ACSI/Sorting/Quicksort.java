import java.util.Arrays;

public class Quicksort <T extends Comparable <T>> {
    
    public static T[] sort(T[] arr) {
        arr = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length);
        return arr;
    }
    
    /** Recursively sor the array */
    private static void sort(T[] arr, int from, int to) {
        if (to - from < 2) return;
        
        T pivot = partition(arr, from, to);
        sort(arr, from, pivot);
        sort(arr, pivot + 1, to);
    }
    
    /** 
    * Partition the array so that all values less than to a pivot value
    * are located on the left of the array and all greater or equal are
    * on the right of the array. Return the location of the pivot.
    */
    private static int partition(T[] arr, int from, int to) {
        int pivot = arr[from]; //Choose the first element as the pivot.
        int lf = from, rf = to;
        
        //Move all small elements to the left and large to the right.
        while (true) {
            while (arr[++lf] < pivot) //Probe lf to the right.
                if (lf == to) break;
            while (arr[--rf] > pivot) //Probe rf to the left.
                if (rf == from) break;
            
            if (rf < lf) break; //If the fingers cross, stop.
            
            swap(arr, lf, rf);
        }
        
        swap(arr, rf, from); //Swap the pivot into position.
        
        return rf;
    }
    
    /* Swap arr[a] and arr[b] */
    private static void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {18, -19, 2, -6, -17, -3, 0, -4, 18, 8};
        System.out.println(Arrays.toString(sort(arr)));
    }
}