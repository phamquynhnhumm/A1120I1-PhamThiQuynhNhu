package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate {
    private static final String ID_KHACHHANG = "KH-[0-9]{4}";
    private static final String ID_DICHVU= "DV-[0-9]{4}";
    private static final String SCMND=  "[0-9]{12}|[0-9]{9}";
    private static final String SDT= "090[0-9]{7}|091[0-9]{7}|[(]84[)][+]90[0-9]{7}|[(]84[)][+]91[0-9]{7}";
    private  static  final  String EMAIL ="[A-Za-z0-9]*[@]{1}[A-Za-z0-9]*[.]com";
    private  static  final  String SOLUONG_SOTANG = "[1-9]*";
    private  static  final  String TAM="([1-9]{1}[0-9]*[.][0-9]*)|([1-9]{1}[0-9]*)";

    private  static Pattern pattern;
    private  static Matcher matcher;
    public static boolean validateID_KHACHHANG (String regex)
    {
        pattern = Pattern.compile(ID_KHACHHANG);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validateID_DICHVU (String regex)
    {
        pattern = Pattern.compile(ID_DICHVU);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validateSCMND (String regex)
    {
        pattern = Pattern.compile(SCMND);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validateSDT (String regex)
    {
        pattern = Pattern.compile(SDT);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validateEMAIL (String regex)
    {
        pattern = Pattern.compile(EMAIL);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validatSOLUONG_SOTANG (String regex)
    {
        pattern = Pattern.compile(SOLUONG_SOTANG);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validatTAM (String regex)
    {
        pattern = Pattern.compile(TAM);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }



}
