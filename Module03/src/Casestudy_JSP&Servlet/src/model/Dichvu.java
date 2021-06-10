package model;

public class Dichvu {
    private String id_dichvu;
    private String ten_dichvu;
    private float dientich;
    private float chiphi;
    private String songuoi;
    private String id_kieuthue;

    public Dichvu(String id_dichvu, String ten_dichvu, float dientich, float chiphi, String songuoi, String id_kieuthue) {
        this.id_dichvu = id_dichvu;
        this.ten_dichvu = ten_dichvu;
        this.dientich = dientich;
        this.chiphi = chiphi;
        this.songuoi = songuoi;
        this.id_kieuthue = id_kieuthue;
    }

    public String getId_dichvu() {
        return id_dichvu;
    }

    public void setId_dichvu(String id_dichvu) {
        this.id_dichvu = id_dichvu;
    }

    public String getTen_dichvu() {
        return ten_dichvu;
    }

    public void setTen_dichvu(String ten_dichvu) {
        this.ten_dichvu = ten_dichvu;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public float getChiphi() {
        return chiphi;
    }

    public void setChiphi(float chiphi) {
        this.chiphi = chiphi;
    }

    public String getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(String songuoi) {
        this.songuoi = songuoi;
    }

    public String getId_kieuthue() {
        return id_kieuthue;
    }

    public void setId_kieuthue(String id_kieuthue) {
        this.id_kieuthue = id_kieuthue;
    }
}
