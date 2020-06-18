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
public class QuocGia {
    private String maQg;
    private String tenQg;

    public QuocGia() {
    }

    public QuocGia(String maQg, String tenQg) {
        this.maQg = maQg;
        this.tenQg = tenQg;
    }

    public String getMaQg() {
        return maQg;
    }

    public void setMaQg(String maQg) {
        this.maQg = maQg;
    }

    public String getTenQg() {
        return tenQg;
    }

    public void setTenQg(String tenQg) {
        this.tenQg = tenQg;
    }

    @Override
    public String toString() {
        return "QuocGia{" + "maQg=" + maQg + ", tenQg=" + tenQg + '}';
    }
    
}
