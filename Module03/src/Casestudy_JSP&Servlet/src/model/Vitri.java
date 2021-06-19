package model;

public class Vitri {
    private  String id_vtri;
    private String ten_vitri;

    public Vitri(String id_vtri, String ten_vitri) {
        this.id_vtri = id_vtri;
        this.ten_vitri = ten_vitri;
    }

    public Vitri(String  ten_vitri) {
        this.ten_vitri = ten_vitri;

    }

    public String getId_vtri() {
        return id_vtri;
    }

    public void setId_vtri(String id_vtri) {
        this.id_vtri = id_vtri;
    }

    public String getTen_vitri() {
        return ten_vitri;
    }

    public void setTen_vitri(String ten_vitri) {
        this.ten_vitri = ten_vitri;
    }
}
