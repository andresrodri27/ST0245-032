
public class Punto3
{
    public static void palabra(String prefix, String s) {
        int a = s.length();
        if (a == 0){
            System.out.println(prefix);
        }
        else {
            for (int i=0;i<a;i++)
                palabra(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1,a));
        }
    }
}
