package repository;

import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanvienRepositorylmpl implements NhanvienRepository {
    public static  final  String SELECT_NHANVIEN ="select nhanvien.id_nhanvien, ten_nhanvien,ngaysinh,socmnd,sdt,email,trinhdo.id_trinhdo,ten_trinhdo,vitri.ten_vitri, bophan.ten_bophan,luong,sonha, xa, huyen,tinh, quocgia  , user.ten_user from nhanvien\n" +
            "inner join diachi  on diachi.id_diachi = nhanvien.id_diachi\n" +
            "inner join trinhdo on trinhdo.id_trinhdo = nhanvien.id_trinhdo\n" +
            "inner join bophan on bophan.id_bophan = nhanvien.id_bophan\n" +
            "inner join vitri on vitri.id_vitri =  nhanvien.id_vitri\n" +
            "inner join user on user.ten_user = nhanvien.ten_user; ";
//      private String id_nhanvien;
//    private  String ten_nhanvien;
//    private Date ngaysinh;
//    private int socmnd;
//    private int sdt;
//    private String email;
//    private Trinhdo trinhdo;
//    private Vitri vitri;
//    private  Bophan bophan;
//    private  float luong;
//    private Diachi diachi;
//    private  User user;



    @Override
    public List<Nhanvien> finAll() {
        List<Nhanvien> nhanvienList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement= connection.prepareStatement(SELECT_NHANVIEN);
                resultSet = statement.executeQuery();
                Nhanvien nhanvien = null;
                while (resultSet.next())
                {
//    select nhanvien.id_nhanvien, ten_nhanvien,ngaysinh,socmnd,sdt,email,trinhdo.id_trinhdo,ten_trinhdo,vitri.ten_vitri, bophan.ten_bophan,luong,sonha,
//    xa, huyen,tinh, quocgia  , user.ten_user from nhanvien
                    String id_nhanvien = resultSet.getString("id_nhanvien");
                    String ten_nhanvien = resultSet.getString("ten_nhanvien");
                    String ngaysinh = resultSet.getString("ngaysinh");
                    int socmnd = resultSet.getInt("socmnd");
                    int sdt = resultSet.getInt("sdt");
                    String email = resultSet.getString("email");
                    String id_trinhdo = resultSet.getString("id_trinhdo");
                    String ten_trinhdo = resultSet.getString("ten_trinhdo");
                    String ten_vitri = resultSet.getString("ten_vitri");
                    String ten_bophan = resultSet.getString("ten_bophan");
                    float luong =Float.parseFloat(resultSet.getString("luong"));
                    String sonha = resultSet.getString("sonha");
                    String xa = resultSet.getString("xa");
                    String huyen = resultSet.getString("huyen");
                    String tinh = resultSet.getString("tinh");
                    String quocgia = resultSet.getString("quocgia");
                    String ten_user = resultSet.getString("ten_user");
                    nhanvien = new Nhanvien(id_nhanvien,ten_nhanvien,ngaysinh,socmnd,sdt,email, new Trinhdo(ten_trinhdo),new Vitri(ten_vitri), new Bophan(ten_bophan), luong,new Diachi(sonha,xa,huyen,tinh,quocgia), new User(ten_user));
                    nhanvienList.add(nhanvien);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return  nhanvienList;
    }

    @Override
    public void save(Nhanvien nhanvien) {

    }

    @Override
    public List<Nhanvien> finByName(String name) {
        return null;
    }

    @Override
    public Nhanvien update(String id, Nhanvien nhanvien) {
        return null;
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Nhanvien finById1(String id) {
        return null;
    }
}
