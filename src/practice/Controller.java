/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.sql.*;

/**
 *
 * @author user
 */
public class Controller {
    public static int addStudent(Student student) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection;
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/RegisterForm", "root", "123");
        
        String query = "INSERT INTO `registration`(`StudentsID`, `fname`, `lname`, `gender`, `City`, `mail`, `password`) VALUES ('"+student.getStudentsID() + "','" + student.getFname() + "','"+student.getLname() + "','"+student.getGender()+"','"+student.getCity()+"','"+student.getMail()+"','"+student.getPassword()+"')";
        
        
        Statement stm = connection.createStatement();
        
        int executeUpdate = stm.executeUpdate(query);
        
        
        return executeUpdate;
    }
    
}
