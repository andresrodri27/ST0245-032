import java.util.Arrays;
import java.util.Random;
public class Lab2
{

    public static void main (int n){
        long start = System.currentTimeMillis();
        int [] index = generateArray(n);
        Lab2 ob = new Lab2(); 
        ob.sort(index, 0, index.length-1);
        long end = System.currentTimeMillis() - start;

        System.out.println(end);
    }

    private static int [] generateArray(int n){
        Random r = new Random();
        int [] integers = new int [n];
        for(int i=0; i<n ; i++){
            integers[i] = r.nextInt(100);
        }
        return integers;
    }

    private static void merge(int index[], int a, int m, int c) { 
        int subIndex1 = m - a + 1; 
        int subIndex2 = c - m; 
        int X[] = new int [subIndex1]; 
        int Z[] = new int [subIndex2];
        for (int i=0; i<subIndex1; ++i){
            X[i] = index[a + i]; 
        }
        for (int j=0; j<subIndex2; ++j){ 
            Z[j] = index[m + 1+ j];
        }
        int i = 0, j = 0; 
        int k = a; 
        while (i < subIndex1 && j < subIndex2) 
        { 
            if (X[i] <= Z[j]) { 
                index[k] = X[i]; 
                i++; 
            } 
            else{ 
                index[k] = Z[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < subIndex1) { 
            index[k] = X[i]; 
            i++; 
            k++; 
        } 
        while (j < subIndex2) { 
            index[k] = Z[j]; 
            j++; 
            k++; 
        } 
    } 

    private static void sort(int index[], int a, int c) { 
        if (a < c){ 
            int m = (a+c)/2; 
            sort(index, a, m); 
            sort(index, m+1, c); 
            merge(index, a, m, c); 
        } 
    }

    public static void maisubIndex2 (int n){
        long start = System.currentTimeMillis();
        int [] index = generateArray(n);
        arregXar(index);
        long end = System.currentTimeMillis() - start;
        System.out.println(end);
    }

    private static void arregXar(int [] integers){
        for(int i = 0; i <= integers.length-1; i++){
            for(int j = i+1; j < integers.length; j++){
                if(integers[i]>integers[j]){
                    int key = integers[j];
                    integers[j]=integers[i];
                    integers[i]=key;
                }
            }
        }
    }
}


