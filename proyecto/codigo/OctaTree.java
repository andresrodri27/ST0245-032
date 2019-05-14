import java.util.ArrayList;

public class OctaTree {

    //Declaracion del numero de abejas.
    int numeroDeAbejas;

    //Inicializacion del contador.
    int cont=0;

    //Inicializacion de la lista de las abejas en riesgo de colicion.
    ArrayList<Abeja> coliciones = new ArrayList<Abeja>();

    /**
     * Este metodo permite la creacion del nodo principal a partir de la instanciacion del objeto de tipo
     * LectorEscritor, luego pasa el nodo principal al metodo separacionNodos.
     * @param numeroDeAbejas int del numero de abejas que sera usado en el LectorEscritor.
     */
    public void principal(int numeroDeAbejas){

        //Asignacion del numero de abejas.
        this.numeroDeAbejas=numeroDeAbejas;

        //Inicializacion del LectorEscritor.
        LectorEscritor lectorEscritor=new LectorEscritor();

        //Inicializacion del nodo a partir del nodo generado por en metodo leer del objeto de tipo LectorEscritor.
        Node nodo = lectorEscritor.leer(numeroDeAbejas);

        //Llamado al metodo separacionNodos con el nodo principal.
        separacionNodos(nodo);

        //Llamado al metodo de escribir con la lista de colicones y  el numero total de abejas verificadas.
        lectorEscritor.escribir(getColiciones(), numeroDeAbejas);

        //Limpieza de la lista de coliciones.
        coliciones = new ArrayList<Abeja>();

        //Marcador de progreso.
        System.out.println("PROCESO FINALIZADO.");

    }

