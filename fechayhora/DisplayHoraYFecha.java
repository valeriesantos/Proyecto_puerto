
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
    private boolean fecha;
    private boolean tiempo;
    private String mostrar;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha(boolean nfecha, boolean ntiempo)
    {
      hora = new NumberDisplay(24);
      minutos = new NumberDisplay(60);
      dia = new DisplayDosDigitos(31);
      mes = new DisplayDosDigitos(13);
      anio= new DisplayDosDigitos(100);
      fecha = nfecha;
      tiempo = ntiempo;
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
        if (minutos.getValue() == 0){
            hora.increment();
            if (hora.getValue() == 0){
                dia.incrementaValor();
                if (dia.getValor() == 1){
                    mes.incrementaValor();
                    if (mes.getValor() == 1){
                        anio.incrementaValor();
                    }
                }
            }
        }
        //creamos un objeto y hacemos doble clic para comprobar que están bien
    }
        
    public void setMomento(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAnio)
    {
      if (nuevaHora >= 0 && nuevaHora < 24 && 
		  nuevoMinuto >= 0 && nuevoMinuto < 60 && 
		  nuevoDia > 0 && nuevoDia < 31 &&
		  nuevoMes > 0 && nuevoMes < 13 && 
		  nuevoAnio > 0 && nuevoAnio < 100)
      {
          hora.setValue(nuevaHora);
          minutos.setValue(nuevoMinuto);
          dia.setValue(nuevoDia);
          mes.setValue(nuevoMes);
          anio.setValue(nuevoAnio);
      }
      /** con un contador:
       *     public void setMomentoVersion2(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAnio)
       *        int comprobante = 0;

       *            if (nuevaHora >= 0 && nuevaHora <=23)
       *            {
       *                comprobante ++;
       *            }
		
       *            if (nuevoMinuto >= 0 && nuevoMinuto <= 59)
       *            { 
       *                comprobante ++;
       *            }
		
       *            if (nuevoDia > 0 && nuevoDia <=30)
       *            {
       *                comprobante ++;
       *            }
		
       *            if (nuevoMes > 0 && nuevoMes <= 12)
       *            {
       *                comprobante ++;
       *            }
		
       *            if (nuevoAnio > 0 &6 nuevoAnio <= 99)
       *            {
       *                comprobante ++;
       *            }
		
       *            if  (comprobante == 5)
       *            {
       *                horas.setValue(nuevaHora);
       *                minutos.setValue(nuevoMinuto);
       *                dia.setValor(nuevoDia);
       *                mes.setValor(nuevoMes);
       *                anio.setValor(nuevoAnio);	
       *            }
       *            
       *            
       *            con valores booleanos:
       *            
       *            public void setMomentoVersion3(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAnio)
       *            {
       *                boolean seDebeCambiarElMomentoTemporal = true;
       *                
       *                if (nuevaHora < 0 || nuevaHora > 23) 
       *                {
       *                    seDebeCambiarElMomentoTemporal = false;
       *                }
       *                if (nuevoMinuto < 0 || nuevoMinuto > 59) 
       *                {
       *                    seDebeCambiarElMomentoTemporal = false;
       *                }
       *                if (nuevoDia < 1 || nuevoDia > 30) 
       *                {
       *                    seDebeCambiarElMomentoTemporal = false;
       *                }
       *                if (nuevoMes < 1 || nuevoMes > 12) 
       *                {
       *                    seDebeCambiarElMomentoTemporal = false;
       *                }
       *                if (nuevoAnio < 1 || nuevoAnio > 99) 
       *                {
       *                    seDebeCambiarElMomentoTemporal = false;
       *                }
       *                if (seDebeCambiarElMomentoTemporal == true;)
       *                {
       *                    minutos.setValue(nuevoMinuto);
       *                    horas.setValue(nuevaHora);
       *                    dia.setValor(nuevoDia);
       *                    mes.setValor(nuevoMes);
       *                    anio.setValor(nuevoAnio);
       *                }
       *            }
       */
    }
    
    public String getMomento()
    { 
        if (fecha == true && tiempo == true)
        {
           mostrar = hora.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + 
                      dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + anio.getValorDelDisplay();
        }
        else if (fecha == true && tiempo == false)
        {
            mostrar = dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + anio.getValorDelDisplay();
        }
        else if (fecha == false && tiempo == true)
        {
            mostrar = hora.getDisplayValue() + ":" + minutos.getDisplayValue() + " " ;
        }
        else
        {
            mostrar = "";
        }
        return mostrar;
    }
}
