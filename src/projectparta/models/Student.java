/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectparta.models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BergouLan
 */
public class Student {

    private String firstName;
    private String lastName;
    private int tuitionFees;
    private ArrayList<Course> courses =  new ArrayList<Course>();
    public static ArrayList<Student> studentList = new ArrayList<>();
    private Assignment myAssignment;
    

    public Student() {

    }
public void addStudent(Student s){
studentList.add(s);
}
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setTuitionFees(int newTuitionFees) {
        this.tuitionFees = newTuitionFees;
    }

    public int getTuitionFees() {
        return this.tuitionFees;
    }

   
    public void getStudentsPerCourse(Course course){
        for (int i = 0; i < course.getEnrolledStudents().size(); i++) {
            Student s = course.getEnrolledStudents().get(i);
            System.out.println(s);
            
        }
        
      
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", tuitionFees=" + tuitionFees;
    }

}
