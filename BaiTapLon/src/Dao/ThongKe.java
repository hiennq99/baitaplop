/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author quang
 */
public class ThongKe {

    private String maTour;
    private String idUser;
    private String ngayKH;
    private String thoiLuong;
    private String gia;
    private String soNguoi;
    private String giaTriKM;

    @Override
    public String toString() {
        return "ThongKe{" + "maTour=" + maTour + ", idUser=" + idUser + ", ngayKH=" + ngayKH + ", thoiLuong=" + thoiLuong + ", gia=" + gia + ", soNguoi=" + soNguoi + ", giaTriKM=" + giaTriKM + '}';
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNgayKH() {
        return ngayKH;
    }

    public void setNgayKH(String ngayKH) {
        this.ngayKH = ngayKH;
    }

    public String getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(String thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(String soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getGiaTriKM() {
        return giaTriKM;
    }

    public void setGiaTriKM(String giaTriKM) {
        this.giaTriKM = giaTriKM;
    }

    public ThongKe() {
    }

    public ThongKe(String maTour, String idUser, String ngayKH, String thoiLuong, String gia, String soNguoi, String giaTriKM) {
        this.maTour = maTour;
        this.idUser = idUser;
        this.ngayKH = ngayKH;
        this.thoiLuong = thoiLuong;
        this.gia = gia;
        this.soNguoi = soNguoi;
        this.giaTriKM = giaTriKM;
    }

}
