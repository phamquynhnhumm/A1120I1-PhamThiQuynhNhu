package FuramaResort.Controllers;

import FuramaResort.Commons.File;
import FuramaResort.Commons.StingUtilss;
import FuramaResort.Models.*;

import java.util.*;

public class MainController {
    public static void displayMainMenu() {
        int menus = 0;
        boolean isexit = true;
        do {
            System.out.println("-------------------------1");
            System.out.println("Menu :\n" +
                    "1. Thêm dịch vụ mới\n" +
                    "2. Hiển thị dịch vụ\n" +
                    "3. Thêm khách hàng mới\n" +
                    "4. Hiển thị thông tin của khách hàng\n" +
                    "5. Đặt phòng mới\n" +
                    "6. Hiển thị thông tin của nhân viên\n" +
                    "7. Thoát\n ");

            Scanner chonMenu = new Scanner(System.in);
            //  Xử lý lỗi nhập chữ
            try {
                System.out.print("Nhập vào lựa chọn của bạn :");
                menus = chonMenu.nextInt();
                boolean checkInput = true;
            } catch (Exception e) {
                boolean checkInput = false;
                chonMenu.nextLine();
            }

            switch (menus) {
                case 1:
                    addNewServies();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    System.out.println("xin chao3");
                    break;
                case 4:
                    System.out.println("xin chao4");
                    break;
                case 5:
                    System.out.println("xin chao5");
                    break;
                case 6:
                    System.out.println("xin chao6");
                    break;
                case 7:
                    isexit = false;
                    break;
                default:
                    System.out.println("Bạn  vi lòng chọn các mục  có trong Menu : 1-7");
            }
            System.out.println("Nhập 0 để tiếp tục chương trình  và nhập 1 nếu bạn muốn thoát khỏi chương trình");
            Scanner nhapx = new Scanner(System.in);
            int x = nhapx.nextInt();
            if (x == 0) {
                menus = 10;
            }
            else  if(x==1)
            {
                menus =7;
            }
            if (isexit = false)
                break;


        } while (menus < 1 || menus > 8);


    }

    public static void addNewServies() {
        int menu = 0;
        boolean isexits = true;
        do {
            System.out.println("-------------------------2");
            System.out.println(" THÊM DỊCH VỤ MỚI:\n" +
                    "1. Thêm Villa mới\n" +
                    "2. Thêm House mới\n" +
                    "3. Thêm Room mới\n" +
                    "4. Thoát\n" +
                    "5. Quay lại menu ban đầu");
            Scanner chonMenus = new Scanner(System.in);
            //  Xử lý lỗi nhập chữ
            try {
                System.out.print("Nhập vào lựa chọn của dịch vụ  bạn muốn thêm :");
                menu = chonMenus.nextInt();
                boolean checkInput = true;
            } catch (Exception e) {
                boolean checkInput = false;
                chonMenus.nextLine();
            }
            switch (menu) {
                case 1:
                    addNewServie("villa");
                    System.out.println("Đã thêm xong villa");
                    break;
                case 2:
                    addNewServie("house");
                    System.out.println("Đã thêm xong house");
                    break;
                case 3:
                    addNewServie("room");
                    System.out.println("Đã thêm xong room");
                    break;
                case 4:
                    isexits = false;
                    break;
                case 5:
                    System.out.println("Quay lại menu:");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Bạn vui lòng chọn dịch vụ muốn thêm từ 1->4 \n Nếu muốn thoát khỏi chương trình bạn hãy chọn 5!");

            }
            System.out.println("Nhập 0 để tiếp tục chương trình  và nhập 1 nếu bạn muốn thoát khỏi chương trình");
            Scanner nhapx = new Scanner(System.in);
            int x = nhapx.nextInt();
            if (x == 0) {
                menu = 10;
            }
            else  if(x==1)
            {
                menu =4;
            }
            if (isexits = false)
                break;

        } while (menu < 1 || menu > 5);

    }

