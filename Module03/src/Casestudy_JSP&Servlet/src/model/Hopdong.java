package model;

import java.util.Date;

public class Hopdong {
    private String id_hopdong;
    private Date ngaybatdau;
    private Date ngayketthuc;
    private  float sotiendatco;
    private  float tongsotienthanhtoan;
    private String id_nhanvien;
    private String id_khachhang;
    private String id_dichvu;

    public Hopdong(String id_hopdong, Date ngaybatdau, Date ngayketthuc, float sotiendatco, float tongsotienthanhtoan, String id_nhanvien, String id_khachhang, String id_dichvu) {
        this.id_hopdong = id_hopdong;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
        this.sotiendatco = sotiendatco;
        this.tongsotienthanhtoan = tongsotienthanhtoan;
        this.id_nhanvien = id_nhanvien;
        this.id_khachhang = id_khachhang;
        this.id_dichvu = id_dichvu;
    }

    public String getId_hopdong() {
        return id_hopdong;
    }

    public void setId_hopdong(String id_hopdong) {
        this.id_hopdong = id_hopdong;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public float getSotiendatco() {
        return sotiendatco;
    }

    public void setSotiendatco(float sotiendatco) {
        this.sotiendatco = sotiendatco;
    }

    public float getTongsotienthanhtoan() {
        return tongsotienthanhtoan;
    }

    public void setTongsotienthanhtoan(float tongsotienthanhtoan) {
        this.tongsotienthanhtoan = tongsotienthanhtoan;
    }

    public String getId_nhanvien() {
        return id_nhanvien;
    }

    public void setId_nhanvien(String id_nhanvien) {
        this.id_nhanvien = id_nhanvien;
    }

    public String getId_khachhang() {
        return id_khachhang;
    }

    public void setId_khachhang(String id_khachhang) {
        this.id_khachhang = id_khachhang;
    }

    public String getId_dichvu() {
        return id_dichvu;
    }

    public void setId_dichvu(String id_dichvu) {
        this.id_dichvu = id_dichvu;
    }
}
