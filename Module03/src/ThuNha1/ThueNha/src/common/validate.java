package common;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class validate {

     public long dateIf(String ngaybatdau,String ngaykethuc) throws ParseException {
        DateFormat kieungay = new SimpleDateFormat("dd/MM/yyyyy");
        Date ngaybd=null;
        Date ngaykt=null;
            ngaybd=kieungay.parse(ngaybatdau);
            System.out.println(ngaybd);

            ngaykt=kieungay.parse(ngaykethuc);
            System.out.println(ngaykt);
        long miliseconds=ngaykt.getTime() - ngaybd.getTime();
        long days=miliseconds/(24 * 60 * 60 * 1000);
        return days;
    }
}

