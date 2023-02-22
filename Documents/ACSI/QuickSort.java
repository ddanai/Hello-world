/*
partition
1.  select first element as middle(pivot smaller on left ,larger on right)
2.start left finger from next element and right finger at the last element (to-1)
3.right finger moves left until it see something smaller than pivot
4. left finger move right it see something larger than pivot
5. when both finger find something that are in wrong place swtich
5. stop when fingers cross 
6.swap pivot into closer finger
7.sort both sides of middle

*/
public class QuickSort{
	public static int[] sort(int[] arr){
		int[] x = Arrays.copyof(arr, arr.length);
		sort(x, 0, x.length);
		x.return;	
	}
	private void sort(int[] arr,int from, int to,){
		if(to-from<2) return;
		
		int pivot = partition(arr,from,to);
		
		sort(arr,from,pivot);
		
		sort(arr,pivot+1, to);
	}
	
	private void partition(int[] arr, int from, int to, int pivot){
		int[] arr;
		int lf = from + 1;
		int rf = to - 1;
		int pivot = from;
	}
}

