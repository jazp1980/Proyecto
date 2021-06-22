package com.ucreativa.banco.business;

import com.ucreativa.banco.database.GrabaBaseDatos;
import com.ucreativa.banco.entities.Cliente;
import com.ucreativa.banco.ui.ErrorEnCuentaExcepcion;

import java.util.Date;
import java.util.List;

public class LogicaNegocio {
    private GrabaBaseDatos repository;

    public LogicaNegocio(GrabaBaseDatos repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String direccion, Date fecha,
                     String txtcuenta, String moneda) throws ErrorEnCuentaExcepcion {
        int cuenta = 0;
        try{
            cuenta = Integer.parseInt(txtcuenta);
        }catch (NumberFormatException x){
            throw new ErrorEnCuentaExcepcion(txtcuenta);
        }
        Cliente cliente = null;

        this.repository.save(cliente, cuenta, moneda);
    }

    public List<String> get(){
        return this.repository.get();
    }
}