    /**
     * Este metodo permite la separacion de un nodo en 8 nodos hijos, la determinacion de si las listas contenidas
     * en esos nodos tienen abejas en riesgo de colicion, la creacion de una nueva lsita con todas las abejas en
     * riego de colicion que luego pasa al metodo escritor del objeto de tipo LectorEscritor.
     * @param nodo node con la lista de abejas.
     */
    public void separacionNodos(Node nodo) {


        //Inicializacion de los maximos y minimos.
        double XMax = nodo.xMax;
        double XMin = nodo.xMin;
        double YMax = nodo.yMax;
        double YMin = nodo.yMin;
        double ZMax = nodo.zMax;
        double ZMin = nodo.zMin;

        //Inicializacion de las medias.
        double xMedia = (XMax + XMin) / 2;
        double yMedia = (YMax + YMin) / 2;
        double zMedia = (ZMax + ZMin) / 2;

        //Marcador de paso.
        boolean visit = false;

        //Verificacion de que el espacio en el nodo sea menor a 100m y que el nodo no haya pasado ya o tenga una lista
        // con abejas  menor o igual a 1.
        if (Math.sqrt(Math.pow((XMax - XMin), 2) +
                      Math.pow((YMax - YMin), 2) +
                      Math.pow((ZMax - ZMin), 2))
                      <= 100 &&
                      !visit ||
                      nodo.abejas.size() <= 1) {

                //Verificacion de que el nodo tenga una lsita de abejas con 2 o mas abejas.
                if (nodo.abejas.size() >= 2) {

                    //Inicio de
                    for (int i = 0; i < nodo.abejas.size(); i++) {

                        //Asignacion de los pares de abejas en riesgo de colicion en la lista de colicones.
                        this.coliciones.add(nodo.abejas.get(i));
                    }

                }

                //Verificacion de que el nodo tiene una lista con una sola abeja.
                else if (nodo.abejas.size() == 1) {

                    //Inicializacion de un nuevo objeto de tipo abeja a partir de la abeja solitaria.
                     Abeja abejaM = nodo.abejas.get(0);

                    //Verificacion de que el nodo padre no este vacio.
                    if (nodo.padre != null) {

                    //Inicio del ciclo detector de riesgo de coliciones para las abejas solitarias.
                    for (int i = 0; i < nodo.padre.abejas.size(); i++) {

                        if ((Math.sqrt(Math.pow((nodo.abejas.get(i).getX() - abejaM.getX()), 2) +
                                       Math.pow((nodo.abejas.get(i).getY() - abejaM.getY()), 2) +
                                       Math.pow((nodo.abejas.get(i).getZ() - abejaM.getZ()), 2))
                                       <= 100)) {

                            //Asignacion de los pares de abejas en riesgo de colicion en la lista de colicones.
                            this.coliciones.add(abejaM);
                            this.coliciones.add(nodo.abejas.get(i));
                            break;
                        }

                    }

                }

            }

            //Marcador de paso.
            visit=true;
        }

        //Verificacion de que el nodo no haya pasado ya, tenga una lista con abejas y que esta sea mayor a 50.
        else {

            //Inicializacion de los nodos Hijos.

            Node nodo1 = new Node(XMax, xMedia, YMax, yMedia, ZMax, zMedia);
            Node nodo2 = new Node(XMax, xMedia, YMax, yMedia, zMedia, ZMin);
            Node nodo3 = new Node(XMax, xMedia, yMedia, YMin, zMedia, ZMin);
            Node nodo4 = new Node(XMax, xMedia, yMedia, YMin, ZMax, zMedia);
            Node nodo5 = new Node(xMedia, XMin, YMax, yMedia, ZMax, zMedia);
            Node nodo6 = new Node(xMedia, XMin, YMax, yMedia, zMedia, ZMin);
            Node nodo7 = new Node(xMedia, XMin, yMedia, YMin, zMedia, ZMin);
            Node nodo8 = new Node(xMedia, XMin, yMedia, YMin, ZMax, zMedia);

            //Asignacion del nodo Padre a los nodos Hijos.
            nodo1.padre = nodo;
            nodo2.padre = nodo;
            nodo3.padre = nodo;
            nodo4.padre = nodo;
            nodo5.padre = nodo;
            nodo6.padre = nodo;
            nodo7.padre = nodo;
            nodo8.padre = nodo;

            //Inicio del cilco de separacion de Abejas
            for (int i = 0; i < nodo.abejas.size(); i++) {

                //Inicializacion de un nuevo objeto de tipo abeja a partir de la abeja del nodo padre.
                Abeja abejaN = nodo.abejas.get(i);

                //Asignacion de las variables x, y, z de la nueva abeja a partir de la abeja del nodo padre
                double x = abejaN.x;
                double y = abejaN.y;
                double z = abejaN.z;

                //Verificacion de que la abeja pertenece al espacio correspondiente el primer nodo hijo.
                if (x > xMedia && y > xMedia && z > xMedia) {
                    nodo1.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el segundo nodo hijo.
                if (x > xMedia && y > yMedia && z > zMedia) {
                    nodo2.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el tercero nodo hijo.
                if (x > xMedia && y < yMedia && z < zMedia) {
                    nodo3.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el cuarto nodo hijo.
                if (x > xMedia && y < yMedia && z > zMedia) {
                    nodo4.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el quinto nodo hijo.
                if (x < xMedia && y > yMedia && z > zMedia) {
                    nodo5.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el sexto nodo hijo.
                if (x < xMedia && y > yMedia && z < zMedia) {
                    nodo6.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el septimo nodo hijo.
                if (x < xMedia && y < yMedia && z < zMedia) {
                    nodo7.abejas.add(abejaN);
                }

                //Verificacion de que la abeja pertenece al espacio correspondiente el octavo nodo hijo.
                if (x < xMedia && y < yMedia && z > zMedia) {
                    nodo8.abejas.add(abejaN);
                }
            }

            //Iteracion del metodo separacionNodos con los nodos hijos.
            separacionNodos(nodo1);
            separacionNodos(nodo2);
            separacionNodos(nodo3);
            separacionNodos(nodo4);
            separacionNodos(nodo5);
            separacionNodos(nodo6);
            separacionNodos(nodo7);
            separacionNodos(nodo8);
        }

    }

    //Getters & Setters

    /**
     * Este metodo permite accerder a la lsita dede abejas en riesgo de colicion
     * @return arraylist de abejas en riesgo de colicion.
     */
    public ArrayList<Abeja> getColiciones() {
        return coliciones;
    }

    /**
     * Este metodo permite asignar una lista a la lsita de abejas en riesgo de colicion.
     * @param coliciones arraylist de abejas en riesgo de colicion.
     */
    public void setColiciones(ArrayList<Abeja> coliciones) {
        this.coliciones = coliciones;
    }
}
