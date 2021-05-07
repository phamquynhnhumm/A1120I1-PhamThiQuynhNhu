package FuramaResort.Controllers;

import FuramaResort.Models.Villa;

import java.util.LinkedList;
import java.util.Scanner;

public class MainController extends file {
    public void displayMainMenu() {

        System.out.println(
                "Menu :\n" +
                        "1. Thêm dịch vụ mới\n" +
                        "2. Hiển thị dịch vụ\n" +
                        "3. Thêm khách hàng mới\n" +
                        "4. Hiển thị thông tin của khách hàng\n" +
                        "5. Thêm đặt chỗ mới\n" +
                        "6. Hiển thị thông tin của nhận viên\n" +
                        "7. Thoát\n" +
                        "Chọn menu :"

        );
        boolean test = true;
        int n;
        Scanner nhapn = new Scanner(System.in);
        n = nhapn.nextInt();
        do {
            switch (n) {
                case 1:
                    addNewServies();
                    test = false;
                    break;
                case 2:
                    System.out.println("chức năng số 2 Show Services thì chương trình sẽ gọi phương thức showServices() ở Task 3.");
                    test = false;
                    break;
                case 3:
                    System.out.println("tastk5");
                    test = false;
                    break;
                case 4:
                    System.out.println("tack5");
                    test = false;
                    break;
                case 5:
                    System.out.println("task7");
                    test = false;
                    break;
                case 6:
                    System.out.println("task9");
                    test = false;
                    break;
                case 7:
                    System.out.println("exit");
                    test = true;
                    break;
                default:
                    System.out.println("Bạn hãy nhập chon 1-6 trong menu");
            }

        } while (!test);
    }

    public void addNewServies() {

        System.out.println("" +
                "Menu :\n" +
                "1.Thêm Villa mới  \n" +
                "2. Thêm House mới \n" +
                "3. Thêm Room mới \n" +
                "4. Quay lại menu\n" +
                "5. Thoát\n" +
                "Chọn dịch vụ mà bạn muốn nhập thông tin:  ");
        int n;
        Scanner nhapn = new Scanner(System.in);
        n = nhapn.nextInt();
        boolean test = true;
        switch (n) {
            case 1:
                System.out.println("THÊM VILLA MỚI  :\n");
                System.out.print("Nhập vào số vila bạn muốn thêm :");
                Scanner nhapvilla = new Scanner(System.in);
                int villas1 = nhapvilla.nextInt();
                Villa villa1 = null;
                LinkedList<Villa> villas = new LinkedList<>();
                for (int i = 0; i < villas1; i++) {
                    Scanner nhapcp = new Scanner(System.in);
                    Scanner nhapmttik = new Scanner(System.in);
                    Scanner nhaodthb = new Scanner(System.in);
                    Scanner nhapst = new Scanner(System.in);
                    Scanner nhaptdv = new Scanner(System.in);
                    Scanner nhapdtsd = new Scanner(System.in);
                    Scanner nhapcpt = new Scanner(System.in);
                    Scanner nhapsln = new Scanner(System.in);
                    Scanner nhapkt = new Scanner(System.in);
                    Scanner nhapdvdk = new Scanner(System.in);
                    Scanner nhapdg = new Scanner(System.in);
                    Scanner nhapgt = new Scanner(System.in);
                    System.out.print("Nhập vào tên dịch vụ :");
                    String tdv = nhaptdv.nextLine();
                    System.out.print("Nhập diện tích sử dùng :");
                    double dtsd = nhapdtsd.nextFloat();
                    System.out.print("Nhập chi phú thuê:");
                    double cpt = nhapcpt.nextFloat();
                    System.out.print("Nhập số lượng người:");
                    double sln = nhapsln.nextFloat();
                    System.out.print("Nhập kiểu thuê :");
                    String kt = nhapkt.nextLine();
                    System.out.print("Nhập dịch vụ đi kèm");
                    String dvdk = nhapdvdk.nextLine();
                    System.out.print("Nhâp đơn vị tính dịch vụ đi kèm:");
                    String dv = nhapdg.nextLine();
                    System.out.println("Nhập  số tiền dịch vụ đi kèm :");
                    double gt = nhapgt.nextFloat();
                    System.out.print("Nhập vào tiêu chuẩn phòng :");
                    String tcp = nhapcp.nextLine();
                    System.out.print("Nhập mô tả tiện ích khác :");
                    String mttik = nhapmttik.nextLine();
                    System.out.print("Nhập diện tích hồ bơi :");
                    double dthb = nhaodthb.nextFloat();
                    System.out.print("Nhập số tầng :");
                    int st = nhapst.nextInt();
//                    villa1 = new Villa(tdv, dtsd, cpt, sln, kt, dvdk, dv, 9.0, tcp, mttik, dthb, st);
//                    villas.add(villa1);
                }
                System.out.println("Danh sách villa sau khi đã được thêm mới là  :");
                for (Villa villa2 : villas) {
                    System.out.println(villa2);
                    writeVilla(villa2);
                }

                test = false;
                break;
            case 2:
                services();
                test = false;
                break;
            case 3:
                services();
                test = false;
                break;
            case 4:
                services();
                test = false;
                break;
            case 5:
                test = true;
                break;
            default:
                System.out.println("Bạn hãy nhập chon 1-6 trong menu");
        }
    }

    public void themVila() {
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}

