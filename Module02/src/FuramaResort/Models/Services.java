package FuramaResort.Models;

public abstract class Services {
    protected String ten;
    protected double dienTich;
    protected double chiPhi;
    protected int soLuongNguoi;
    protected String kieuThue;

    public Services() {
    }

    public Services(String ten, double dienTich, double chiPhi, int soLuongNguoi, String kieuThue) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Services{" +
                "ten='" + ten + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public abstract void showInfor();
}
