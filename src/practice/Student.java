/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author user
 */
public class Student {
    private String StudentsID;
    private String lname;
    private String fname;
    private String gender;
    private String City;
    private String mail;
    private String password;

    public Student() {
    }
    
    public Student(String StudentsID, String lname, String fname, String gender, String City, String mail, String password){
        this.StudentsID = StudentsID;
        this.lname = lname;
        this.fname = fname;
        this.gender = gender;
        this.City = City;
        this.mail = mail;
        this.password = password;
        
    }

    public String getStudentsID() {
        return StudentsID;
    }

    public void setStudentsID(String StudentsID) {
        this.StudentsID = StudentsID;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
