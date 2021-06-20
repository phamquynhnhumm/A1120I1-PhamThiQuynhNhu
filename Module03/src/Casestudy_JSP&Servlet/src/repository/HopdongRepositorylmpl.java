package repository;

import model.Hopdong;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HopdongRepositorylmpl implements  HopdongRepository{
    public  static  final String SELECT_HOPDONG ="\n" +
            "select id_hopdong,ngaybatau,ngayketthuc,sotiendatcuoc ,tongsotienthanhtoan,nhanvien.ten_nhanvien," +
            "khachhang.ten_khachhang, dichvu.ten_dichvu from hopdong\n" +
            " inner join khachhang on khachhang.id_khachhang = hopdong.id_khachhang \n" +
            " inner join dichvu on hopdong.id_dichvu = dichvu.id_dichvu \n" +
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

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
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
