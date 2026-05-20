
package cajero.ExamenPractico.ML;


class TipoDenominacion{
    
    public int IdDenominacion;
    public String Nombre;
    
    public TipoDenominacion(){}
    
    public TipoDenominacion(int IdDenominacion, String Nomnbre){
        this.IdDenominacion = IdDenominacion;
        this.Nombre = Nombre;
    }

    public int getIdDenominacion() {
        return IdDenominacion;
    }

    public void setIdDenominacion(int IdDenominacion) {
        this.IdDenominacion = IdDenominacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
}
