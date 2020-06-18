/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.DiaDiem;
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
public class DAOdiaDiem extends DAO {

    private String table = "DIADIEM";

    public DAOdiaDiem() {
        super();
    }

    public ArrayList<DiaDiem> getAllDiaDiem() {
        ArrayList<DiaDiem> items = new ArrayList<>();
        String sql = "select * from " + table;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DiaDiem dd = new DiaDiem();
                dd.setMaDiaDiem(rs.getString("MaDD"));
                dd.setTenDiaDiem(rs.getString("TenDD"));
                dd.setMaQG(rs.getString("MaQG"));
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

    public ArrayList<DiaDiem> getListTrongNuoc() {
        ArrayList<DiaDiem> items = new ArrayList<>();
        String sql = "select * from " + table + " where MaQG='QG01'";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DiaDiem dd = new DiaDiem();
                dd.setMaDiaDiem(rs.getString("MaDD"));
                dd.setTenDiaDiem(rs.getString("TenDD"));
                dd.setMaQG(rs.getString("MaQG"));
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

    public ArrayList<DiaDiem> getListNuocNgoai() {
        ArrayList<DiaDiem> items = new ArrayList<>();
        String sql = "select * from " + table + " where MaQG='QG02'";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DiaDiem dd = new DiaDiem();
                dd.setMaDiaDiem(rs.getString("MaDD"));
                dd.setTenDiaDiem(rs.getString("TenDD"));
                dd.setMaQG(rs.getString("MaQG"));
                items.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOdiaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public boolean addItem(DiaDiem item) {
        String sql = "INSERT INTO " + table + "(MADD,TENDD,MAQG) VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getMaDiaDiem());
            ps.setString(2, item.getTenDiaDiem());
            ps.setString(3, item.getMaQG());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean updateItem(DiaDiem item) {
        String sql = "UPDATE " + table + " SET TenDD = ?, MaQG = ? WHERE MADD = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getTenDiaDiem());
            ps.setString(2, item.getMaQG());
            ps.setString(3, item.getMaDiaDiem());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean deleteItem(DiaDiem item) {
        String sql = "DELETE FROM " + table + " WHERE MADD = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getMaDiaDiem());
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
