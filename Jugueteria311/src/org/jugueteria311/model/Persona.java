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
public class Persona {

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
     * @return the IdPersona
     */
    public int getIdPersona() {
        return IdPersona;
    }

    /**
     * @param IdPersona the IdPersona to set
     */
    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApePaterno
     */
    public String getApePaterno() {
        return ApePaterno;
    }

    /**
     * @param ApePaterno the ApePaterno to set
     */
    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    /**
     * @return the ApeMaterno
     */
    public String getApeMaterno() {
        return ApeMaterno;
    }

    /**
     * @param ApeMaterno the ApeMaterno to set
     */
    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    /**
     * @return the Genero
     */
    public int getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(int Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
     * @return the RFC
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * @param RFC the RFC to set
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * @return the CP
     */
    public String getCP() {
        return CP;
    }

    /**
     * @param CP the CP to set
     */
    public void setCP(String CP) {
        this.CP = CP;
    }

    /**
     * @return the Fotografia
     */
    public String getFotografia() {
        return Fotografia;
    }

    /**
     * @param Fotografia the Fotografia to set
     */
    public void setFotografia(String Fotografia) {
        this.Fotografia = Fotografia;
    }

    /**
     * @return the Domicilio
     */
    public String getDomicilio() {
        return Domicilio;
    }

    /**
     * @param Domicilio the Domicilio to set
     */
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }
      private String Token;
      private int IdPersona;
      private String Nombre;
      private String ApePaterno;
      private String ApeMaterno;
      private int Genero;
      private String FechaNacimiento;
      private String CURP;
      private String RFC;
      private String CP;
      private String Fotografia;
      private String Domicilio;
}
