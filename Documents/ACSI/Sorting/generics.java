/*
Comparable interface(we make this variable)
a>b will be > 0
a<b will be <0
a=b will be =0
obj[i].compareTo(obj[j]) < 0
replace all int data types and replace with "T's" when it refers to the thing in the array (not array indece labels)

*/

public class Test<T extends Comparable<T>>{//Generic class decleration 
T[] obj;//generic array
obj = (T[])new Comperable[obj.length];//when creating generic arrays specify length that the objs are comperable
sort(T[] arr){
}
exch(){
}
less(){
}    
}
Re

boolean less(T[] arr, int a, int b){
    return(arr[a].compareTo(arr[b])<0);
}

if(less(arr,j,i+1);)