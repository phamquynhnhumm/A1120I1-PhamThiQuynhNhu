package model;


public class Diachi {
    private  String id_diachi;
    private String sonha;
    private  String xa;
    private String huy;
    private String tinh;
    private String quocgia;

    public Diachi(String id_diachi, String sonha, String xa, String huy, String tinh, String quocgia) {
        this.id_diachi = id_diachi;
        this.sonha = sonha;
        this.xa = xa;
        this.huy = huy;
        this.tinh = tinh;
        this.quocgia = quocgia;
    }

    public String getId_diachi() {
        return id_diachi;
    }

    public void setId_diachi(String id_diachi) {
        this.id_diachi = id_diachi;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuy() {
        return huy;
    }

    public void setHuy(String huy) {
        this.huy = huy;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }
}
