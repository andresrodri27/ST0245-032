
public class Punto
{
    //Punto 1
    private short x;
    private short y;
    private double dist;

    public Punto(short cordX, short cordY)
    {
        this.x = cordX;
        this.y = cordY;
    }

    public float dist(Punto dot1,Punto dot2)
    {
        dist = Math.sqrt(Math.pow((dot1.x-dot2.x),2)+Math.pow((dot1.y-dot2.y),2));
        return (float) dist;
    }

}
