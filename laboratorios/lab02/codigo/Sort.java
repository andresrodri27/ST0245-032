import java.util.Arrays;
import java.util.Random;
public class Sort
{
    //MergeSort
    public static void main (int n){
        long start = System.currentTimeMillis();
        int [] melo = generateArray(n);
        Sort ob = new Sort(); 
        ob.sort(melo, 0, melo.length-1);
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
    private static void merge(int melo[], int a, int m, int c) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - a + 1; 
        int n2 = c - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i){
            L[i] = melo[a + i]; 
        }
        for (int j=0; j<n2; ++j){ 
            R[j] = melo[m + 1+ j];
        }
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = a; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) { 
                melo[k] = L[i]; 
                i++; 
            } 
            else{ 
                melo[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            melo[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            melo[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    private static void sort(int melo[], int a, int c) 
    { 
        if (a < c) 
        { 
            // Find the middle point 
            int m = (a+c)/2; 
  
            // Sort first and second halves 
            sort(melo, a, m); 
            sort(melo, m+1, c); 
  
            // Merge the sorted halves 
            merge(melo, a, m, c); 
        } 
    }
    
    //Insertion sort
    public static void main2 (int n){
        long start = System.currentTimeMillis();
        int [] melo = generateArray(n);
        arreglar(melo);
        long end = System.currentTimeMillis() - start;

        System.out.println(end);
    }

    private static void arreglar(int [] integers){

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

