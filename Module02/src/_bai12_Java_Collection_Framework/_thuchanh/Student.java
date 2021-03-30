package _bai12_Java_Collection_Framework._thuchanh;

public class Student {
     public String Ten;
     public int Tuoi;
     public String ĐiaChi;

    public Student(String ten, int tuoi, String điaChi) {
        Ten = ten;
        Tuoi = tuoi;
        ĐiaChi = điaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getĐiaChi() {
        return ĐiaChi;
    }

    public void setĐiaChi(String điaChi) {
        ĐiaChi = điaChi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Ten='" + Ten + '\'' +
                ", Tuoi=" + Tuoi +
                ", ĐiaChi='" + ĐiaChi + '\'' +
                '}';
    }
}
