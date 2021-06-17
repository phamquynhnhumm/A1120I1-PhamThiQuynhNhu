package repository;

import model.Diachi;
import model.Khachhang;
import model.Loaikhach;
import model.User;
import netscape.javascript.JSUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KhachhangRepositorylmpl implements KhachhangRepository  {
    public static final String SELECT_KHACHHANG = "select id_khachhang,ten_khachhang,ngaysinh,gioitinh,socmnd,sdt,email,ten_loaikhach, sonha,xa,huyen,tinh,quocgia,loaikhach.id_loaikhach, diachi.id_diachi from khachhang left join diachi on khachhang.id_diachi = diachi.id_diachi left join loaikhach on loaikhach.id_loaikhach = khachhang.id_loaikhach;";
    public static final String INSERT_KHACHHANG =" insert into khachhang(id_khachhang,ten_khachhang,ngaysinh,gioitinh,socmnd,sdt,email,id_loaikhach, id_diachi) value (?,?,?,?,?,?,?,?,?);";
    public static final String DELETE_KHACHHANG ="delete from khachhang where id_khachhang=?;";
    private static final String UPDATE_KHACHHANG ="update khachhang set ten_khachhang =?,ngaysinh=?,gioitinh=?,socmnd=?,sdt=?,email=?,id_loaikhach=?, id_diachi=? where id_khachhang=? ;";
    private static final String SELECT_KHACHHANG_NAME= "select id_khachhang,ten_khachhang,ngaysinh,gioitinh,socmnd,sdt,email,ten_loaikhach, sonha,xa,huyen,tinh,quocgia,loaikhach.id_loaikhach, diachi.id_diachi from khachhang left join diachi on khachhang.id_diachi = diachi.id_diachi left join loaikhach on loaikhach.id_loaikhach = khachhang.id_loaikhach where ten_khachhang= '%?';";
    private static final String SELECT_USERS_ID =  "select  * from khachhang where id_khachhang= ?";
    @Override
    public List<Khachhang> finAll() {
        List<Khachhang> khachhangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_KHACHHANG);
                resultSet= statement.executeQuery();
                System.out.println("kết nối thanhg công");
                Khachhang khachhang = null;
                while (resultSet.next())
                {
                    String id_khachhang=resultSet.getString("id_khachhang");
                    String ten_khachhang = resultSet.getString("ten_khachhang");
                     Date ngaysinh= resultSet.getDate("ngaysinh");
                    String gioitinh = resultSet.getString("gioitinh");
                     int socmnd= resultSet.getInt("socmnd");
                     int sdt= resultSet.getInt("sdt");
                    String email=resultSet.getString("email");
                    String ten_loaikhach= resultSet.getString("ten_loaikhach")   ;
                    String sonha= resultSet.getString("sonha");
                    String xa= resultSet.getString("xa");
                    String huyen= resultSet.getString("huyen");
                    String tinh= resultSet.getString("tinh");
                    String quocgia= resultSet.getString("quocgia");
                    String id_loaikhach =resultSet.getString("id_loaikhach");
                    String id_diachi = resultSet.getString("id_diachi");
                    khachhang = new Khachhang(id_khachhang,ten_khachhang,ngaysinh,gioitinh,socmnd,sdt,email,new Loaikhach(id_loaikhach,ten_loaikhach),new Diachi(id_diachi,sonha,xa
                    ,huyen,tinh,quocgia));
                    khachhangList.add(khachhang);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return khachhangList;
    }

    @Override
    public void save(Khachhang khachhang) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(INSERT_KHACHHANG);
//                id_khachhang,ten_khachhang,ngaysinh,gioitinh,socmnd,sdt,email,id_loaikhach, id_diachi
                statement.setString(1,khachhang.getId_khachhang());
                statement.setString(2,khachhang.getTen_khachhang());
                statement.setDate(3, (java.sql.Date) khachhang.getNgaysinh());
                statement.setInt(4,khachhang.getSocmnd());
                statement.setInt(5,khachhang.getSdt());
                statement.setString(6,khachhang.getEmail());
                statement.setString(7,khachhang.getLoaikhach().getId_loaikhach());
                statement.setString(8,khachhang.getDiachi().getId_diachi());

                statement.executeUpdate();

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

    }

    @Override
    public List<Khachhang> finByName(String name) {
        List<User> userList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_KHACHHANG_NAME);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    public Khachhang update(int id, Khachhang khachhang) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Khachhang finById1(int id) {
        return null;
    }
}
