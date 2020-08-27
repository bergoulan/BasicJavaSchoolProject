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
public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Trainer> trainerList = new ArrayList<Trainer>();

    public Trainer() {

    }
public void addTrainer(Trainer s){
trainerList.add(s);
}
    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printTrainerData() {
        System.out.println("TRAINER DATA");
        System.out.println("Name : " + this.firstName);
        System.out.println("Lastname : " + this.lastName);
        System.out.print("Subject : " + this.subject);
    }
    

    @Override
    public String toString() {
        return "Trainer{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + ", courses=" + courses + '}';
    }

}
