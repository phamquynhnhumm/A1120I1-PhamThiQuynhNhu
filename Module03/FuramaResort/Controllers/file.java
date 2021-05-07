package FuramaResort.Controllers;

import FuramaResort.Models.House;
import FuramaResort.Models.Room;
import FuramaResort.Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class file {
    public static final String File_Villa = "D:\\A112011PhamThiQuynhNhu\\Module02\\src\\FuramaResort\\file\\data\\Villa.txt";
    public static final String File_House = "D:\\A112011PhamThiQuynhNhu\\Module02\\src\\FuramaResort\\file\\data\\House.txt";
    public static final String File_Room = "D:\\A112011PhamThiQuynhNhu\\Module02\\src\\FuramaResort\\file\\data\\Room.txt";


    public static void writeVilla(Villa villa) {
        File file = new File(File_Villa);
        FileWriter fileWriter = null;
        BufferedWriter buffdWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            buffdWriter = new BufferedWriter(fileWriter);
            buffdWriter.write(villa.getTendichvu() + "," + villa.getDientichsudung() + "," + villa.getChiphithue() + "," + villa.getSoluongnguoi() + ","
                    + villa.getKieuthue() + "," + villa.getDichvudiekem() + "," + villa.getDongiga() + ","  + villa.getTieuchuanphong() + "," +
                    villa.getMotatienichkhac() + "," + villa.getDientichhoboi() + "," + villa.getSotang() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffdWriter != null) {
                    buffdWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Villa> readVilla() {

        List<Villa> list = new ArrayList<>();
        File file = new File(File_Villa);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                temp = line.split(",");
                double A = Double.parseDouble("1.1");
//                villa = new Villa(temp[0], Double.parseDouble(temp[1]), Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), temp[4],
//                        temp[5], temp[6],Integer.parseInt(temp[7]), temp[8], temp[9], Double.parseDouble(temp[10]), Integer.parseInt(temp[11]));
//                list.add(villa);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeHouse(House house) {
        File file = new File(File_House);
        FileWriter fileWriter = null;
        BufferedWriter buffdWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            buffdWriter = new BufferedWriter(fileWriter);
            buffdWriter.write( house.getTendichvu() + "," + house.getDientichsudung() + "," + house.getChiphithue() + "," + house.getSoluongnguoi() + ","
                    + house.getKieuthue() + "," + house.getDichvudiekem() + "," + house.getDongiga() + "," + house.getTieuchuanphong() +"," + house.getMotatiennghikhac()+"," + house.getSotang()+ "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffdWriter != null) {
                    buffdWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public List<House> readHouse() {

        List<House> list_house = new ArrayList<>();
        File file = new File(File_House);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] temp;
            House house;
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                temp = line.split(",");
               house = new House(temp[0],Double.parseDouble(temp[1]),Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), temp[4],
                        temp[5], temp[6], temp[8],temp[9],Integer.parseInt(temp[10]));
                list_house.add(house);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list_house;
    }

    public static void writeRoom(Room room) {
        File file = new File(File_Room);
        FileWriter fileWriter = null;
        BufferedWriter buffdWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            buffdWriter = new BufferedWriter(fileWriter);
            buffdWriter.write( room.getTendichvu() + "," + room.getDientichsudung() + "," + room.getChiphithue() + "," + room.getSoluongnguoi() + ","
                    + room.getKieuthue() + "," + room.getDichvudiekem() + "," + room.getDongiga() +  "," + room.getDichvumienphidikem()+ "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffdWriter != null) {
                    buffdWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Room> readRoom() {

        List<Room> list_room = new ArrayList<>();
        File file = new File(File_Room);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] temp;
              Room room;
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                temp = line.split(",");
                room = new Room(temp[0], Double.parseDouble(temp[1]), Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), temp[4],
                        temp[5], temp[6], temp[8]);
                list_room.add(room);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list_room;
    }
    public  void  services()
    {
        Scanner nhaptdv = new Scanner(System.in);
        Scanner nhapdtsd= new Scanner(System.in);
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
        String kt=  nhapkt.nextLine();
        System.out.print("Nhập dịch vụ đi kèm");
        String dvdk = nhapdvdk.nextLine();
        System.out.print("Nhâp đơn vị tính dịch vụ đi kèm:");
        String dv  = nhapdg.nextLine();
        System.out.println("Nhập  số tiền dịch vụ đi kèm :");
        double gt = nhapgt.nextFloat();

    }
}