    public static void addNewServie(String filleName) {

        Scanner nhapten = new Scanner(System.in);
        Scanner nhapdt = new Scanner(System.in);
        Scanner nhapcp = new Scanner(System.in);
        Scanner nhapsln = new Scanner(System.in);
        Scanner nhapkt = new Scanner(System.in);

        System.out.println("Tên dịch vụ ");
        String ten = nhapten.nextLine();
        System.out.print("Nhập diện tich :");
        double dienTich = nhapdt.nextDouble();
        System.out.print("Nhập chi phí  :");
        double chiPhi = nhapcp.nextDouble();
        System.out.print("Nhập số lượng người :");
        int soLuongNguoi = nhapsln.nextInt();
        System.out.print("Nhập kiểu thuê :");
        String kieuThue = nhapkt.nextLine();

        File.setFullPathFile(filleName);


        if (filleName.equals("villa")) {
            Scanner nhaptcp = new Scanner(System.in);
            Scanner nhapmttnk = new Scanner(System.in);
            Scanner nhapdthb = new Scanner(System.in);
            Scanner nhapst = new Scanner(System.in);

            System.out.print("Nhập tiêu chuẩn phòng :");
            String tieuChuanPhong = nhaptcp.nextLine();
            System.out.print("Nhập Mô tả tiện nghi khác :");
            String moTaTienNghiKhac = nhapmttnk.nextLine();
            System.out.print("Nhập diện tích hồ bơi :");
            double dienTichhoBoi = nhapdthb.nextDouble();
            System.out.print("Nhập số tầng:");
            int soTang = nhapst.nextInt();
            File.writeFile(new String[]{ten, String.valueOf(dienTich), String.valueOf(chiPhi),
                    String.valueOf(soLuongNguoi), kieuThue, tieuChuanPhong, moTaTienNghiKhac, String.valueOf(dienTichhoBoi), String.valueOf(soTang)});
            System.out.println("đọc ra");

            System.out.println(File.readFile());
        } else if (filleName.equals("house")) {
            Scanner nhaptcp = new Scanner(System.in);
            Scanner nhapmttnk = new Scanner(System.in);
            Scanner nhapst = new Scanner(System.in);

            System.out.print("Nhập tiêu chuẩn phòng :");
            String tieuChuanPhong = nhaptcp.nextLine();
            System.out.print("Nhập mô tả tiện nghi khác :");
            String moTaTienNghiKhac = nhapmttnk.nextLine();
            System.out.print("Nhập số tầng :");
            int soTang = nhapst.nextInt();
            File.writeFile(new String[]{ten, String.valueOf(dienTich), String.valueOf(chiPhi),
                    String.valueOf(soLuongNguoi), kieuThue, tieuChuanPhong, moTaTienNghiKhac, String.valueOf(soTang)});

            System.out.println("đọc ra");

            System.out.println(File.readFile());
        } else if (filleName.equals("room")) {
            Scanner nhapdvf = new Scanner(System.in);
            Scanner nhapdv = new Scanner(System.in);
            Scanner nhapgt = new Scanner(System.in);
            System.out.print("Nhập  tên dịch vụ free :");
            String dichVuFree = nhapdvf.nextLine();
            System.out.print("Nhập đơn vị :");
            String donVi = nhapdv.nextLine();
            System.out.print("Nhập giá tiền :");
            double giaTien = nhapgt.nextDouble();

            File.writeFile(new String[]{ten, String.valueOf(dienTich), String.valueOf(chiPhi),
                    String.valueOf(soLuongNguoi), kieuThue, dichVuFree, donVi, String.valueOf(giaTien)});

            System.out.println(File.readFile());
        }
    }

