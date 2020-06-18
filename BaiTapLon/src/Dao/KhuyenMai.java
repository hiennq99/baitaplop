/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author DELL
 */
public class KhuyenMai {
    private String MaKhuyenMai;
    private String TenKhuyenMai;
    private int GiaTriKM;
    private String NgayBD;
    private String NgayKT;

    public KhuyenMai() {
    }

    public KhuyenMai(String MaKhuyenMai, String TenKhuyenMai, int GiaTriKM, String NgayBD, String NgayKT) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.TenKhuyenMai = TenKhuyenMai;
        this.GiaTriKM = GiaTriKM;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
    }

    public String getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(String MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String TenKhuyenMai) {
        this.TenKhuyenMai = TenKhuyenMai;
    }

    public int getGiaTriKM() {
        return GiaTriKM;
    }

    public void setGiaTriKM(int GiaTriKM) {
        this.GiaTriKM = GiaTriKM;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String NgayBD) {
        this.NgayBD = NgayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String NgayKT) {
        this.NgayKT = NgayKT;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "MaKhuyenMai=" + MaKhuyenMai + ", TenKhuyenMai=" + TenKhuyenMai + ", GiaTriKM=" + GiaTriKM + ", NgayBD=" + NgayBD + ", NgayKT=" + NgayKT + '}';
    }
    
    
}
