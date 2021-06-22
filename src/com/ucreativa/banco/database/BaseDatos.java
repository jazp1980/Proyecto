package com.ucreativa.banco.database;

import com.ucreativa.banco.entities.Cliente;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BaseDatos implements GrabaBaseDatos {

    private final String FILE_PATH = "cuentas.txt";

    @Override
    public void save(Cliente cliente, int cuenta, String moneda) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
       // String text = cliente.getNombre() + " " + Integer.toString(cuenta) + " " + moneda + "\n";
        String text = "hola" + "a" + "b" + "\n";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));
            writer.append(text);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<String> get() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
