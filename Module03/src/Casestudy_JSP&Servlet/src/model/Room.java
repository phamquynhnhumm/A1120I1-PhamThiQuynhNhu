package model;

public class Room {
    private  String id_room;
    private String ten_rooom;
    private String tendichvufreedikem;
    private  String id_dichvu;

    public Room(String id_room, String ten_rooom, String tendichvufreedikem, String id_dichvu) {
        this.id_room = id_room;
        this.ten_rooom = ten_rooom;
        this.tendichvufreedikem = tendichvufreedikem;
        this.id_dichvu = id_dichvu;
    }

    public String getId_room() {
        return id_room;
    }

    public void setId_room(String id_room) {
        this.id_room = id_room;
    }

    public String getTen_rooom() {
        return ten_rooom;
    }

    public void setTen_rooom(String ten_rooom) {
        this.ten_rooom = ten_rooom;
    }

    public String getTendichvufreedikem() {
        return tendichvufreedikem;
    }

    public void setTendichvufreedikem(String tendichvufreedikem) {
        this.tendichvufreedikem = tendichvufreedikem;
    }

    public String getId_dichvu() {
        return id_dichvu;
    }

    public void setId_dichvu(String id_dichvu) {
        this.id_dichvu = id_dichvu;
    }
}
