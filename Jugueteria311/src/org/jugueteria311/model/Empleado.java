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
public class Empleado {

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
     * @return the IdEmpleado
     */
    public int getIdEmpleado() {
        return IdEmpleado;
    }

    /**
     * @param IdEmpleado the IdEmpleado to set
     */
    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    /**
     * @return the Salario
     */
    public double getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the FechaIngreso
     */
    public String getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param FechaIngreso the FechaIngreso to set
     */
    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
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
    private int IdEmpleado;
    private double Salario;
    private String Codigo;
    private String FechaIngreso;
    private int Activo;
    private Persona Persona;
    private Usuario Usuario;
}
