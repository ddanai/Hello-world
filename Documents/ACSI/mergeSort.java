/*
merge(int[] arr, int from, int to, int mid)
0. Create new array
1. Start fingers at from and mid
2. Copy the smaller finger and advance
3. Keep doing(2) until either finger hits end
4.  Copy all of remaining dements
5. Copy y back into arr.
*/
import java.util.Arrays;

public class mergeSort{

	public static int[] sort(int[] arr){
		int[] x = Arrays.copyOf(arr, arr.length);
		sort(x, 0, x.length);
		return x;
	}
	
	private static void sort(int[] arr, int from, int to){
		if (to - from <= 1) return;
		
		int mid = (to + from)/2;
		sort(arr, from, mid);
		sort(arr, mid, to);
		
		merge(arr, from, to, mid);
	}
	private static void merge(int[] arr, int from, int to, int mid){
		int leftFinger = from;
		int rightFinger = mid;
		int i = 0;
		int[] temp = {};
		
		
		while(from < mid && mid < to){
			if (arr[leftFinger] > arr[rightFinger]) {
				temp[i] = arr[rightFinger];
				rightFinger++;
				i++;
				
			} else if (arr[rightFinger] > arr[leftFinger]) {
				temp[i] = arr[leftFinger];
				leftFinger++;
				i++;
			}
			
			
			
		}
		
		for (int i = 0; i<temp.length; i++;) {
			arr[i+from] = temp[i];
		}
	
	public static void main(String[] arg){
		int[] arr = {6,2};
		sort(arr);
		Arrays.toString(int[] arr);
		System.out.println(arr);
	}
}