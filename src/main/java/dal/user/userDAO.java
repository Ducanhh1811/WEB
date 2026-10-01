package dal.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import dal.DBContext;
import model.user.user;

public class userDAO extends DBContext {
    public user Login(String username, String password) {
        String sql = "  select * from Users\r\n" + //
                "  WHERE [username] like '%?%' and [password] like '%?%'";
        try {
            PreparedStatement ptm = connection.prepareStatement(sql);
            ptm.setString(1, username);
            ptm.setString(2, password);
            ResultSet rs = ptm.executeQuery();
            if (rs.next()) {
                user u = new user();
                rs.getInt("userID");
                rs.getString("username");
                rs.getString("password");
                rs.getString("fullname");
                rs.getString("email");
                rs.getString("role");
                rs.getTimestamp("createdDate");
                return u;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
