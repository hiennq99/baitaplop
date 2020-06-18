/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.Users;
import Dao.ThongKe;
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
    private String table = "ThongKe";

    public ArrayList<ThongKe> getListVe() {
        ArrayList<ThongKe> items = new ArrayList<>();
        String sql = "select * from ThongKe ";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe v = new ThongKe();
                v.setMaTour(rs.getString("MaTour"));
                v.setIdUser(rs.getString("IDUSER"));
                v.setNgayKH(rs.getString("NgayKH"));
                v.setThoiLuong(rs.getString("THOILUONG"));
                v.setGia(rs.getString("GIA"));
                v.setSoNguoi(rs.getString("SONGUOI"));
                v.setGiaTriKM(rs.getString("GIATRIKM"));
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
    public ArrayList<ThongKe> getList(String field) {
        ArrayList<ThongKe> items = new ArrayList<>();
        String sql = "select * from ThongKe where MATOUR = '" + field+"'";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe v = new ThongKe();
                v.setMaTour(rs.getString("MaTour"));
                v.setIdUser(rs.getString("IDUSER"));
                v.setNgayKH(rs.getString("NgayKH"));
                v.setThoiLuong(rs.getString("THOILUONG"));
                v.setGia(rs.getString("GIA"));
                v.setSoNguoi(rs.getString("SONGUOI"));
                v.setGiaTriKM(rs.getString("GIATRIKM"));
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
    
//    public boolean addItem(Ve item) {
//        String sql = "INSERT INTO " + table + " (IDve,IDuser,MaTour,TenVe) VALUES(?,?,?,?)";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, item.getIDve());
//            ps.setString(2, item.getIDuser());
//            ps.setString(3, item.getMaTour());
//            ps.setString(4, item.getTenVe());
//
//            int isSuccess = ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return isSuccess > 0;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
//
//    public boolean updateItem(Ve item) {
//        String sql = "UPDATE " + table + "SET IDuser = ?, MaTour = ?, TenVe = ? WHERE IDve = ?";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, item.getIDuser());
//            ps.setString(2, item.getMaTour());
//            ps.setString(3, item.getTenVe());
//            ps.setString(4, item.getIDve());
//            int isSuccess = ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return isSuccess > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
//
//    public boolean deleteItem(Ve item) {
//        String sql = "DELETE FROM " + table + "WHERE IDve = ?";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, item.getIDve());
//            int isSuccess = ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return isSuccess > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
}
