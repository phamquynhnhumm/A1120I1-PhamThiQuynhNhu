package com.example.casestudy_spring.model.entity.taikhoan;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "vaiTro")
public class VaiTro {
    @Id
    @Column(name = "vaitro")
    private String vaitro;

    @Column(name = "tenVaitro")
    private String tenVaitro;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "userVatro",
            joinColumns = { @JoinColumn(name = "vaitroId") },
            inverseJoinColumns = {@JoinColumn(name = "tenUserId") })
    private Set<User> userSet = new HashSet<>();

    public VaiTro() {

    }

    public VaiTro(String vaitro, String tenVaitro, Set<User> userSet) {
        this.vaitro = vaitro;
        this.tenVaitro = tenVaitro;
        this.userSet = userSet;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public String getTenVaitro() {
        return tenVaitro;
    }

    public void setTenVaitro(String tenVaitro) {
        this.tenVaitro = tenVaitro;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
