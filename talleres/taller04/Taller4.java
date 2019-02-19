public class Taller4 {
    private static int array(int[] array, int n) {

        if(n == array.length){
            return 0;
        }else{
            return array[n] + array(array, n+1);
        }

    }
    public static int array(int [] array){
        long start = System.currentTimeMillis();
        int  s= array(array, 0);
        long tiempo = System.currentTimeMillis() - start;
        System.out.println(tiempo);
        return s;
    }

   
    public static boolean Punto2(int start, int[] nums, int target) {
        long inicio = System.currentTimeMillis();
        if(start >= nums.length) {
            return target==0;
        }
        boolean n= Punto2 (start+1, nums, target-nums[start])|| Punto2(start+1,nums, target);
        long tiempo = System.currentTimeMillis() - inicio;
        System.out.println(tiempo);
        return n;
    }
       
}