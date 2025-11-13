import java.sql.*;

public class Employee {
    public static void main(String[] args) {
        String db_url="jdbc:postgresql://localhost:5432/employee";
        String user = "postgres";
        String pass = "123";
        try{
            Connection conn = DriverManager.getConnection(db_url,user,pass);
            Statement stml = conn.createStatement();
            String sql = "select * from employee";
            ResultSet rs = stml.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String design = rs.getString("design");
                String dept = rs.getString("dept");
                System.out.println("ID: " + id + ", Name: " + name + ", Design: " + design + ", Department: " + dept);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
