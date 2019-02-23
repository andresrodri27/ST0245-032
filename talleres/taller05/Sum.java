import java.util.*;
import java.util.concurrent.TimeUnit;
public class Sum {  
    public static void main(int[] arr){
        for(int i=0; i<100000000; i=i+10000000){
            long start = System.currentTimeMillis();
            sum(arrayGen(i));
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

    
    public static int sum (int[]array){  
        int sum = 0; //C1
        for(int i=0; i<array.length; i++){ //C2*n
            sum = sum + array[i]; //C3*n
        }
        return sum; //C4
    }
    //T(n) = C1 + C2*n + C3*n + C4
    
}