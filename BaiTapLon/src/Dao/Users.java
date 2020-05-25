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
public class Users {
    private String MaUsers;    
    private String HoTen;
    private String SoDR;
    private String Email;
    private String DiaChi;
    private int soNguoi;
    
    public Users() {
    }

    public Users(String MaUsers, String HoTen, String SoDR, String Email, String DiaChi, int soNguoi) {
        this.MaUsers = MaUsers;
        this.HoTen = HoTen;
        this.SoDR = SoDR;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.soNguoi = soNguoi;
        
    }

    public String getMaUsers() {
        return MaUsers;
    }

    public void setMaUsers(String MaUsers) {
        this.MaUsers = MaUsers;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDR() {
        return SoDR;
    }

    public void setSoDR(String SoDR) {
        this.SoDR = SoDR;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    @Override
    public String toString() {
        return "Users{" + "MaUsers=" + MaUsers + ", HoTen=" + HoTen + ", SoDR=" + SoDR + ", Email=" + Email + ", DiaChi=" + DiaChi + ", soNguoi=" + soNguoi + '}';
    }

}
