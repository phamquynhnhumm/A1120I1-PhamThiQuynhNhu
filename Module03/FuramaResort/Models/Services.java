package FuramaResort.Models;
public abstract class Services {
    private   String Tendichvu;
    private  double Dientichsudung;
    private  double Chiphithue;
    private  double Soluongnguoi;
    private  String Kieuthue;
    private  String Dichvudiekem;
    private String Dongiga;
//    private  double Giatien;

    public Services(String tendichvu, double dientichsudung, double chiphithue, double soluongnguoi, String kieuthue, String dichvudiekem, String dongiga) {
        Tendichvu = tendichvu;
        Dientichsudung = dientichsudung;
        Chiphithue = chiphithue;
        Soluongnguoi = soluongnguoi;
        Kieuthue = kieuthue;
        Dichvudiekem = dichvudiekem;
        Dongiga = dongiga;

    }

    public String getTendichvu() {
        return Tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        Tendichvu = tendichvu;
    }

    public double getDientichsudung() {
        return Dientichsudung;
    }

    public void setDientichsudung(double dientichsudung) {
        Dientichsudung = dientichsudung;
    }

    public double getChiphithue() {
        return Chiphithue;
    }

    public void setChiphithue(double chiphithue) {
        Chiphithue = chiphithue;
    }

    public double getSoluongnguoi() {
        return Soluongnguoi;
    }

    public void setSoluongnguoi(double soluongnguoi) {
        Soluongnguoi = soluongnguoi;
    }

    public String getKieuthue() {
        return Kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        Kieuthue = kieuthue;
    }

    public String getDichvudiekem() {
        return Dichvudiekem;
    }

    public void setDichvudiekem(String dichvudiekem) {
        Dichvudiekem = dichvudiekem;
    }

    public String getDongiga() {
        return Dongiga;
    }

    public void setDongiga(String dongiga) {
        Dongiga = dongiga;
    }

//    public double getGiatien() {
//        return Giatien;
//    }
//
//    public void setGiatien(double giatien) {
//        Giatien = giatien;
//    }

    @Override
    public String toString() {
        return "Services{" +
                "Tendichvu='" + Tendichvu + '\'' +
                ", Dientichsudung=" + Dientichsudung +
                ", Chiphithue=" + Chiphithue +
                ", Soluongnguoi=" + Soluongnguoi +
                ", Kieuthue='" + Kieuthue + '\'' +
                ", Dichvudiekem='" + Dichvudiekem + '\'' +
                ", Dongiga='" + Dongiga + '\'' +
              //  ", Giatien='" + Giatien + '\'' +
                '}';
    }

    public  abstract  String showInfor();

    public static void main(String[] args) {
        System.out.println( "xin cao");
    }

}
