package com.ucreativa.banco.entities;

import java.util.Date;

public class Cuentas extends Cliente {

    private int cuenta;
    private String moneda;

    public Cuentas(String nombre, String cedula, Date fecha, String direccion, int cuenta, String moneda, float saldo) {
        super(nombre, cedula, fecha, direccion);
        this.cuenta = cuenta;
        this.moneda =moneda;
    }

    public float getCuenta() {
        return cuenta;
    }

    public String getMoneda() {
        return moneda;
    }

}
