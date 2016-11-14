
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    private NumberDisplay hora;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anio;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
      hora = new NumberDisplay(24);
      minutos = new NumberDisplay(60);
      dia = new DisplayDosDigitos(32);
      mes = new DisplayDosDigitos(13);
      anio= new DisplayDosDigitos(100);
    }

    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void avanzarMomento()
    {
        minutos.increment();
        if (minutos.getValue() == 0)
        {
            hora.increment();
            if (hora.getValue() == 0)
            {
                dia.incrementaValor();
                if (dia.getValor() == 1)
                {
                    mes.incrementaValor();
                    if (mes.getValor() == 1)
                    {
                        anio.incrementaValor();
                    }
                }
            }
        }
    }
        
    public void setMomento(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAnio)
    {
      if (nuevoDia <=30 && nuevoMes <=12 && nuevoAnio <=99 && nuevaHora<=23 && nuevoMinuto <=6)
      {
          hora.setValue(nuevaHora);
          minutos.setValue(nuevoMinuto);
          dia.setValue(nuevoDia);
          mes.setValue(nuevoMes);
          anio.setValue(nuevoAnio);
      }
    }
    
    public String getMomento()
    { 
        return hora.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + anio.getValorDelDisplay();
    }
}
