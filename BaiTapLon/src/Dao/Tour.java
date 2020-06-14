/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class Tour {

    private String MaTour;
    private String TenTour;
    private String NgayKH;
    private int ThoiLuong;
    private String NoiKH;
    private String NoiDen;
    private String Gia;
    private String LichTrinhTour;
    private String ChiTietLichTrinh;
    private String DichVu;
    private String GioiThieuTour;
    private String KhuyenMai;
    private String A;
    private String B;
    private ArrayList<Tour> dsTour = new ArrayList<>();

    public Tour() {
    }

    public Tour(String MaTour, String TenTour, String NgayKH, int ThoiLuong, String NoiKH, String NoiDen, String Gia, String LichTrinhTour, String ChiTietLichTrinh, String DichVu, String GioiThieuTour, String KhuyenMai) {
        this.MaTour = MaTour;
        this.TenTour = TenTour;
        this.NgayKH = NgayKH;
        this.ThoiLuong = ThoiLuong;
        this.NoiKH = NoiKH;
        this.NoiDen = NoiDen;
        this.Gia = Gia;
        this.LichTrinhTour = LichTrinhTour;
        this.ChiTietLichTrinh = ChiTietLichTrinh;
        this.DichVu = DichVu;
        this.GioiThieuTour = GioiThieuTour;
        this.KhuyenMai = KhuyenMai;
    }

    public String getMaTour() {
        return MaTour;
    }

    public void setMaTour(String MaTour) {
        this.MaTour = MaTour;
    }

    public String getTenTour() {
        return TenTour;
    }

    public void setTenTour(String TenTour) {
        this.TenTour = TenTour;
    }

    public String getNgayKH() {
        return NgayKH;
    }

    public void setNgayKH(String NgayKH) {
        this.NgayKH = NgayKH;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getNoiKH() {
        return NoiKH;
    }

    public void setNoiKH(String NoiKH) {
        this.NoiKH = NoiKH;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getLichTrinhTour() {
        return LichTrinhTour;
    }

    public void setLichTrinhTour(String LichTrinhTour) {
        this.LichTrinhTour = LichTrinhTour;
    }

    public String getChiTietLichTrinh() {
        return ChiTietLichTrinh;
    }

    public void setChiTietLichTrinh(String ChiTietLichTrinh) {
        this.ChiTietLichTrinh = ChiTietLichTrinh;
    }

    public String getDichVu() {
        return DichVu;
    }

    public void setDichVu(String DichVu) {
        this.DichVu = DichVu;
    }

    public String getGioiThieuTour() {
        return GioiThieuTour;
    }

    public void setGioiThieuTour(String GioiThieuTour) {
        this.GioiThieuTour = GioiThieuTour;
    }

    public String getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(String KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public ArrayList<Tour> getDsTour() {
        return dsTour;
    }

    public void setDsTour(ArrayList<Tour> dsTour) {
        this.dsTour = dsTour;
    }
    @Override
    public String toString() {
        return Gia;
    }

}
