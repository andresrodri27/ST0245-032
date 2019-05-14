import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LectorEscritor {
    public LectorEscritor(){}

    /**
     * Este método lee un archivo con datos y los guarda en objetos de tipo abeja, luego inserta estos objetos en un
     * arraylist, posteriormente instancia un objeto de tipo nodo con los valores maximos y minimos, y le inserta la
     * lista de abejas.
     * @param numeroDeAbejas int del numero de abejas que se requieren, este numero se concatena para generar el nombre
     *                       del archivo a cargar.
     */
    public Node leer(int numeroDeAbejas) {

        //Generacion del nombre del archivo a cargar.
        String Archivo = "src\\data\\input\\ConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";

        //Inicializacion de una lista de objetos de tipo abeja.
        ArrayList<Abeja> abejas = new ArrayList<Abeja>();

        //Declaracion inicial de los valores maximos y minimos, asignadole valores arbitrarios para asegurar su
        //  posterior asignacion.
        double XMax = Double.MIN_VALUE;
        double XMin = Double.MAX_VALUE;
        double YMax = Double.MIN_VALUE;
        double YMin = Double.MAX_VALUE;
        double ZMax = Double.MIN_VALUE;
        double ZMin = Double.MAX_VALUE;

        //Inicio del intento de leer el archivo.
        try {

            //Inicializacion del buffer con lector de archivos para leer el archivo.
            BufferedReader br = new BufferedReader(new FileReader(Archivo));

            //Declaracion del string resultante de cada linea del archivo.
            String line = br.readLine();

            //Inicio del ciclo para porcesar cada linea.
            while (line != null) {

                //Declaracion de los strings resultantes de la separacion por "," del string de cada linea.
                String[] cords = line.split(",");

                //Asignacion de X y su valor maximo y minimo, y convercion de cordenadas geodesicas a metros.
                double x = (Double.parseDouble(cords[0])*111111);

                //Verificacion de si x es mayor que el maximo o menor que el minimo.
                if(x>XMax){
                    XMax=x;
                }else if(x<XMin){
                    XMin=x;
                }

                //Asignacion de Y y su valor maximo y minimo, y convercion de cordenadas geodesicas a metros.
                double y = (Double.parseDouble(cords[1])*111111);

                //Verificacion de si x es mayor que el maximo o menor que el minimo.
                if(y>YMax){
                    YMax=y;
                }else if(y<YMin){
                    YMin=y;
                }

                //Asignacion de Z y su valor maximo y minimo.
                double z = Double.parseDouble(cords[2]);

                //Verificacion de si x es mayor que el maximo o menor que el minimo.
                if(z>ZMax){
                    ZMax=z;
                }else if(z<ZMin){
                    ZMin=z;
                }

                //Declaracion un nuevo objeto de tipo abeja asignadole sus valores en x, y, z.
                Abeja abeja = new Abeja(x, y, z);

                //Insecion de objetos de tipo abeja a la lista de abejas.
                abejas.add(abeja);

                //Asignacion del string a la siguiente linea.
                line = br.readLine();

            }

            //Marcador de progreso.
            System.out.println("Lectura y creacion de la lista completada con exito.");

        }

        //Manejo de la exepcion en caso de un intento fallido.
        catch (IOException ioe) {

            //Mensaje de fallo.
            System.out.println("No se puede encontrar el archivo.");
        }

        //Instanciacion del objeto de tipo nodo con los valores maximos y minimos.
        Node nodo = new Node( XMax, XMin, YMax, YMin, ZMax, ZMin);

        //Insercion de la lista de abejas al objeto de tipo nodo.
        nodo.setAbejas(abejas);

        //retorna el nodo principal.
        return nodo;

    }

    /**
     * Este metodo permite la generacion de un archivo con las cordenadas de las abejas en riesgo de colicion.
     * @param coliciones arraylist con las abejas en riesgo de colicion.
     * @param numeroDeAbejas int del numero de abejas que se leyeron en primer lugar, este numero se concatena para
     *      *                generar el nombre del archivo a guardar.
     */
    public void escribir(ArrayList<Abeja> coliciones, int numeroDeAbejas){

        //Generacion del nombre del archivo a guardar.
        String Archivo = "src\\data\\output\\respuestaConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";

        //Inicio del intento de guardar el archivo.
         try {

             //Inicializacion del contador.
             int cont=0;

             //Inicializacion del escritor de archivos con el nombre del archivo y el formato de escritura.
            PrintWriter escritor = new PrintWriter(Archivo, "UTF-8");

            //Inicio del ciclo de escritura.
            for (int i=0; i<coliciones.size();i++) {

                //Creacion de la linea de escritura al concatenar los valores x, y, z con "," y convercion de los
                //  valores en metros a cordenadas geodesicas.
                escritor.println((coliciones.get(i).getX()/111111)+","+
                                 (coliciones.get(i).getY()/111111)+","+
                                 (coliciones.get(i).getZ()));

                //Registro del contador.
                cont++;
            }

            //Finalizacion del escritor.
             escritor.close();

             //Marcadores de progreso.
             System.out.println("Se han encontrado un total de "+(cont/2)+" riesgos de colicion");
             System.out.println("Escritura de "+cont+" lienas completada con exito.");
             System.out.println("Guardado del archivo completado.");
        }

         //Manejo de la exepcion en caso de un intento fallido.
         catch(IOException ioe) {

             //Mensaje de fallo.
             System.out.println("No se a podido generear el archivo de salida.");
         }
    }
}
