package FuramaResort.Models;

public class Room extends  Services {
    private  String Dichvumienphidikem;

    public Room(String tendichvu, double dientichsudung, double chiphithue, double soluongnguoi, String kieuthue, String dichvudikem, String dongiga,   String dichvumienphidikem) {
        super(tendichvu, dientichsudung, chiphithue,soluongnguoi,kieuthue,dichvudikem,dongiga);
        Dichvumienphidikem = dichvumienphidikem;
    }

    public String getDichvumienphidikem() {
        return Dichvumienphidikem;
    }

    public void setDichvumienphidikem(String dichvumienphidikem) {
        Dichvumienphidikem = dichvumienphidikem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "tieudichvu='" +this.getTendichvu() +'\''+
                "dientichsudung='" + this.getDientichsudung() +'\''+
                "chiphithue'" + this.getChiphithue() +'\''+
                "soluongnguoi'" + this.getSoluongnguoi()+'\''+
                "kieuthue'" + this.getKieuthue()+'\'' +
                "Dichvumienphidikem='" + Dichvumienphidikem + '\'' +
                '}';
    }

    @Override
    public  String showInfor()
    {
        System.out.println("Room :");
        return "Room{" +
                "tieudichvu='" +this.getTendichvu() +'\''+
                "dientichsudung='" + this.getDientichsudung() +'\''+
                "chiphithue'" + this.getChiphithue() +'\''+
                "soluongnguoi'" + this.getSoluongnguoi()+'\''+
                "kieuthue'" + this.getKieuthue()+'\'' +
                "Dichvumienphidikem='" + Dichvumienphidikem + '\'' +
                '}';
    }
}
