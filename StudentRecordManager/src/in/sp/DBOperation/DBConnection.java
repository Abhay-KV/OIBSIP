/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.sp.DBOperation;
import java.sql.*;
/**
 *
 * @author Abhay verma
 */
public class DBConnection {
    public static Connection con;
    public static Connection getConnection() {
       
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String url="jdbc:mysql://localhost:3306/StudentGradeTracker";
             String user="root";
             String password ="Abhay@123";
             con = DriverManager.getConnection(url,user,password);
              
              }
    catch(Exception e){
    System.out.println(e);
         
}
   return con; }
}
