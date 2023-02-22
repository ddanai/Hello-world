public class BubbleSort <T extends Comparable <T>> {
    public static T[] sort(T[] arr) {
        T[] x = new T[arr.length];
        for (int i = 0; i < arr.length; i++) {
            x[i] = arr[i];
        }
        
        for (int i = 0; i < x.length; i++) {
            boolean swapMade = false;
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    exch(x, j, j + 1);
                    swapMade = true;
                }
            }
            if (!swapMade) break;
        }
        
        return x;
    }
    
    private static void exch(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        int[] x = {-17, -3, 0, 18, 4, 2, -6, -19, 8, 18};
        int[] sorted = sort(x);
        
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}