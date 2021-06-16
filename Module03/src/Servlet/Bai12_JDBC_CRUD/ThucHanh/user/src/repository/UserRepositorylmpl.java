package repository;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositorylmpl  implements UserRepository{

    public static final String SELECT_ALL_USERS ="select * from user ";

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        //b1 tạo đối tượng connection
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_ALL_USERS);
                resultSet = statement.executeQuery();
                User user = null;
                while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    String name= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(id,name,email,country);
                    userList.add(user);
                }
            } catch (SQLException e) {
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
        return userList;
    }

    @Override
    public void save(User user) {


    }

    @Override
    public User finById(int id) {
        return null;
    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void remove(int id) {

    }
}
