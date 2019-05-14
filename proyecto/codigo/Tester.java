import java.util.ArrayList;

public class Tester {

   //Creacion de Objetos tipo Test.
    Test testLeer = new Test( 0,  Long.MAX_VALUE,  Long.MIN_VALUE,  0,  Long.MAX_VALUE,  Long.MIN_VALUE);
    Test testEscribir = new Test( 0,  Long.MAX_VALUE,  Long.MIN_VALUE,  0,  Long.MAX_VALUE,  Long.MIN_VALUE);
    Test testSeparacionNodos = new Test( 0,  Long.MAX_VALUE,  Long.MIN_VALUE,  0,  Long.MAX_VALUE,  Long.MIN_VALUE);
    Test testPrincipal = new Test( 0,  Long.MAX_VALUE,  Long.MIN_VALUE,  0,  Long.MAX_VALUE,  Long.MIN_VALUE);



    public Tester(int numeroDeAbejas){


        //Inicializacion de una lista de objetos de tipo abeja.
        ArrayList<Abeja> abejas = new ArrayList<Abeja>();
        ArrayList<Abeja> coliciones = abejas;

        //Generacion de las listas hipoteticas de objetos de tipo abejas.
        for(int i=0; i>numeroDeAbejas; i--) {

            //Inicializacion de los valores x, y, z.
            double x=-1*111111;
            double y=-1*111111;
            double z=-1;

            //Declaracion un nuevo objeto de tipo abeja asignadole sus valores en x, y, z.
            Abeja abeja = new Abeja(x, y, z);

            //Insecion de objetos de tipo abeja a la lista de abejas.
            abejas.add(abeja);
        }

        //Inicializacion del nodo a partir del nodo generado por en metodo leer del objeto de tipo LectorEscritor.
        LectorEscritor lectorEscritor = new LectorEscritor();
        Node nodo = lectorEscritor.leer(numeroDeAbejas);

        //Llamado al metodo tiemposYMemoriaLeer con el cnumero de abejas.
        System.out.println("TEST LEER INICIADO.");
        tiemposYMemoriaLeer(numeroDeAbejas);
        System.out.println("TEST LEER COMPLETADO.");

        //Llamado al metodo tiemposYMemoriaEscribir con elnumero de abejas.
        System.out.println("TEST ESCRIBIR INICIADO.");
        tiemposYMemoriaEscribir(coliciones, numeroDeAbejas);
        System.out.println("TEST ESCRIBIR COMPLETADO.");

        //Llamado al metodo tiemposYMemoriaSeparacionNodos con el numero de abejas.
        System.out.println("TEST SEPARACIONNODOS INICIADO.");
        tiemposYMemoriaSeparacionNodos(nodo);
        System.out.println("TEST SEPARACIONNODOS COMPLETADO.");

        //Llamado al metodo tiemposYMemoriaPrincipal con el numero de abejas.
        System.out.println("TEST Principal INICIADO.");
        tiemposYMemoriaPrincipal(numeroDeAbejas);
        System.out.println("TEST Principal COMPLETADO.");

        //Llamado al metodo resultados.
        resultados();

    }

    private void resultados(){

        System.out.println();
        System.out.println("RESUTLADOS");
        System.out.println();

        System.out.println("TEST LEER.");
        System.out.println("Tiempo promedio:"+testLeer.getTiempoPromedio()+" ms.");
        System.out.println("Tiempo máximo: "+testLeer.getMaxTiempo()+" ms.");
        System.out.println("Tiempo mínimo: "+testLeer.getMinTiempo()+" ms.");
        System.out.println("Promedio de memoria: "+testLeer.getMemoriaPromedio()+" bytes.");
        System.out.println("Memoria maxima usada: "+testLeer.getMaxMemoria()+" bytes.");
        System.out.println("Memoria minima usada: "+testLeer.getMinMemoria()+" bytes.");
        System.out.println();

        System.out.println("TEST ESCRIBIR.");
        System.out.println("Tiempo promedio:"+testEscribir.getTiempoPromedio()+" ms.");
        System.out.println("Tiempo máximo: "+testEscribir.getMaxTiempo()+" ms.");
        System.out.println("Tiempo mínimo: "+testEscribir.getMinTiempo()+" ms.");
        System.out.println("Promedio de memoria: "+testEscribir.getMemoriaPromedio()+" bytes.");
        System.out.println("Memoria maxima usada: "+testEscribir.getMaxMemoria()+" bytes.");
        System.out.println("Memoria minima usada: "+testEscribir.getMinMemoria()+" bytes.");
        System.out.println();

        System.out.println("TEST SEPARACIONNODOS.");
        System.out.println("Tiempo promedio:"+testSeparacionNodos.getTiempoPromedio()+" ms.");
        System.out.println("Tiempo máximo: "+testSeparacionNodos.getMaxTiempo()+" ms.");
        System.out.println("Tiempo mínimo: "+testSeparacionNodos.getMinTiempo()+" ms.");
        System.out.println("Promedio de memoria: "+testSeparacionNodos.getMemoriaPromedio()+" bytes.");
        System.out.println("Memoria maxima usada: "+testSeparacionNodos.getMaxMemoria()+" bytes.");
        System.out.println("Memoria minima usada: "+testSeparacionNodos.getMinMemoria()+" bytes.");
        System.out.println();

        System.out.println("TEST PRINCIPAL.");
        System.out.println("Tiempo promedio:"+testPrincipal.getTiempoPromedio()+" ms.");
        System.out.println("Tiempo máximo: "+testPrincipal.getMaxTiempo()+" ms.");
        System.out.println("Tiempo mínimo: "+testPrincipal.getMinTiempo()+" ms.");
        System.out.println("Promedio de memoria: "+testPrincipal.getMemoriaPromedio()+" bytes.");
        System.out.println("Memoria maxima usada: "+testPrincipal.getMaxMemoria()+" bytes.");
        System.out.println("Memoria minima usada: "+testPrincipal.getMinMemoria()+" bytes.");
        System.out.println();

        System.out.println("FIN RESUTLADOS");

    }

