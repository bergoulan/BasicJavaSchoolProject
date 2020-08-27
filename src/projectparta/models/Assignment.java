/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectparta.models;

import java.util.ArrayList;
import static projectparta.models.Student.studentList;

/**
 *
 * @author BergouLan
 */
public class Assignment {

    private String title;
    private String description;
    private String subDateTime;
    private double oralMark;
    private static double totalMark = 100;
    private ArrayList<Course> courses =  new ArrayList<Course>();
    private ArrayList<Assignment> assignmentList =  new ArrayList<Assignment>();

    public Assignment() {

    }
    public void addAssignment(Assignment s){
assignmentList.add(s);
}

    public Assignment(String title, String description, String subDateTime, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public void printAssignmentData() {
        System.out.println("ASSIGNMENT DATA");
        System.out.println("Name : " + this.title);
        System.out.println("Description : " + this.description);
        System.out.print("Start date : " + this.subDateTime + "\n");
        System.out.println("Oral Mark : " + this.oralMark);
        System.out.println("Total Mark : " + this.totalMark);
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + '}';
    }

}
