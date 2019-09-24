/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity1;


import java.util.Scanner;

/**
 *
 * @author jalandonije_sd2023
 */
public class JavaActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Welcome to Registration Form\n");
    Scanner intput = new Scanner(System.in);
    Scanner sinput = new Scanner(System.in);
    Student s = new Student();
    List l = new List();
    Queue q = new Queue();
    Set ts = new Set();
    while (true){
    System.out.println(" 1 for List\n 2 for Queue\n 3 for Set");
    System.out.println("Enter your Choice:");
    int choice = intput.nextInt(); 
    switch (choice) {
        case 1:
            System.out.println(" 1 for Add Student\n 2 for Remove Student\n 3 for Update Student\n 4 for Update Student");
            System.out.println("Enter your Option1:");
            int option = intput.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add Student name:");
                    String fname = sinput.next();
                    s.setFirstName(fname);
                    l.add1(fname);                    
                    break;
                case 2:
                    System.out.println("Remove Name:");
                    String fname2 = sinput.next();
                    s.setFirstName(fname2);                   
                    l.remove1(fname2);                             
                    break;
                case 3:
                    System.out.println("Update Name: ");
                    String fname3 = sinput.next();
                    s.setFirstName(fname3); 
                    l.update(fname3);
                    break;
                case 4: 
                    System.out.println("---------List of Students:/n------------");
                    l.display();
                     break;
                default:
                    System.out.println("Invalid input");
                   break;
                    
            }
           break;
        case 2:
            System.out.println(" 1 for Add Grade\n 2 for Remove Grade\n 3 for Update Grade\n 4 for Update Grade");
            System.out.println("Enter your Option2:");
            int option2 = intput.nextInt();
              switch (option2) {
                case 1:
                    System.out.println("Student's Grade");
                    int gr1 = intput.nextInt();
                    s.setGrade(gr1);
                    q.add(gr1);
                    break;
                case 2:
                    System.out.println("Remove Grade");
                    int gr2 = intput.nextInt();
                    s.setGrade(gr2);
                    q.remove(gr2);
                    break;
                case 3:
                    System.out.println("Update Grade");
                    int gr3 = intput.nextInt();
                    s.setGrade(gr3);
                    q.update(gr3);
                     break;
                case 4: 
                    System.out.println("--------List of grades:------------\n");
                    q.display();
                   break;

            }
                break;
        case 3:
            System.out.println(" 1 for Add Student\n 2 for Remove Student\n 3 for Update Student\n 4 for Update Student");
            System.out.println("Enter your Option1:");
            int option3 = intput.nextInt();
            switch (option3) {
                case 1:
                    System.out.println("Student's Id:");
                    int id = intput.nextInt();
                    s.setId(id);
                    ts.add(id);
                    break;
                case 2:
                    System.out.println("Remove Student's Id:");
                    int id2 = intput.nextInt();
                    s.setId(id2);;                   
                    ts.remove(id2);
                    break;
                case 3:
                    System.out.println("Update Student's Id: ");
                    int id3 = intput.nextInt();
                    s.setId(id3);;  
                    ts.update(id3);
                    break;
                case 4: 
                    System.out.println("---------List of Student's Id:------------/n");
                    ts.display();
                     break;
                default:
                    System.out.println("Invalid input");
                   break;
                    
            }
           break;

    }
    }
    }
    }



