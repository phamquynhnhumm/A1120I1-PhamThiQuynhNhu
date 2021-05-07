package FuramaResort.Models;

import javax.print.DocFlavor;

public class House extends Services {
    private String Tieuchuanphong;
    private  String Motatiennghikhac;
    private  int Sotang;

    public House(String tendichvu, double dientichsudung, double chiphithue,  double soluongnguoi,String kieuthue, String dichvudikem, String dongiga,  String tieuchuanphong, String motatiennghikhac, int sotang) {
        super(tendichvu, dientichsudung, chiphithue,soluongnguoi,kieuthue,dichvudikem,dongiga);
        Tieuchuanphong = tieuchuanphong;
        Motatiennghikhac = motatiennghikhac;
        Sotang = sotang;
    }

    public String getTieuchuanphong() {
        return Tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        Tieuchuanphong = tieuchuanphong;
    }

    public String getMotatiennghikhac() {
        return Motatiennghikhac;
    }

    public void setMotatiennghikhac(String motatiennghikhac) {
        Motatiennghikhac = motatiennghikhac;
    }

    public int getSotang() {
        return Sotang;
    }

    public void setSotang(int sotang) {
        Sotang = sotang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieudichvu='" +this.getTendichvu() +'\''+
                "dientichsudung='" + this.getDientichsudung() +'\''+
                "chiphithue'" + this.getChiphithue() +'\''+
                "soluongnguoi'" + this.getSoluongnguoi()+'\''+
                "kieuthue'" + this.getKieuthue()+'\'' +
                "dichvudikem" + this.getDichvudiekem() +'\''+
                "dongiga" + this.getDongiga() +'\'' +
              //  "giatien" + this.getGiatien() +'\'' +
                "Tieuchuanphong='" + Tieuchuanphong + '\'' +
                ", Motatiennghikhac='" + Motatiennghikhac + '\'' +
                ", Sotang=" + Sotang +
                '}';
    }
    @Override
    public  String showInfor()
    {
        return "House{" +
                "tieudichvu='" +this.getTendichvu() +'\''+
                "dientichsudung='" + this.getDientichsudung() +'\''+
                "chiphithue'" + this.getChiphithue() +'\''+
                "soluongnguoi'" + this.getSoluongnguoi()+'\''+
                "kieuthue'" + this.getKieuthue()+'\'' +
                "Tieuchuanphong='" + Tieuchuanphong + '\'' +
                ", Motatiennghikhac='" + Motatiennghikhac + '\'' +
                ", Sotang=" + Sotang +
                '}';
    }
}

