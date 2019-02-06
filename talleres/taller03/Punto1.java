
public class Punto1
{
    public static void Main(String args[]){
        int n = 3;
        tower(n, '1', '2', '3');
    }

    public static void tower(int n, int origin, int index, int destiny){
        if(n==1){
            System.out.println("Move disk 1 from "+ origin + " to " + destiny);
            return;
        }
        tower(n-1,origin, destiny,index);
        System.out.println("Move disk"+ n + "from " + origin +" to "+ destiny );
        tower(n-1, index, origin, destiny);
    }        
}

