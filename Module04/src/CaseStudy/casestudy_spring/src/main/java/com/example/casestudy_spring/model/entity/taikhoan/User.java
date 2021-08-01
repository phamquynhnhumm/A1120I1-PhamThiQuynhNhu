package com.example.casestudy_spring.model.entity.taikhoan;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "tenuser")
    private String tenUser;

    @Column(name = "matkhau")
    private String matKhau;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "userVatro",
            joinColumns = { @JoinColumn(name = "tenUserId") },
            inverseJoinColumns = {@JoinColumn(name = "vaitroId") })
    private Set<VaiTro> vaiTroSet = new HashSet<>();

    @OneToMany(mappedBy = "Usermap")
    private List<NhanVien> nhanVienList;
//Để biểu thị mối quan hệ nhiều nhiều ta dùng annotation @ManyToMany
//Annotation @JoinTable sẽ chỉ rõ bảng trung gian trong thuộc tính name,
// thuộc tính joinColumns sẽ chỉ rõ column mapping với tale hiện tại,
// thuộc tính inverseJoinColumns sẽ chỉ rõ column mapping với table còn lại

    public User() {
    }

    public User(String tenUser, String matKhau, Set<VaiTro> vaiTroSet, List<NhanVien> nhanVienList) {
        this.tenUser = tenUser;
        this.matKhau = matKhau;
        this.vaiTroSet = vaiTroSet;
        this.nhanVienList = nhanVienList;
    }

    public String getTenUser() {
        return tenUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Set<VaiTro> getVaiTroSet() {
        return vaiTroSet;
    }

    public void setVaiTroSet(Set<VaiTro> vaiTroSet) {
        this.vaiTroSet = vaiTroSet;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
