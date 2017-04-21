
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(int potencia,String matricula, int eslora,int anoFabricacion,Persona propietario)
    {
        super(matricula, eslora,anoFabricacion,propietario);
        this.potencia = potencia;
    }
    
      public int getCoeficienteBernua()
    {
        return 0;
    }
    
    public String toString()
    {
        return "";
    }
}
