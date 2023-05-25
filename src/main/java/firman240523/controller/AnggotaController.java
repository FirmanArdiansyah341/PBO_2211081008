/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman240523.controller;

import firman240523.view.*;
import firman240523.model.*;
import firman240523.dao.*;
import firman240523.database.*;
import java.sql.SQLException;
/**
 *
 * @author ASUS iD
 */
public class AnggotaController {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;

    public AnggotaController(FormAnggota view) throws SQLException {
        this.view = view;
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {}
    }

    public void clearForm() {
        view.getTxtNobp().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
}