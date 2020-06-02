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
                dd.setSoDR(rs.getString("SoDT"));
                dd.setEmail(rs.getString("Email"));
                dd.setDiaChi(rs.getString("DiaChi"));
                dd.setSoNguoi(rs.getInt("SoNguoi"));
                items.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOdiaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    public boolean addItem(Users item)
    {
        String sql = "INSERT INTO " + table + "(IDuser, HoTen, SoDT, Email,DiaChi ,SoNguoi) VALUES(?, ?, ?, ?, ?,?)";
          try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getMaUsers());
            ps.setString(2, item.getHoTen());
            ps.setString(3, item.getSoDR());
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
}
