package com.ucreativa.banco.database;

import com.ucreativa.banco.entities.Cliente;


import java.util.List;

public interface GrabaBaseDatos {
    void save(Cliente cliente, int cuenta, String moneda);
    List<String> get();
}
