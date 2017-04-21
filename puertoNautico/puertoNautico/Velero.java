
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numMastiles,String matricula, int eslora,int anoFabricacion,Persona propietario)
    {
        super(matricula, eslora,anoFabricacion,propietario);
        this.numMastiles = numMastiles;
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
