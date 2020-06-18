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
public class DAOve extends DAO {

    public DAOve() {
        super();
    }
    private String table = "VE";

    public ArrayList<Ve> getListVe() {
        ArrayList<Ve> items = new ArrayList<>();
        String sql = "select * from " + table;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ve v = new Ve();
                v.setIDve(rs.getString("IDve"));
                v.setIDuser(rs.getString("IDUser"));
                v.setMaTour(rs.getString("MaTour"));
                v.setTenVe(rs.getString("TenVe"));
                items.add(v);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public boolean addItem(Ve item) {
        String sql = "INSERT INTO " + table + "(IDve,IDuser,MaTour,TenVe) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getIDve());
            ps.setString(2, item.getIDuser());
            ps.setString(3, item.getMaTour());
            ps.setString(4, item.getTenVe());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateItem(Ve item) {
        String sql = "UPDATE " + table + "SET IDuser = ?, MaTour = ?, TenVe = ? WHERE IDve = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getIDuser());
            ps.setString(2, item.getMaTour());
            ps.setString(3, item.getTenVe());
            ps.setString(4, item.getIDve());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean deleteItem(Ve item) {
        String sql = "DELETE FROM " + table + "WHERE IDve = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getIDve());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
