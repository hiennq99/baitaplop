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
public class Ve {

    private String IDve;
    private String IDuser;
    private String MaTour;
    private String TenVe;

    public Ve() {
    }

    public Ve(String IDve, String IDuser, String MaTour, String TenVe) {
        this.IDve = IDve;
        this.IDuser = IDuser;
        this.MaTour = MaTour;
        this.TenVe = TenVe;
    }

    public String getIDve() {
        return IDve;
    }

    public void setIDve(String IDve) {
        this.IDve = IDve;
    }

    public String getIDuser() {
        return IDuser;
    }

    public void setIDuser(String IDuser) {
        this.IDuser = IDuser;
    }

    public String getMaTour() {
        return MaTour;
    }

    public void setMaTour(String MaTour) {
        this.MaTour = MaTour;
    }

    public String getTenVe() {
        return TenVe;
    }

    public void setTenVe(String TenVe) {
        this.TenVe = TenVe;
    }

    @Override
    public String toString() {
        return "Ve{" + "IDve=" + IDve + ", IDuser=" + IDuser + ", MaTour=" + MaTour + ", TenVe=" + TenVe + '}';
    }

}
