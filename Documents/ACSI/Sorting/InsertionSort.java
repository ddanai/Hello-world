import java.util.Arrays;

public class InsertionSort <T extends Comparable<T>> {
    public static T[] sort(T[] arr) {
        T[] x = Arrays.copyOf(arr, arr.length);
        
        for (int i = 1; i < x.length; i++) {
            int current = i;
            while (current > 0 && x[current] < x[current - 1]) {
                swap(x, current, current - 1);
                current--;
            }
        }
        
        return x;
    }
    
    private static void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {8, -4, 0, -3, 18, -17, -6, 2, 19, -19};
        
        System.out.println(Arrays.toString(sort(arr)));
    }
}