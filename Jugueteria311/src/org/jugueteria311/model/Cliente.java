/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jugueteria311.model;

/**
 *
 * @author Josem
 */
public class Cliente {

    /**
     * @return the Token
     */
    public String getToken() {
        return Token;
    }

    /**
     * @param Token the Token to set
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * @return the IdCliente
     */
    public int getIdCliente() {
        return IdCliente;
    }

    /**
     * @param IdCliente the IdCliente to set
     */
    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Activo
     */
    public int getActivo() {
        return Activo;
    }

    /**
     * @param Activo the Activo to set
     */
    public void setActivo(int Activo) {
        this.Activo = Activo;
    }

    /**
     * @return the Persona
     */
    public Persona getPersona() {
        return Persona;
    }

    /**
     * @param Persona the Persona to set
     */
    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    /**
     * @return the Usuario
     */
    public Usuario getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }
    private String Token;
    private int IdCliente;
    private String Email;
    private String Telefono;
    private int Activo;
    private Persona Persona;
    private Usuario Usuario;
}
