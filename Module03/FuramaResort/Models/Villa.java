package FuramaResort.Models;

import java.sql.Struct;

public class Villa extends Services {
    private String Tieuchuanphong;
    private  String Motatienichkhac;
    private  double Dientichhoboi;
    private  int Sotang;


    public Villa(String tendichvu, double dientichsudung, double chiphithue, double soluongnguoi, String kieuthue, String dichvudiekem, String dongiga,  String tieuchuanphong, String motatienichkhac, double dientichhoboi, int sotang) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoi, kieuthue, dichvudiekem, dongiga);
        Tieuchuanphong = tieuchuanphong;
        Motatienichkhac = motatienichkhac;
        Dientichhoboi = dientichhoboi;
        Sotang = sotang;
    }

    public String getTieuchuanphong() {
        return Tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        Tieuchuanphong = tieuchuanphong;
    }

    public String getMotatienichkhac() {
        return Motatienichkhac;
    }

    public void setMotatienichkhac(String motatienichkhac) {
        Motatienichkhac = motatienichkhac;
    }

    public double getDientichhoboi() {
        return Dientichhoboi;
    }

    public void setDientichhoboi(double dientichhoboi) {
        Dientichhoboi = dientichhoboi;
    }

    public int getSotang() {
        return Sotang;
    }

    public void setSotang(int sotang) {
        Sotang = sotang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieudichvu='" +this.getTendichvu() +'\''+
                "dientichsudung='" + this.getDientichsudung() +'\''+
                "chiphithue'" + this.getChiphithue() +'\''+
                "soluongnguoi'" + this.getSoluongnguoi()+'\''+
                "kieuthue'" + this.getKieuthue()+'\'' +
                "Tieuchuanphong='" + Tieuchuanphong + '\'' +
                ", Motatienichkhac='" + Motatienichkhac + '\'' +
                ", Dientichhoboi=" + Dientichhoboi +
                ", Sotang=" + Sotang +
                '}';
    }

    @Override
    public  String showInfor()
    {

        System.out.println("Villa :");
        return "Villa{" +
                "tieudichvu='" +this.getTendichvu() +'\''+
                "dientichsudung='" + this.getDientichsudung() +'\''+
                "chiphithue'" + this.getChiphithue() +'\''+
                "soluongnguoi'" + this.getSoluongnguoi()+'\''+
                "kieuthue'" + this.getKieuthue()+'\'' +
                "Tieuchuanphong='" + Tieuchuanphong + '\'' +
                ", Motatienichkhac='" + Motatienichkhac + '\'' +
                ", Dientichhoboi=" + Dientichhoboi +
                ", Sotang=" + Sotang +
              '}';
    }
}