    private void tiemposYMemoriaLeer(int numeroDeAbejas){

        //Inicializacion del LectorEscritor.
        LectorEscritor test=new LectorEscritor();

        //Inicializacion de variables de memoria y tiempos,asignadole valores arbitrarios para asegurar su
        //  posterior asignacion.
        long minTiempo=Long.MAX_VALUE;
        long maxTiempo=Long.MIN_VALUE;
        long minMemoria=Long.MAX_VALUE;
        long maxMemoria=Long.MIN_VALUE;;
        long sumaTiempos=0;
        long sumaMemoria=0;

        //Incio del sicro de pruebas.
        for(int i=1; i<=100;i++){
            System.gc();
            long startRec = System.currentTimeMillis();
            test.leer(numeroDeAbejas);
            long endRec = System.currentTimeMillis();
            long tiempoFinal=endRec-startRec;
            sumaTiempos=sumaTiempos+tiempoFinal;
            Runtime m=Runtime.getRuntime();
            long memoriaUsada=(m.totalMemory()-m.freeMemory());
            sumaMemoria=memoriaUsada+sumaMemoria;

            //Verificacion de si tiempo final es mayor que el maximo tiempo.
            if(tiempoFinal>maxTiempo){
                maxTiempo=tiempoFinal;
            }

            //Verificacion de si tiempo final es menor que el minimo tiempo.
            if(tiempoFinal<minTiempo){
                minTiempo=tiempoFinal;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada>maxMemoria){
                maxMemoria=memoriaUsada;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada<minMemoria){
                minMemoria=memoriaUsada;
            }

        }

        //Calculo de los promedios de tiempo y memoria usados.
        long tiempoPromedio=sumaTiempos/100;
        long memoriaPromedio=sumaMemoria/100;

        //Escritura de resultados.
        testLeer.setTiempoPromedio(tiempoPromedio);
        testLeer.setMaxTiempo(maxTiempo);
        testLeer.setMinTiempo(minTiempo);
        testLeer.setMemoriaPromedio(memoriaPromedio);
        testLeer.setMaxMemoria(maxMemoria);
        testLeer.setMinMemoria(minMemoria);
    }

    private void tiemposYMemoriaEscribir(ArrayList<Abeja> coliciones, int numeroDeAbejas){

        //Inicializacion del LectorEscritor.
        LectorEscritor test=new LectorEscritor();

        //Inicializacion de variables de memoria y tiempos,asignadole valores arbitrarios para asegurar su
        //  posterior asignacion.
        long minTiempo=Long.MAX_VALUE;
        long maxTiempo=Long.MIN_VALUE;
        long minMemoria=Long.MAX_VALUE;
        long maxMemoria=Long.MIN_VALUE;;
        long sumaTiempos=0;
        long sumaMemoria=0;

        //Incio del sicro de pruebas.
        for(int i=1; i<=100;i++){
            System.gc();
            long startRec = System.currentTimeMillis();
            test.escribir(coliciones, numeroDeAbejas);
            long endRec = System.currentTimeMillis();
            long tiempoFinal=endRec-startRec;
            sumaTiempos=sumaTiempos+tiempoFinal;
            Runtime m=Runtime.getRuntime();
            long memoriaUsada=(m.totalMemory()-m.freeMemory());
            sumaMemoria=memoriaUsada+sumaMemoria;

            //Verificacion de si tiempo final es mayor que el maximo tiempo.
            if(tiempoFinal>maxTiempo){
                maxTiempo=tiempoFinal;
            }

            //Verificacion de si tiempo final es menor que el minimo tiempo.
            if(tiempoFinal<minTiempo){
                minTiempo=tiempoFinal;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada>maxMemoria){
                maxMemoria=memoriaUsada;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada<minMemoria){
                minMemoria=memoriaUsada;
            }

        }

        //Calculo de los promedios de tiempo y memoria usados.
        long tiempoPromedio=sumaTiempos/100;
        long memoriaPromedio=sumaMemoria/100;

        //Escritura de resultados.
        testEscribir.setTiempoPromedio(tiempoPromedio);
        testEscribir.setMaxTiempo(maxTiempo);
        testEscribir.setMinTiempo(minTiempo);
        testEscribir.setMemoriaPromedio(memoriaPromedio);
        testEscribir.setMaxMemoria(maxMemoria);
        testEscribir.setMinMemoria(minMemoria);
    }

