public class Abeja {

    //Declaracion de variables de cordenas en X, Y, Z.
    double x;
    double y;
    double z;

    /**
     *  Este metodo permite asignarle los valores al objeto "abeja"
     * @param X double de valor de x.
     * @param Y double de valor de y.
     * @param Z double de valor de z.
     * @return Un objeto de tipo Abeja.
     */
    public Abeja(double X, double Y, double Z) {

        //Asignacion de variables en X, Y, Z.
        this.x = X;
        this.y = Y;
        this.z = Z;
    }

    //Getters & Setters

    /**
     * Este metodo permite acceder al valor x de la abeja.
     * @return double del valor de x.
     */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    /**
     * Este metodo permite acceder al valor y de la abeja.
     * @return double del valor de y.
     */
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Este metodo permite acceder al valor z de la abeja.
     * @return double del valor de z.
     */
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

