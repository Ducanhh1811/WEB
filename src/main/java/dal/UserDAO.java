package dal;

import dal.DBContext;
import model.user.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO extends DBContext {

    // Login
    public user login(String username, String password) {

        String sql = "SELECT userID, username, password, fullname, email, role, createdDate "
                + "FROM Users "
                + "WHERE username = ? AND password = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                user u = new user(
                        rs.getInt("userID"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("role"),
                        rs.getTimestamp("createdDate"));
                return u;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        user result = dao.login("anh", "123456");
        if (result == null) {
            System.out.println("Not found!");
        } else {
            System.out.print("Found: ");
            System.out.println(result);
        }
    }
}
