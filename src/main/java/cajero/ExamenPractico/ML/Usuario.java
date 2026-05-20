/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.ExamenPractico.ML;

import java.util.List;

/**
 *
 * @author digis
 */
public class Usuario {
    
    private int IdUsuario;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Correo;
    private String Password;
    public List<Banco> banco;
    
    public Usuario(){}

    public Usuario(int IdUsuario, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Password, List<Banco> banco) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Correo = Correo;
        this.Password = Password;
        this.banco = banco;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public List<Banco> getBanco() {
        return banco;
    }

    public void setBanco(List<Banco> banco) {
        this.banco = banco;
    }
    
    
    
}
