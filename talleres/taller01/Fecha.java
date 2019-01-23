public class Fecha
{
    // Punto 2
    private short dia;
    private short mes;
    private short año;

    public Fecha(short dia, short mes, short año)
    {
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }

    public String getFecha()
    {
        return dia+" "+mes+" "+año;
    }

    public void compFecha(Fecha f1)
    {
        if(f1.año > this.año)
        {
            System.out.println("Posterior a la fecha");

        }else if(f1.año < this.año)
        {
            System.out.println("anterior a la fecha");
        }else{
            if(f1.mes > this.mes)
            {
                System.out.println("Posterior a la fecha");

            }else if(f1.mes < this.mes)
            {
                System.out.println("anterior a la fecha");
            }else{
                if(f1.dia > this.dia)
                {
                    System.out.println("Posterior a la fecha");

                }else if(f1.dia < this.dia)
                {
                    System.out.println("anterior a la fecha");
                }else{
                    System.out.println("Es igual a la fecha");
                }
            }
        }
    }
}
