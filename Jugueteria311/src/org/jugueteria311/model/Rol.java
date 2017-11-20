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
public class Rol {

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
     * @return the IdRol
     */
    public int getIdRol() {
        return IdRol;
    }

    /**
     * @param IdRol the IdRol to set
     */
    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    private String Token;
    private int IdRol;
    private String Descripcion;
}
