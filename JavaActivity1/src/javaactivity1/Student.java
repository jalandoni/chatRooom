/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity1;

/**
 *
 * @author jalandonije_sd2023
 */
public class Student {

    private int grade;
    private String firstName;
    private String lastName;
    private int id;

    public Student() {
    }

    public Student(int grade, String firstName, String lastName, int id) {
        this.grade = grade;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Id:%d FirstName:%s LastName:%s Course:%s", grade, firstName, lastName, id);
    }

}