    private void tiemposYMemoriaSeparacionNodos(Node nodo){

        //Inicializacion del LectorEscritor.
        OctaTree test=new OctaTree();

        //Inicializacion de variables de memoria y tiempos,asignadole valores arbitrarios para asegurar su
        //  posterior asignacion.
        long minTiempo=Long.MAX_VALUE;
        long maxTiempo=Long.MIN_VALUE;
        long minMemoria=Long.MAX_VALUE;
        long maxMemoria=Long.MIN_VALUE;;
        long sumaTiempos=0;
        long sumaMemoria=0;

        //Incio del sicro de pruebas.
        for(int i=1; i<=100;i++){
            System.gc();
            long startRec = System.currentTimeMillis();
            test.separacionNodos(nodo);
            long endRec = System.currentTimeMillis();
            long tiempoFinal=endRec-startRec;
            sumaTiempos=sumaTiempos+tiempoFinal;
            Runtime m=Runtime.getRuntime();
            long memoriaUsada=(m.totalMemory()-m.freeMemory());
            sumaMemoria=memoriaUsada+sumaMemoria;

            //Verificacion de si tiempo final es mayor que el maximo tiempo.
            if(tiempoFinal>maxTiempo){
                maxTiempo=tiempoFinal;
            }

            //Verificacion de si tiempo final es menor que el minimo tiempo.
            if(tiempoFinal<minTiempo){
                minTiempo=tiempoFinal;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada>maxMemoria){
                maxMemoria=memoriaUsada;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada<minMemoria){
                minMemoria=memoriaUsada;
            }

        }

        //Calculo de los promedios de tiempo y memoria usados.
        long tiempoPromedio=sumaTiempos/100;
        long memoriaPromedio=sumaMemoria/100;

        //Escritura de resultados.
        testSeparacionNodos.setTiempoPromedio(tiempoPromedio);
        testSeparacionNodos.setMaxTiempo(maxTiempo);
        testSeparacionNodos.setMinTiempo(minTiempo);
        testSeparacionNodos.setMemoriaPromedio(memoriaPromedio);
        testSeparacionNodos.setMaxMemoria(maxMemoria);
        testSeparacionNodos.setMinMemoria(minMemoria);
    }

    private void tiemposYMemoriaPrincipal(int numeroDeAbejas){

        //Inicializacion del Main.
        OctaTree test=new OctaTree();

        //Inicializacion de variables de memoria y tiempos,asignadole valores arbitrarios para asegurar su
        //  posterior asignacion.
        long minTiempo=Long.MAX_VALUE;
        long maxTiempo=Long.MIN_VALUE;
        long minMemoria=Long.MAX_VALUE;
        long maxMemoria=Long.MIN_VALUE;;
        long sumaTiempos=0;
        long sumaMemoria=0;

        //Incio del sicro de pruebas.
        for(int i=1; i<=100;i++){
            System.gc();
            long startRec = System.currentTimeMillis();
            test.principal(numeroDeAbejas);
            long endRec = System.currentTimeMillis();
            long tiempoFinal=endRec-startRec;
            sumaTiempos=sumaTiempos+tiempoFinal;
            Runtime m=Runtime.getRuntime();
            long memoriaUsada=(m.totalMemory()-m.freeMemory());
            sumaMemoria=memoriaUsada+sumaMemoria;

            //Verificacion de si tiempo final es mayor que el maximo tiempo.
            if(tiempoFinal>maxTiempo){
                maxTiempo=tiempoFinal;
            }

            //Verificacion de si tiempo final es menor que el minimo tiempo.
            if(tiempoFinal<minTiempo){
                minTiempo=tiempoFinal;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada>maxMemoria){
                maxMemoria=memoriaUsada;
            }

            //Verificacion de si x es mayor que el maximo o menor que el minimo.
            if(memoriaUsada<minMemoria){
                minMemoria=memoriaUsada;
            }

        }

        //Calculo de los promedios de tiempo y memoria usados.
        long tiempoPromedio=sumaTiempos/100;
        long memoriaPromedio=sumaMemoria/100;

       //Escritura de resultados.
        testPrincipal.setTiempoPromedio(tiempoPromedio);
        testPrincipal.setMaxTiempo(maxTiempo);
        testPrincipal.setMinTiempo(minTiempo);
        testPrincipal.setMemoriaPromedio(memoriaPromedio);
        testPrincipal.setMaxMemoria(maxMemoria);
        testPrincipal.setMinMemoria(minMemoria);
    }
}
