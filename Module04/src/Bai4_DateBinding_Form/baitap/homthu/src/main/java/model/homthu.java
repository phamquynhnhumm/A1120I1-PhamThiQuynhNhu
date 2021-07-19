package model;


public class homthu {
    private String ngonngu;
    private int size;
    private String thurac;
    private String noidung;

    public homthu(String ngonngu, int size, String thurac, String noidung) {
        this.ngonngu = ngonngu;
        this.size = size;
        this.thurac = thurac;
        this.noidung = noidung;
    }

    public homthu() {

    }
    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getThurac() {
        return thurac;
    }

    public void setThurac(String thurac) {
        this.thurac = thurac;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
