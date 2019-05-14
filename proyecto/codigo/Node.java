import java.util.ArrayList;

public class Node {

    //Declaracion de la lista de abejas, las varaiables maximas y minimas, y de nodo un padre.
    public ArrayList<Abeja> abejas;
    double xMax;
    double xMin;
    double yMax;
    double yMin;
    double zMax;
    double zMin;
    Node padre;

    /**
     * Este metodo permite la asignacion de los valores maximos y minimos asi como la asignacion de la lista de abejas.
     * @param XMax double del valor maximo de x.
     * @param XMin double del valor minimo de x.
     * @param YMax double del valor maximo de y.
     * @param YMin double del valor minimo de y.
     * @param ZMax double del valor maximo de x.
     * @param ZMin double del valor minimo de z.
     */

    public Node(double XMax, double XMin, double YMax, double YMin, double ZMax, double ZMin ){

        //Inicializacion y asignacion de la lista de abjeas.
        this.abejas=new ArrayList<Abeja>();

        //Asignacion de los valores maximos y minimos.
        this.xMax=XMax;
        this.xMin=XMin;
        this.yMax=YMax;
        this.yMin=YMin;
        this.zMax=ZMax;
        this.zMin=ZMin;
    }

    //Getters & Setters

    public ArrayList<Abeja> getAbejas() {
        return abejas;
    }

    /**
     * Este metodo permite asignar una lista a la lsita de abejas.
     * @param abejas arraylist con los objetos de tipo abeja.
     */
    public void setAbejas(ArrayList<Abeja> abejas) {

        //Asignacion de la lista de abjeas.
        this.abejas = abejas;
    }

    public double getxMax() {
        return xMax;
    }

    public void setxMax(double xMax) {
        this.xMax = xMax;
    }

    public double getxMin() {
        return xMin;
    }

    public void setxMin(double xMin) {
        this.xMin = xMin;
    }

    public double getyMax() {
        return yMax;
    }

    public void setyMax(double yMax) {
        this.yMax = yMax;
    }

    public double getyMin() {
        return yMin;
    }

    public void setyMin(double yMin) {
        this.yMin = yMin;
    }

    public double getzMax() {
        return zMax;
    }

    public void setzMax(double zMax) {
        this.zMax = zMax;
    }

    public double getzMin() {
        return zMin;
    }

    public void setzMin(double zMin) {
        this.zMin = zMin;
    }
}
