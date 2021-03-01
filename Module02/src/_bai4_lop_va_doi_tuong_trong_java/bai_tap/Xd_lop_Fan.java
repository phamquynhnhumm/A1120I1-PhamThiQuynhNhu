package _bai4_lop_va_doi_tuong_trong_java.bai_tap;

public class Xd_lop_Fan {
    public static void main(String[] args) {
        Xd_lop_Fan fan1 = new Xd_lop_Fan();
        Xd_lop_Fan fan2 = new Xd_lop_Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private  final int FAST = 3;
    private int  speed = SLOW;
    private boolean on = false;
    private  double radius=5;
    private String color= "Blue";
    public Xd_lop_Fan()
    {

    }
    public  Xd_lop_Fan( int speed, boolean on,double radius, String color)
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String  toString()
    {
        String tam ="";
        if(this.on)
        {
            tam =  "speed " + this.speed + "color" + this.color +"radius" + this.radius +"fan is on";
        }
        else {
            tam = "color" + this.color +"radius" + this.radius +"Fan is off";
        }
        return tam;


    }
}
