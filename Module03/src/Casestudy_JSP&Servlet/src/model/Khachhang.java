package model;

import java.util.Date;

public class Khachhang {
    private String id_khachhang;
    private String ten_khachhang;
    private Date ngaysinh;
    private String gioitinh;
    private  int socmnd;
    private  int sdt;
    private String email;
    private String id_loaikhach;
    private String id_diachi;

    public Khachhang(String id_khachhang, String ten_khachhang, Date ngaysinh, String gioitinh, int socmnd, int sdt, String email, String id_loaikhach, String id_diachi) {
        this.id_khachhang = id_khachhang;
        this.ten_khachhang = ten_khachhang;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.socmnd = socmnd;
        this.sdt = sdt;
        this.email = email;
        this.id_loaikhach = id_loaikhach;
        this.id_diachi = id_diachi;
    }

    public String getId_khachhang() {
        return id_khachhang;
    }

    public void setId_khachhang(String id_khachhang) {
        this.id_khachhang = id_khachhang;
    }

    public String getTen_khachhang() {
        return ten_khachhang;
    }

    public void setTen_khachhang(String ten_khachhang) {
        this.ten_khachhang = ten_khachhang;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getId_loaikhach() {
        return id_loaikhach;
    }

    public void setId_loaikhach(String id_loaikhach) {
        this.id_loaikhach = id_loaikhach;
    }

    public String getId_diachi() {
        return id_diachi;
    }

    public void setId_diachi(String id_diachi) {
        this.id_diachi = id_diachi;
    }
}
