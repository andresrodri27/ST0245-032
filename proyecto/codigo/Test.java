public class Test {

    //Declaracion de las variables de los resultados.
    long tiempoPromedio;
    long maxTiempo;
    long minTiempo;
    long memoriaPromedio;
    long maxMemoria;
    long minMemoria;

    /**
     * Este metodo permite asignarle los valores al objeto "test".
     * @param tiempoPromedio long del tiempo promedio de ejecucion.
     * @param maxTiempo long del tiempo maximo de ejecucion.
     * @param minTiempo long del tiempo minimo de ejecucion.
     * @param memoriaPromedio long del memoria promedio de ejecucion.
     * @param maxMemoria long del memoria maximo de ejecucion.
     * @param minMemoria long del memoria minimo de ejecucion.
     */
    public Test(long tiempoPromedio, long maxTiempo, long minTiempo, long memoriaPromedio, long maxMemoria, long minMemoria){

        //Asignacion de las variables de los resultados.
        this.tiempoPromedio=tiempoPromedio;
        this.maxTiempo=maxTiempo;
        this.minTiempo=minTiempo;
        this.memoriaPromedio=memoriaPromedio;
        this.maxMemoria=maxMemoria;
        this.minMemoria=minMemoria;
    }

    //Getters & Setters

    public long getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(long tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    public long getMaxTiempo() {
        return maxTiempo;
    }

    public void setMaxTiempo(long maxTiempo) {
        this.maxTiempo = maxTiempo;
    }

    public long getMinTiempo() {
        return minTiempo;
    }

    public void setMinTiempo(long minTiempo) {
        this.minTiempo = minTiempo;
    }

    public long getMemoriaPromedio() {
        return memoriaPromedio;
    }

    public void setMemoriaPromedio(long memoriaPromedio) {
        this.memoriaPromedio = memoriaPromedio;
    }

    public long getMaxMemoria() {
        return maxMemoria;
    }

    public void setMaxMemoria(long maxMemoria) {
        this.maxMemoria = maxMemoria;
    }

    public long getMinMemoria() {
        return minMemoria;
    }

    public void setMinMemoria(long minMemoria) {
        this.minMemoria = minMemoria;
    }
}
