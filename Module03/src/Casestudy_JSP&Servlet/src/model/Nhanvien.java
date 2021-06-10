package model;

import java.util.Date;

public class Nhanvien {
    private String id_nhanvien;
    private  String ten_nhanvien;
    private Date ngaysinh;
    private int socmnd;
    private int sdt;
    private String email;
    private String id_trinhdo;
    private String id_vitri;
    private  String id_bophan;
    private  float luong;
    private String id_diachi;
    private  String ten_user;

    public Nhanvien(String id_nhanvien, String ten_nhanvien, Date ngaysinh, int socmnd, int sdt, String email, String id_trinhdo, String id_vitri, String id_bophan, float luong, String id_diachi, String ten_user) {
        this.id_nhanvien = id_nhanvien;
        this.ten_nhanvien = ten_nhanvien;
        this.ngaysinh = ngaysinh;
        this.socmnd = socmnd;
        this.sdt = sdt;
        this.email = email;
        this.id_trinhdo = id_trinhdo;
        this.id_vitri = id_vitri;
        this.id_bophan = id_bophan;
        this.luong = luong;
        this.id_diachi = id_diachi;
        this.ten_user = ten_user;
    }

    public String getId_nhanvien() {
        return id_nhanvien;
    }

    public void setId_nhanvien(String id_nhanvien) {
        this.id_nhanvien = id_nhanvien;
    }

    public String getTen_nhanvien() {
        return ten_nhanvien;
    }

    public void setTen_nhanvien(String ten_nhanvien) {
        this.ten_nhanvien = ten_nhanvien;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(int socmnd) {
        this.socmnd = socmnd;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId_trinhdo() {
        return id_trinhdo;
    }

    public void setId_trinhdo(String id_trinhdo) {
        this.id_trinhdo = id_trinhdo;
    }

    public String getId_vitri() {
        return id_vitri;
    }

    public void setId_vitri(String id_vitri) {
        this.id_vitri = id_vitri;
    }

    public String getId_bophan() {
        return id_bophan;
    }

    public void setId_bophan(String id_bophan) {
        this.id_bophan = id_bophan;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getId_diachi() {
        return id_diachi;
    }

    public void setId_diachi(String id_diachi) {
        this.id_diachi = id_diachi;
    }

    public String getTen_user() {
        return ten_user;
    }

    public void setTen_user(String ten_user) {
        this.ten_user = ten_user;
    }
}
