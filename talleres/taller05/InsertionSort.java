
import java.util.*;
import java.util.concurrent.TimeUnit;
public class InsertionSort
{
    public static void main(int[] arr){
        for(int i=0; i<100000; i=i+10000){
            long start = System.currentTimeMillis();
            insertionSort(arrayGen(i));
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }

    public static int[] arrayGen(int n){
        int[] arr=new int[n];
        for(int i=n; i>0; i--){
            int c=0;
            arr[c]=n;
            c++;  
        }
        return arr;
    }

}
    public static int[] insertionSort (int[] array){  
        int aux; //C1
        for(int i=0; i<array.length; i++){ //C2*n
            for(int j=i+1; j<array.length; j++){ //C3*n*(n-1)
                if(array[i] > array[j]){ //C4
                    aux = array[i]; //C5
                    array[i] = array[j]; //C6
                    array[j] = aux; //C7
                }
            }
        }
        return array; //C8
        //T(n) = C1 + n[C2 + C3(n-1)]
    }    
}
