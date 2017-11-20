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
public class Producto {

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
     * @return the IdProducto
     */
    public int getIdProducto() {
        return IdProducto;
    }

    /**
     * @param IdProducto the IdProducto to set
     */
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
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
     * @return the EdadMinima
     */
    public int getEdadMinima() {
        return EdadMinima;
    }

    /**
     * @param EdadMinima the EdadMinima to set
     */
    public void setEdadMinima(int EdadMinima) {
        this.EdadMinima = EdadMinima;
    }

    /**
     * @return the EdadMaxima
     */
    public int getEdadMaxima() {
        return EdadMaxima;
    }

    /**
     * @param EdadMaxima the EdadMaxima to set
     */
    public void setEdadMaxima(int EdadMaxima) {
        this.EdadMaxima = EdadMaxima;
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

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
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
     * @return the Stock
     */
    public long getStock() {
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(long Stock) {
        this.Stock = Stock;
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
     * @return the Marca
     */
    public Marca getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }
    private String Token;
    private int IdProducto;
    private String Nombre;
    private int EdadMinima;
    private int EdadMaxima;
    private String Descripcion;
    private double Precio;
    private String Fotografia;
    private long Stock;
    private int Activo;
    private Marca Marca;
}
