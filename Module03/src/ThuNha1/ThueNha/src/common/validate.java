package common;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class validate {
    long dateIf(String ngaybatdau,String ngaykethuc){
        DateFormat kieungay = new SimpleDateFormat("yyyy/MM/dd");
        Date ngaybd=null;
        Date ngaykt=null;

        try {
            ngaybd=kieungay.parse(ngaybatdau);
            System.out.println(ngaybd);

            ngaykt=kieungay.parse(ngaykethuc);
            System.out.println(ngaykt);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        long miliseconds=ngaykt.getTime() - ngaybd.getTime();
        long days=miliseconds/(24 * 60 * 60 * 1000);
        return days;
    }
}

