
/**
 * Write a description of class Contenedores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contenedores
{

    /**
     * Execute all the posible configuration to fill a 2xn space
     * whit 1x2 rectangules.
     * @param n is the Y size of the space that is required to be filled by
     *          the 1x2 rectangules.
     * @return int returns a number that represent all the posible 
     *             configurations in the given space.
     */
    public static int recNum(int n)
    {
        if(n<=2)
        {//c1
            return n;//c2
        }
        return recNum(n-1)+recNum(n-2);//T(n)=t(n-1)+t(n-2)+c1
    }

    /**
     * Main method. Execute the program and pirnt the results.
     * @param args an array of n to be test.
     */
    public static void main(String[] args)
    {
        int pruebas [] ={10,20,30,40,50};
        for(int i = 0; i < pruebas.length; i++)
        {
            System.out.println(recNum(i));
        }
    }

    public static void times()
    {
        for(int i=10; i<=50; i=i+5)
        {
            long start = System.currentTimeMillis();
            recNum(i);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }

}
