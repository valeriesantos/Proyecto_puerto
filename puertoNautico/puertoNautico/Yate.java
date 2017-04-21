
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends Barco
{
    private int numCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int numCamarotes,String matricula, int eslora,int anoFabricacion,Persona propietario)
    {
        super(matricula, eslora,anoFabricacion,propietario);
        this.numCamarotes = numCamarotes;
    }
    
    public String toString()
    {
        return "";
    }
    
    public int getCoeficienteBernua()
    {
        return 0;
    }
    
}
