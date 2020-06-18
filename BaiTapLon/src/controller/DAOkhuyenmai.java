/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.KhuyenMai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DAOkhuyenmai extends DAO{
    public DAOkhuyenmai() {
        super();
    }
    private String table = "KHUYENMAI";

    public ArrayList<KhuyenMai> getListKhuyenMai() {
        ArrayList<KhuyenMai> items = new ArrayList<>();
        String sql = "select * from " + table;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                km.setTenKhuyenMai(rs.getString("TenKhuyenMai"));
                km.setGiaTriKM(rs.getInt("GiaTriKM"));
                km.setNgayBD(rs.getString("NgayBD"));
                km.setNgayKT(rs.getString("NgayKT"));
                items.add(km);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOkhuyenmai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    public boolean addItem(KhuyenMai item)
    {
        String sql = "INSERT INTO " + table + "(MaKhuyenMai, TenKhuyenMai, GiaTriKM, NgayBD, NgayKT) VALUES(?, ?, ?, ?, ?)";
          try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getMaKhuyenMai());
            ps.setString(2, item.getTenKhuyenMai());
            ps.setInt(3, item.getGiaTriKM());
            ps.setString(4, item.getNgayBD());
            ps.setString(5, item.getNgayKT());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean updateItem(KhuyenMai item) {
        String sql = "UPDATE " + table + " SET TenKhuyenMai = ?, GiaTriKM = ?, NgayBD = ?, NgayKT = ? WHERE MaKhuyenMai = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getTenKhuyenMai());
            ps.setInt(2, item.getGiaTriKM());
            ps.setString(3, item.getNgayBD());
            ps.setString(4, item.getNgayKT());
            ps.setString(5, item.getMaKhuyenMai());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean deleteItem(KhuyenMai item) {
        String sql = "DELETE FROM " + table + " WHERE MaKhuyenMai = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getMaKhuyenMai());
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
