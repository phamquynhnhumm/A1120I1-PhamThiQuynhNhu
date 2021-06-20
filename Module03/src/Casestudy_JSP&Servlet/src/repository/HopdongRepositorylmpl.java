package repository;

import model.Dichvu;
import model.Hopdong;
import model.Khachhang;
import model.Nhanvien;

import javax.naming.NamingEnumeration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HopdongRepositorylmpl implements  HopdongRepository{
    public  static  final String SELECT_HOPDONG = "select id_hopdong,ngaybatau,ngayketthuc,sotiendatcuoc ,tongsotienthanhtoan,nhanvien.ten_nhanvien," +
            "khachhang.ten_khachhang, dichvu.ten_dichvu,hopdong.id_nhanvien,hopdong.id_khachhang,hopdong.id_dichvu from hopdong" +
            " inner join khachhang on khachhang.id_khachhang = hopdong.id_khachhang" +
            " inner join dichvu on hopdong.id_dichvu = dichvu.id_dichvu " +
            " inner join nhanvien on hopdong.id_nhanvien = nhanvien.id_nhanvien;";

    @Override
    public List<Hopdong> finAll() {
        List<Hopdong> hopdongList =  new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement= null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_HOPDONG);
                resultSet =statement.executeQuery();
                Hopdong hopdong = null;
                while (resultSet.next())
                {
                    String id_hopdong = resultSet.getString("id_hopdong");
                    String ngaybatdau = resultSet.getString("ngaybatau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    float  sotiendatcuoc =resultSet.getFloat("sotiendatcuoc");
                    float  tongsotienthanhtoan =resultSet.getFloat("tongsotienthanhtoan");
                    String ten_nhanvien = resultSet.getString("ten_nhanvien");
                    String ten_khachhang = resultSet.getString("ten_khachhang");
                    String ten_dichvu = resultSet.getString("ten_dichvu");
                    String id_nhanvien = resultSet.getString("id_nhanvien");
                    String id_khachhang = resultSet.getString("id_khachhang");
                    String id_dichvu = resultSet.getString("id_dichvu");
                    hopdong = new Hopdong(id_hopdong,ngaybatdau,ngayketthuc,sotiendatcuoc,tongsotienthanhtoan,new Nhanvien(id_nhanvien), new Khachhang(id_khachhang), new Dichvu(id_dichvu));
                    hopdongList.add(hopdong);
                    System.out.println("Danh sach hop dong: "+ id_nhanvien);
                    System.out.println("Danh sach hop dong: "+ new Nhanvien(id_nhanvien).getTen_nhanvien());
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return hopdongList;
    }

    @Override
    public void save(Hopdong hopdong) {

    }

    @Override
    public List<Hopdong> finByName(String name) {
        return null;
    }

    @Override
    public Hopdong update(String id, Hopdong hopdong) {
        return null;
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Hopdong finById1(String id) {
        return null;
    }
}
