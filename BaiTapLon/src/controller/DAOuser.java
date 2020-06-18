/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.Tour;
import Dao.Users;
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
public class DAOuser extends DAO {

    public DAOuser() {
        super();
    }
    private String table = "USERS";

    public ArrayList<Users> getListUsers() {
        ArrayList<Users> items = new ArrayList<>();
        String sql = "select * from " + table;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Users dd = new Users();
                dd.setMaUsers(rs.getString("IDuser"));
                dd.setHoTen(rs.getString("HoTen"));
                dd.setSoDT(rs.getString("SoDT"));
                dd.setEmail(rs.getString("Email"));
                dd.setDiaChi(rs.getString("DiaChi"));
                dd.setSoNguoi(rs.getInt("SoNguoi"));
                items.add(dd);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOdiaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    public boolean addItem(Users item)
    {
        String sql = "INSERT INTO " + table + "(IDuser, HoTen, SoDT, Email, DiaChi ,SoNguoi) VALUES(?, ?, ?, ?, ?,?)";
          try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getMaUsers());
            ps.setString(2, item.getHoTen());
            ps.setString(3, item.getSoDT());
            ps.setString(4, item.getEmail());
            ps.setString(5, item.getDiaChi());
            ps.setInt(6, item.getSoNguoi());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean updateItem(Users item) {
        String sql = "UPDATE " + table + " SET HoTen = ?, SoDT = ?, Email = ?, DiaChi = ?, SoNguoi = ? WHERE IDuser = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(6, item.getMaUsers());
            ps.setString(1, item.getHoTen());
            ps.setString(2, item.getSoDT());
            ps.setString(3, item.getEmail());
            ps.setString(4, item.getDiaChi());
            ps.setInt(5, item.getSoNguoi());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean deleteItem(Users item) {
        String sql = "DELETE FROM " + table + " WHERE IDuser = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getMaUsers());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
