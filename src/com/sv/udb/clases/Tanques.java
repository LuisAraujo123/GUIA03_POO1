/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author bernardo
 */
public class Tanques {
    private String Tipo;
    private String Precio;
    private String Maximo;
    private String Actual;

    public Tanques(String tipo, String precio, String Maximo, String Actual) {
        this.Tipo = tipo;
        this.Maximo = Maximo;
        this.Precio = precio;
        this.Actual = Actual;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getMaximo() {
        return Maximo;
    }

    public void setMaximo(String Maximo) {
        this.Maximo = Maximo;
    }

    public String getActual() {
        return Actual;
    }

    public void setActual(String Actual) {
        this.Actual = Actual;
    }
}
