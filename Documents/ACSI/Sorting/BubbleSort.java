public class BubbleSort <T extends Comparable <T>> {
    public static <T extends Comparable <T>> T[] sort(T[] arr) {
        /*T[] x = (T[])new Comparable[arr.length];
        for (int i = 0; i < arr.length; i++) {
            x[i] = arr[i];
        */}
        
        for (int i = 0; i < arr.length; i++) {
            boolean swapMade = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if less(arr, j, j+1) {
                    exch(arr, j, j + 1);
                    swapMade = true;
                }
            }
            if (!swapMade) break;
        }
        
        return arr;
    }
    
    private static <T extends Comparable <T>> void exch(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
      private static <T extends Comparable <T>> boolean less(T[] arr, int a, int b){
        return arr[a].compareTo(arr[b]) < 0;
    }
    
    public static void main(String[] args) {
        Integer[] x = {-17, -3, 0, 18, 4, 2, -6, -19, 8, 18};
        Integer[] sorted = sort(x);
        
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}