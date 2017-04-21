
public abstract class Barco
{
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, int eslora,int anoFabricacion,Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.propietario = propietario;
    }

    public String toString()
    {
        return "";
    }
    
    public int getEslora()
    {
        return 0;
    }
    
    public abstract int getCoeficienteBernua();
}
