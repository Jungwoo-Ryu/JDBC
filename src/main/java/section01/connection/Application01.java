package section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application01 {
    public static void main(String[] args) {
        Connection con = null;

        try {

            // 사용할 드라이버를 등록 class 클래스는 class의 메타정보를 가지고있다.
            // forName 메소드에 풀 클래스 명을 등록하면
            // 해당 클래스를 메모리에 올려 사용할 준비를 마친다.
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "ohgiraffers", "ohgiraffers");
            System.out.println("con = " + con);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null){
                try{
                    con.close();
                } catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