    private static void showServices() {
        int menu2 = 0;
        boolean isexits = true;
        do {
            System.out.println("------------------3");
            System.out.println("HIỂN THỊ DỊCH VỤ ");
            System.out.println("1. Hiển thị tất cả Villa\n" +
                    "2. Hiển thị tất cả House \n" +
                    "3. Hiển thị tất cả Room\n" +
                    "4. Hiển thị tất cả Villa tên không trùng nhau\n" +
                    "5. Hiển thị tất cả House tên không trùng nhau\n" +
                    "6. Hiển thị tất cả Room tên không trùng nhau\n" +
                    "7. Quay lại Menu\n" +
                    "8. Thoát\n");
            Scanner chonMenus = new Scanner(System.in);
            //  Xử lý lỗi nhập chữ
            try {
                System.out.print("Nhập vào lựa chọn của dịch vụ  bạn muốn thêm :");
                menu2 = chonMenus.nextInt();
                boolean checkInput = true;
            } catch (Exception e) {
                boolean checkInput = false;
                chonMenus.nextLine();
            }
            switch (menu2) {
                case 1:
                    showServie("villa");
                    break;
                case 2:
                    showServie("house");
                    break;
                case 3:
                    showServie("room");
                    break;
                case 4:
                    showServieNotName("villa");
                    break;
                case 5:
                    showServieNotName("house");
                    break;
                case 6:
                    showServieNotName("room");
                    break;
                case 7:
                    System.out.println("Quay lại menu:");
                    displayMainMenu();
                    break;
                case 8:
                    isexits = false;
                    break;
                default:
                    System.out.println("Bạn vui lòng chọn dịch vụ muốn thêm từ 1->4 \n Nếu muốn thoát khỏi chương trình bạn hãy chọn 5!");
            }
            System.out.println("Nhập 0 để tiếp tục chương trình  và nhập 1 nếu bạn muốn thoát khỏi chương trình");
            Scanner nhapx = new Scanner(System.in);
            int x = nhapx.nextInt();
            if (x == 0) {
                menu2 = 10;
            }
            else  if(x==1)
            {
                menu2 =8;
            }
            if (isexits = false)
                break;
        } while (menu2 < 1 || menu2 > 9);
    }



    public static List<Services> readdServices(String filename) {
        File.setFullPathFile(filename);
        List<String> proper = File.readFile();
        List<Services> listOfservices = new ArrayList<>();
        String[] propertiesElement = null;
        Services services = null;
        Dichvudikem dichvudikem = null;
        for (String properties : proper) {
            propertiesElement = properties.split(StingUtilss.COMMA);
            if (filename.equals("villa")) {
                services = new Villa();
                ((Villa) services).setTieuChuanPhong(propertiesElement[5]);
                ((Villa) services).setMoTaTienNghiKhac(propertiesElement[6]);
                ((Villa) services).setDienTichHoBoi(Double.parseDouble(propertiesElement[7]));
                ((Villa) services).setSoTang(Integer.parseInt(propertiesElement[8]));
            } else if (filename.equals("house")) {
                services = new House();
                ((House) services).setTieuChuan(propertiesElement[5]);
                ((House) services).setMoTaTienNghiKhac(propertiesElement[6]);
                ((House) services).setSoTang(Integer.parseInt(propertiesElement[7]));
            } else if (filename.equals("room")) {

                dichvudikem = new Dichvudikem(propertiesElement[5], propertiesElement[6], Double.parseDouble(propertiesElement[7]));
                services = new Room();
                ((Room) services).setDichvudikem(dichvudikem);
            }
            services.setTen(propertiesElement[0]);
            services.setDienTich(Double.parseDouble(propertiesElement[1]));
            services.setChiPhi(Double.parseDouble(propertiesElement[2]));
            services.setSoLuongNguoi(Integer.parseInt(propertiesElement[3]));
            services.setKieuThue(propertiesElement[4]);
            listOfservices.add(services);
        }
        return listOfservices;
    }

    private static void showServie(String name) {
       
        for (Services services : readdServices(name)) {
            services.showInfor();
        }
    }

    private static void showServieNotName(String fillename) {
        Set<String> set = new TreeSet<>();
        System.out.println("Tên Servires không trung ten");
        for (Services services : readdServices(fillename)) {
            set.add(services.getTen());
        }
        for (String name : set) {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
