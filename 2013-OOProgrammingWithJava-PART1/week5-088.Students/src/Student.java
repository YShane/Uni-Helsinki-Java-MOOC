/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam
 */
public class Student {
    
    private String name;
    private String studentNumber;


    public Student(String givenName, String givenNumber){
        this.name = givenName;
        this.studentNumber = givenNumber;
        
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String toString(){
        
      return  "" + this.name + " (" + this.studentNumber + ")";
    }










}
