/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectparta.models;

import java.util.ArrayList;

/**
 *
 * @author BergouLan
 */
public class Course {

    private String title;
    private String type;
    private String start_date;
    private String end_date;
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
    private ArrayList<Trainer> enrolledTrainers = new ArrayList<Trainer>();
    private ArrayList<Assignment> enrolledAssignments = new ArrayList<Assignment>();
    private int counter;

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
public ArrayList<Trainer>getEnrolledTrainers(){
return enrolledTrainers;
}
public ArrayList<Assignment>getEnrolledAssigments(){
return enrolledAssignments;
}

    public Course(String title, String type, String start_date, String end_date) {
        this.title = title;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Course() {

    }

    public Course(String text) {
        title = text;
        enrolledStudents = new ArrayList<Student>();
        counter = 0;
    }

    public void printStudentsInfo() {
        System.out.println("Course: " + title);
        System.out.println("--------");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            Student s = enrolledStudents.get(i);
           
        }
    }

    public void addStudent(Student s) {
        enrolledStudents.add(s);
    }
    public void addTrainer(Trainer s){
    enrolledTrainers.add(s);
    }
public void addAssigment(Assignment s){
enrolledAssignments.add(s);
}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void printCourseData() {
        System.out.println("Course Name : " + title);
        System.out.println("The enrolled students " );
        for (Student s : enrolledStudents) {
            System.out.println(s);
        }

    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", type=" + type + ", start_date=" + start_date + ", end_date=" + end_date;
    }
}
