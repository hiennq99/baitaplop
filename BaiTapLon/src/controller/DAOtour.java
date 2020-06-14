/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.DiaDiem;
import Dao.Tour;
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
public class DAOtour extends DAO {

    private String table = "Tour";

    public DAOtour() {
        super();
    }

    public ArrayList<Tour> getListTour() {
        ArrayList<Tour> items = new ArrayList<>();
        String sql = "select * from " + table;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setMaTour(rs.getString("MaTour"));
                t.setTenTour(rs.getString("TenTour"));
                t.setNgayKH(rs.getString("NgayKH"));
                t.setThoiLuong(rs.getInt("ThoiLuong"));
                t.setNoiKH(rs.getString("NoiKH"));
                t.setNoiDen(rs.getString("NoiDen"));
                t.setGia(rs.getString("Gia"));
                t.setLichTrinhTour(rs.getString("LichTrinhTour"));
                t.setChiTietLichTrinh(rs.getString("ChiTietLichTrinh"));
                t.setDichVu(rs.getString("DichVu"));
                t.setGioiThieuTour(rs.getString("GioiThieuTour"));
                t.setKhuyenMai(rs.getString("KhuyenMai"));
                items.add(t);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOdiaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public ArrayList<Tour> searchTour(String a, String b) {
        ArrayList<Tour> items = new ArrayList<>();
        String sql = "select * from " + table + " where NoiKH=? and NoiDen=? ";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, a);
            ps.setString(2, b);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setMaTour(rs.getString("MaTour"));
                t.setTenTour(rs.getString("TenTour"));
                t.setNgayKH(rs.getString("NgayKH"));
                t.setThoiLuong(rs.getInt("ThoiLuong"));
                t.setNoiKH(rs.getString("NoiKH"));
                t.setNoiDen(rs.getString("NoiDen"));
                t.setGia(rs.getString("Gia"));
                t.setLichTrinhTour(rs.getString("LichTrinhTour"));
                t.setChiTietLichTrinh(rs.getString("ChiTietLichTrinh"));
                t.setDichVu(rs.getString("DichVu"));
                t.setGioiThieuTour(rs.getString("GioiThieuTour"));
                t.setKhuyenMai(rs.getString("KhuyenMai"));
                items.add(t);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOdiaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public boolean addItem(Tour item) {
        String sql = "INSERT INTO " + table + "(MaTour, TenTour, NgayKH, ThoiLuong, NoiKH, NoiDen, Gia, LichTrinhTour, ChiTietLichTrinh, DichVu, GioiThieuTour, KhuyenMai) VALUES(?, ?, ?, ?, ?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getMaTour());
            ps.setString(2, item.getTenTour());
            ps.setString(3, item.getNgayKH());
            ps.setInt(4, item.getThoiLuong());
            ps.setString(5, item.getNoiKH());
            ps.setString(6, item.getNoiDen());
            ps.setString(7, item.getGia());
            ps.setString(8, item.getLichTrinhTour());
            ps.setString(9, item.getLichTrinhTour());
            ps.setString(10, item.getLichTrinhTour());
            ps.setString(11, item.getLichTrinhTour());
            ps.setString(12, item.getLichTrinhTour());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean UpdateItem(Tour item) {
        String sql = "UPDATE " + table + " SET TenTour = ?, NgayKH = ?"
                + ", ThoiLuong = ?, NoiKH = ?,NoiDen = ?,Gia = ? "
                + ", LichTrinhTour = ? , ChiTietLichTrinh = ?"
                + " , DichVu = ? , GioiThieuTour = ? , "
                + "KhuyenMai = ?   where MaTour = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(12, item.getMaTour());
            ps.setString(1, item.getTenTour());
            ps.setString(2, item.getNgayKH());
            ps.setInt(3, item.getThoiLuong());
            ps.setString(4, item.getNoiKH());
            ps.setString(5, item.getNoiDen());
            ps.setString(6, item.getGia());
            ps.setString(7, item.getLichTrinhTour());
            ps.setString(8, item.getChiTietLichTrinh());
            ps.setString(9, item.getDichVu());
            ps.setString(10, item.getGioiThieuTour());
            ps.setString(11, item.getKhuyenMai());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean DeleteItem(Tour item) {
        String sql = "DELETE FROM " + table + " where MaTour=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getMaTour());

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
