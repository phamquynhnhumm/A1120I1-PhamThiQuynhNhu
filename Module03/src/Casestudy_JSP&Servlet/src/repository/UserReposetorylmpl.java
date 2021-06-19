package repository;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserReposetorylmpl  implements  UserReposetory{
    public static final String SELECT_USER = "select * from user";
    public static final String INSERT_USER = "insert into user(ten_user,matkhau) value (?,?);";
    private static final String SELECT_USER_ID= "select * from user where ten_user= ?;";

    @Override
    public List<User> finAll() {
        List<User> userList= new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement= null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement= connection.prepareStatement(SELECT_USER);
                resultSet = statement.executeQuery();
                User user = null;
                while (resultSet.next())
                {
                    String ten_user = resultSet.getString("ten_user");
                    String matkhau = resultSet.getString("matkhau");
                    user = new User(ten_user,matkhau);
                    userList.add(user);
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

        return userList;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public List<User> finByName(String name) {
        return null;
    }

    @Override
    public User update(String id, User user) {
        return null;
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public User finById1(String id) {
        User user = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement= null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement= connection.prepareStatement(SELECT_USER_ID);
                statement.setString(1,"ten_user");
                resultSet = statement.executeQuery();
                while (resultSet.next())
                {
                    String ten_user = resultSet.getString("ten_user");
                    String matkhau = resultSet.getString("matkhau");
                    user = new User(ten_user,matkhau);
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
        return user;
    }
}
