package com.ucreativa.banco.entities;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String cedula;
    private Date fecha;
    private String direccion;


    public Cliente(String nombre, String cedula, Date fecha, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }
}
