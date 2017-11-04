package uml.edu.benmorrisrains.testconnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class TestDbServlet extends javax.servlet.http.HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //setup connection variables
        String user = "javastudent";
        String pass = "javastudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/stock_quotes?useSSL=false";

        String driver = "com.mysql.jdbc.Driver";

        //get connection to database

        try {
            PrintWriter out = response.getWriter();

            out.println("Connection to database: " + jdbcUrl);

            Class.forName(driver);

            Connection myConnection = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("Connection successful!");

            myConnection.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new ServletException(e);
        }


    }
}
