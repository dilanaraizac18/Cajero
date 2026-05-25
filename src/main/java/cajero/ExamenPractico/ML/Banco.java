
package cajero.ExamenPractico.ML;

import java.util.List;


public class Banco {
    
    private Integer IdBanco;
    private String Nombre;
    private List<cajero.ExamenPractico.ML.Usuario> usuarios;
    
    
    public Banco(){}

    public Banco(Integer IdBanco, String Nombre, List<cajero.ExamenPractico.ML.Usuario> usuarios) {
        this.IdBanco = IdBanco;
        this.Nombre = Nombre;
        this.usuarios = usuarios;
    }

    public Integer getIdBanco() {
        return IdBanco;
    }

    public void setIdBanco(Integer IdBanco) {
        this.IdBanco = IdBanco;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
}
