import java.util.Arrays;

public class MergeSort <T extends Comparable <T>>{
    public static <T extends Comparable <T>> T[] sort(T[] arr) {
        //T[] x = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length);
        return arr;
    }
    
    private static <T extends Comparable <T>>void sort(T[] arr, int from, int to) {
        if (to - from < 2) return;
        
        // Recursively sort the left and right halves of the array.
        int mid = from + (to - from) / 2;
        sort(arr, from, mid);
        sort(arr, mid, to);
        
        // Merge the two sorted halves.
        merge(arr, from, to, mid);
    }
      private static <T extends Comparable <T>> boolean less(T[] arr, int a, int b){
        return arr[a].compareTo(arr[b]) < 0;
    }
    
    private static <T extends Comparable <T>>void merge(T[] arr, int from, int to, int mid) {
        T[] temp = (T[]) new Comparable [to - from];
        
        int leftFinger = from;
        int rightFinger = mid;
        
        
        // Merge the left and right halves of the array into temp.
        int count = 0;
        while (leftFinger < mid && rightFinger < to) {
            if (less(arr, leftFinger, rightFinger)) {
                temp[count++] = arr[leftFinger++];
            } else {
                temp[count++] = arr[rightFinger++];
            }
        }
        
        // Copy any remaining elements from the left half.
        while (leftFinger < mid) {
            temp[count++] = arr[leftFinger++];
        }
        
        // Copy any remaining elements from the right half.
        while (rightFinger < to) {
            temp[count++] = arr[rightFinger++];
        }
        
        //Copy the temp array back into the original array.
        for (int i = 0; i < temp.length; i++) {
            arr[from+i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr = {18, -19, 2, -6, -17, -3, 0, -4, 18, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}