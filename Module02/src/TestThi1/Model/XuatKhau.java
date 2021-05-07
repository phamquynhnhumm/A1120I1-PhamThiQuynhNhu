package TestThi1.Model;

public class XuatKhau  extends  SanPham{
    protected String giaXuatKhau;
    protected String quocGia;

    public XuatKhau(String id, String masp, String ten, String giaban, String soluong, String nhasanxuat, String giaXuatKhau, String quocGia) {
        super(id, masp, ten, giaban, soluong, nhasanxuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
    }

    public XuatKhau(String id, String masp, String ten, String giaban, String soluong, String nhasanxuat) {
        super(id, masp, ten, giaban, soluong, nhasanxuat);

    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return getId()+","+getMasp()+","+getTen()+","+getGiaban()+","+getSoluong()+","+getNhasanxuat()+","
                +getGiaXuatKhau()+","+getQuocGia();

    }

    @Override
    public void showInfor() {

    }
}
