package com.example.casestudy_spring.model.entity.hopdong;


import com.example.casestudy_spring.model.entity.dichvu.DichVu;
import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import com.example.casestudy_spring.model.service.KhachhangService;

import javax.persistence.*;
import java.util.List;

@Entity(name = "hopdong")
public class HopDong {

    @Id
    @Column(name = "idHopDong")
    private String idHopDong;

    @Column(name = "ngaybatdau")
    private String ngayBatDau;

    @Column(name = "ngayketthuc")
    private String ngayKetThuc;

    @Column(name = "sotiendatcoc")
    private Float soTienDatCoc;

    @Column(name = "tongsotienthanhtoan")
    private Float tongSoTienThanhToan;

    @ManyToOne
    @JoinColumn(name = "idNhanVien", referencedColumnName = "idNhanVien")
    private NhanVien nhanViens;

    @ManyToOne
    @JoinColumn(name = "idDichVu", referencedColumnName = "idDichVu")
    private DichVu dichVus;

//    @ManyToOne
//    @JoinColumn(name = "khachHangId", referencedColumnName = "khachHangId")
//    private KhachHang khachHangs;

    @ManyToOne
    @JoinColumn(name = "khachhang_id", referencedColumnName = "khachHangId")
    private KhachHang khachHangs;


    @OneToMany(mappedBy = "hopDongs", cascade = CascadeType.ALL)
    private List<HopDongDichVuDiKem> hopDongDichVuDiKemList;


    public HopDong() {
    }

    public HopDong(String idHopDong, String ngayBatDau, String ngayKetThuc, Float soTienDatCoc, Float tongSoTienThanhToan, NhanVien nhanViens, DichVu dichVus, KhachHang khachHangs, List<HopDongDichVuDiKem> hopDongDichVuDiKemList) {
        this.idHopDong = idHopDong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soTienDatCoc = soTienDatCoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.nhanViens = nhanViens;
        this.dichVus = dichVus;
        this.khachHangs = khachHangs;
        this.hopDongDichVuDiKemList = hopDongDichVuDiKemList;
    }

    public String getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(String idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Float getSoTienDatCoc() {
        return soTienDatCoc;
    }

    public void setSoTienDatCoc(Float soTienDatCoc) {
        this.soTienDatCoc = soTienDatCoc;
    }

    public Float getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(Float tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public NhanVien getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien nhanViens) {
        this.nhanViens = nhanViens;
    }

    public DichVu getDichVus() {
        return dichVus;
    }

    public void setDichVus(DichVu dichVus) {
        this.dichVus = dichVus;
    }

    public KhachHang getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(KhachHang khachHangs) {
        this.khachHangs = khachHangs;
    }

    public List<HopDongDichVuDiKem> getHopDongDichVuDiKemList() {
        return hopDongDichVuDiKemList;
    }

    public void setHopDongDichVuDiKemList(List<HopDongDichVuDiKem> hopDongDichVuDiKemList) {
        this.hopDongDichVuDiKemList = hopDongDichVuDiKemList;
    }
}
