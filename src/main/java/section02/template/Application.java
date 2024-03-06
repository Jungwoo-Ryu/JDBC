package section02.template;

import java.sql.Connection;

import static section02.template.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {

       Connection con = getConnection();

        System.out.println("con = " + con);
    }


}
