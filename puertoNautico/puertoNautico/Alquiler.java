
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 30;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
   
    public Alquiler(int diasOcupacion,int posicionAmarre,Barco barco)
    {
        this.diasOcupacion = diasOcupacion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String toString()
    {
        return "";
    }
    
    public float getPrecioAlquiler()
    {
        return 0;
    }
    
}
