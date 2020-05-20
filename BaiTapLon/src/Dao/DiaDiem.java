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
public class DiaDiem {
    private String MaDiaDiem;
    private String tenDiaDiem;
    private String MaQG;

    public DiaDiem() {
    }

    public DiaDiem(String MaDiaDiem, String tenDiaDiem, String MaQG) {
        this.MaDiaDiem = MaDiaDiem;
        this.tenDiaDiem = tenDiaDiem;
        this.MaQG = MaQG;
    }

    public String getMaDiaDiem() {
        return MaDiaDiem;
    }

    public void setMaDiaDiem(String MaDiaDiem) {
        this.MaDiaDiem = MaDiaDiem;
    }

    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public String getMaQG() {
        return MaQG;
    }

    public void setMaQG(String MaQG) {
        this.MaQG = MaQG;
    }

    @Override
    public String toString() {
        return  tenDiaDiem ;
    }

    
    
}
