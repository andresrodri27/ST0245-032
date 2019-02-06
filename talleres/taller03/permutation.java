public class permutation {
     public static void permutations(String s){
        permutationsIndex(" ", s);        
    }

    private static void permutationsIndex(String p, String s){
        int n = s.length(); 
        if (n == 0) 
            System.out.println(p); 
        else { 
            for (int i=0;i<n; i++) 
                permutationsIndex(p + s.charAt(i), s.substring(0, i) + s.substring(i+1, n+1)); 
        } 
    }
}