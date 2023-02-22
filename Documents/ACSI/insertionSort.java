import java.util.Arrays;

public class insertionSort{
	public static int[]sort(int[] arr){
		int[] x = new int[arr.length];
			for (int i = 1; i <= x.length; i++){
				while (x[i] < x[i-1]){
					exch(int[] x, int i, int i-1);
				}
			}
	private static void exch(int[] arr, int a, int b) {
		int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
	public static void  main(String[] args){
		int[] x = {6,-6,7,-5,8};
		sort(int[] x);
		Arrays.toString(int[] x);
		System.out.println((int[] x));
	}
	
}

