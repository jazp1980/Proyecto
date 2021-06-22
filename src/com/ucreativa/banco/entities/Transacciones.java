package com.ucreativa.banco.entities;

import java.util.Date;

public class Transacciones extends Cuentas{

    private float monto;
    private String transaccion;

    public Transacciones(String nombre, String cedula, Date fecha, String direccion, int cuenta, String moneda, float saldo) {
        super(nombre, cedula, fecha, direccion, cuenta, moneda, saldo);
        this.monto = monto;
        this.transaccion = transaccion;
    }

    public float getMonto() {
        return monto;
    }

    public String getTransaccion() {
        return transaccion;
    }
}

