
public class Punto3
{
    public static void Palabra(String s){
        aux("",s);
    }
    
    public static void aux(String entry,String s){
    
        if(s.length()==0){System.out.println(entry);
        }else{
        aux(entry+s.charAt(0),s.substring(1));
        aux(entry,s.substring(1));
        }
    }
}
