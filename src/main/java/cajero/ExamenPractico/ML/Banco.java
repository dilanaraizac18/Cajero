
package cajero.ExamenPractico.ML;

import java.util.List;


public class Banco {
    
    private int IdBanco;
    private String Nombre;
    private List<cajero.ExamenPractico.ML.Usuario> usuarios;
    
    
    public Banco(){}

    public Banco(int IdBanco, String Nombre, List<cajero.ExamenPractico.ML.Usuario> usuarios) {
        this.IdBanco = IdBanco;
        this.Nombre = Nombre;
        this.usuarios = usuarios;
    }

    public int getIdBanco() {
        return IdBanco;
    }

    public void setIdBanco(int IdBanco) {
        this.IdBanco = IdBanco;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
}
