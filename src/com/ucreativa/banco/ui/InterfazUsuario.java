package com.ucreativa.banco.ui;

import com.ucreativa.banco.business.LogicaNegocio;
import com.ucreativa.banco.database.GrabaBaseDatos;
import com.ucreativa.banco.entities.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.List;

public class InterfazUsuario extends JFrame {
    public InterfazUsuario(String titulo) {
        super(titulo);
    }

    public void Build() {
        this.ConstruccionPantalla();
        this.CrearComponentes();
        super.setVisible(true);

    }

    private void ConstruccionPantalla() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(6, 1));
    }

    private void InsertarComponente(Component componente) {
        super.getContentPane().add(componente);
    }

    private void CrearComponentes() {

        Date fecha = new Date();
        JLabel lblnombre = new JLabel("Nombre");
        JTextField txtnombre = new JTextField();
        JLabel lblcedula = new JLabel("Cedula");
        JTextField txtcedula = new JTextField();
        JLabel lbldireccion = new JLabel("Direccion");
        JTextField txtdireccion = new JTextField();
        JLabel lblcuenta = new JLabel("Cuenta");
        JTextField txtcuenta = new JTextField();
        JLabel lblmoneda = new JLabel("Moneda");
        JTextField txtmoneda = new JTextField();

        JButton guardar = new JButton("Guardar");
        guardar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogicaNegocio service = new LogicaNegocio(new GrabaBaseDatos() {
                    @Override
                    public void save(Cliente cliente, int cuenta, String moneda) {
                    }
                    @Override
                    public List<String> get() {
                        return null;
                    }
                });
                try {
                    service.save(txtnombre.getText(), txtcedula.getText(), txtdireccion.getText(),
                                 fecha, txtcuenta.getText(),txtmoneda.getText());
                  //  txtnombre.setText("");

                    String reporte = String.join("\n", service.get());
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
                } catch (ErrorEnCuentaExcepcion error) {
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), error.getMessage());
                }

            }

        });

        this.InsertarComponente(lblnombre);
        this.InsertarComponente(txtnombre);
        this.InsertarComponente(lblcedula);
        this.InsertarComponente(txtcedula);
        this.InsertarComponente(lbldireccion);
        this.InsertarComponente(txtdireccion);
        this.InsertarComponente(lblcuenta);
        this.InsertarComponente(txtcuenta);
        this.InsertarComponente(lblmoneda);
        this.InsertarComponente(txtmoneda);
        this.InsertarComponente(guardar);

    }
}
