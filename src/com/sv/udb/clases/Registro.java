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
public class Registro {
    private String cliente;
    private String cantidad;
    private String pagado;
    private String tipo;
    private String fecha;

    public Registro(String cliente, String cantidad, String pagado, String tipo, String fecha) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.pagado = pagado;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 
   
    public Object[] verVentas() {
        Object obj[] = new Object[5];
        obj[0] = this.cliente;
        obj[1] = this.cantidad;
        obj[2] = this.pagado;
        obj[3] = this.tipo;
        obj[4] = this.fecha;
        return obj;
    }
}
