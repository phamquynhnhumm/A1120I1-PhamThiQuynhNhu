package model;

public class Hopdong_dvdikem {
    private String id_dvdikem;
    private String id_hopdong;
    private  int soluong;

    public Hopdong_dvdikem(String id_dvdikem, String id_hopdong, int soluong) {
        this.id_dvdikem = id_dvdikem;
        this.id_hopdong = id_hopdong;
        this.soluong = soluong;
    }

    public String getId_dvdikem() {
        return id_dvdikem;
    }

    public void setId_dvdikem(String id_dvdikem) {
        this.id_dvdikem = id_dvdikem;
    }

    public String getId_hopdong() {
        return id_hopdong;
    }

    public void setId_hopdong(String id_hopdong) {
        this.id_hopdong = id_hopdong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
