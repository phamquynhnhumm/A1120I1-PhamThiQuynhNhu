package common;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class validate {
    public static boolean dateIf(String ngaybatdau, String ngaykethuc) {
        SimpleDateFormat kieungay = new SimpleDateFormat("yyyy/MM/dd");
        Date ngaybd = null;
        Date ngaykt = null;
        try {
            ngaybd = kieungay.parse(ngaybatdau);
            System.out.println(ngaybd);

            ngaykt = kieungay.parse(ngaykethuc);
            System.out.println(ngaykt);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        long miliseconds = ngaykt.getTime() - ngaybd.getTime();
        long days = miliseconds / (24 * 60 * 60 * 1000);
        System.out.println("so ngay " + days);
        if(days > 5)
        {return  true;}
        else {
            return false;
        }
//        return days;
    }
}