package repository;

import model.Dichvu;
import model.Kieuthue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DichvuRepositorylmpl implements  DichvuRepository{
    public static final String SELECT_DICHVU ="select dichvu.id_dichvu,ten_dichvu,dientich,chiphi,songuoi,kieuthue.id_kieuthue,kieuthue.ten_kieuthue from dichvu inner join kieuthue on  dichvu.id_kieuthue = kieuthue.id_kieuthue ;";
    public static final String INSERT_DICHVU =" insert into dichvu(id_dichvu,ten_dichvu,dientich,chiphi,songuoi,id_kieuthue) value (?,?,?,?,?,?);";

    @Override
    public List<Dichvu> finAll() {
        List<Dichvu> dichvuList= new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_DICHVU);
                resultSet = statement.executeQuery();
                Dichvu dichvu = null;
                while (resultSet.next()) {
                    String id_dichvu = resultSet.getString("id_dichvu");
                    String ten_dichvu = resultSet.getString("ten_dichvu");
                    float dientich=Float.parseFloat(resultSet.getString("dientich"));
                    float chiphi= Float.parseFloat(resultSet.getString("chiphi"));
                    String songuoi = resultSet.getString("songuoi");
                    String id_kieuthue = resultSet.getString("id_kieuthue");
                    String ten_kieuthue = resultSet.getString("ten_kieuthue");
                    dichvu = new Dichvu(id_dichvu,ten_dichvu,dientich,chiphi,songuoi, new  Kieuthue(id_kieuthue,ten_kieuthue));
                    dichvuList.add(dichvu);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return dichvuList;
    }
    @Override
    public void save(Dichvu dichvu) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(INSERT_DICHVU);
                statement.setString(1,dichvu.getId_dichvu());
                statement.setString(2,dichvu.getTen_dichvu());
                statement.setFloat(3,dichvu.getDientich());
                statement.setFloat(4,dichvu.getChiphi());
                statement.setString(5,dichvu.getSonguoi());
                statement.setString(6,dichvu.getKieuthue().getId_kieuthue());
                System.out.println("statemem save" + statement);
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
    public List<Dichvu> finByName(String name) {
        return null;
    }

    @Override
    public Dichvu update(String id, Dichvu dichvu) {
        return null;
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Dichvu finById1(String id) {
        return null;
    }
}
