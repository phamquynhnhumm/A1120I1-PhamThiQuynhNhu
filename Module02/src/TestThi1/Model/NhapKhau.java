package TestThi1.Model;

public class NhapKhau extends SanPham {
    protected String giaNhapKhau;
    protected String tinhThanhNhap;
    protected String thueNhapKhau;

    public NhapKhau(String id, String masp, String ten, String giaban, String soluong, String nhasanxuat) {
        super(id, masp, ten, giaban, soluong, nhasanxuat);

    }

    public NhapKhau(String id, String masp, String ten, String giaban, String soluong, String nhasanxuat, String giaNhapKhau, String tinhThanhNhap, String thueNhapKhau) {
        super(id, masp, ten, giaban, soluong, nhasanxuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }


    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return getId() + "," + getMasp() + "," + getTen() + "," + getGiaban() + "," + getSoluong() + "," + getNhasanxuat() + ","
                + getGiaNhapKhau() + "," + getTinhThanhNhap() + "," + getThueNhapKhau();

    }

    @Override
    public void showInfor() {

    }


}

