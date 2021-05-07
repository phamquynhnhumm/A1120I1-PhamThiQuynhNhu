package TestThi1.exception;

import TestThi1.Model.NhapKhau;
import TestThi1.Model.SanPham;
import TestThi1.Model.XuatKhau;

import java.util.Scanner;

public class CommonService {
    public SanPham inputSanPham(int typeSanPham) {
        String id;
        String masp;
        String ten;
        String giaban;
        String soluong;
        String nhasanxuat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham");
        id = sc.nextLine();
        System.out.println("Nhap masp");
        masp = sc.nextLine();
        System.out.println("Nhap ten");
        ten = sc.nextLine();
        System.out.println("Nhap gia ban");
        giaban = sc.nextLine();
        System.out.println("nhap soluong");
        soluong = sc.nextLine();
        System.out.println("Nhap nha san xuat");
        nhasanxuat = sc.nextLine();
        switch (typeSanPham) {
            case 1:
                return new NhapKhau(id, masp, ten, giaban, soluong, nhasanxuat);
            case 2:
                return new XuatKhau(id, masp, ten, giaban, soluong, nhasanxuat);
        }
        return null;
    }
}