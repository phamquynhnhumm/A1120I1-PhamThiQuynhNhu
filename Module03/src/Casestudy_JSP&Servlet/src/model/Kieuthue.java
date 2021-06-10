package model;

public class Kieuthue {
    private String id_kieuthue;
    private String ten_kieuthu;

    public Kieuthue(String id_kieuthue, String ten_kieuthu) {
        this.id_kieuthue = id_kieuthue;
        this.ten_kieuthu = ten_kieuthu;
    }

    public String getId_kieuthue() {
        return id_kieuthue;
    }

    public void setId_kieuthue(String id_kieuthue) {
        this.id_kieuthue = id_kieuthue;
    }

    public String getTen_kieuthu() {
        return ten_kieuthu;
    }

    public void setTen_kieuthu(String ten_kieuthu) {
        this.ten_kieuthu = ten_kieuthu;
    }
}
