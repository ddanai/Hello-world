import java.util.Arrays;

public class InsertionSort <T extends Comparable<T>> {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        //T[] x = Arrays.copyOf(arr, arr.length);
        
        for (int i = 1; i < arr.length; i++) {
            int current = i;
            while (current > 0 && less(arr, current, current-1)) {
                swap(arr, current, current - 1);
                current--;
            }
        }
        
        return arr;
    }
    
    private static <T extends Comparable <T>>void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //arr[a].compareTo(arr[b]) return < 0 if arr[a] < arr[b] return > 0 if arr[a] > arr[b] and return 0 if arr[a] = arr[b]
    private static <T extends Comparable <T>> boolean less(T[] arr, int a, int b){
        return arr[a].compareTo(arr[b]) < 0;
    }
    
    public static void main(String[] args) {
        Integer[] arr = {8, -4, 0, -3, 18, -17, -6, 2, 19, -19};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}