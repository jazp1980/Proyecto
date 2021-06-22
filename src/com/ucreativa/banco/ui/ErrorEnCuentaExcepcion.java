package com.ucreativa.banco.ui;

public class ErrorEnCuentaExcepcion extends Throwable {

    public ErrorEnCuentaExcepcion(String cuenta) {
        super("Numero de cuenta incorrrecto: " + cuenta);
    }

}
