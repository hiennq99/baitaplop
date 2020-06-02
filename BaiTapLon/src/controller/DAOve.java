/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.Users;
import Dao.Ve;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quang
 */
public class DAOve extends DAO{
    public DAOve()
    {
        super();
    }
    private String table="Ve";
     public ArrayList<Ve> getListVe() {
        ArrayList<Ve> items = new ArrayList<>();
        String sql = "select * from" + table;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ve dd = new Ve();
//                dd.setMaUsers(rs.getString("IDuser"));
//                dd.setHoTen(rs.getString("HoTen"));
//                dd.setSoDR(rs.getString("SoDT"));
//                dd.setEmail(rs.getString("Email"));
//                dd.setDiaChi(rs.getString("DiaChi"));
//                dd.setSoNguoi(rs.getInt("SoNguoi"));
                items.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOdiaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    
}
