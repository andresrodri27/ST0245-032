public class Main {

    /**
     * Este metodo permite iniciar el programa a travez de la instanciacion del objeto de tipo octaTree y asigna el
     * numero de abejas que se desean revisar.
     * @param args string para el arranque por defecto.
     */
    public static void main(String[] args) {

        //Inicializacion del objeto de tipo octaTree.
        //OctaTree octatree = new OctaTree();

        //Llamado al metodo principal de octatree con el numero de abejas especificado.
        //octatree.principal(100);

        //Llamado al tester con el numero de abejas deseado.
        new Tester(1000000);
    }


}
