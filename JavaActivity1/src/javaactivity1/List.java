/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jalandonije_sd2023
 */
public class List {

    Scanner sinput = new Scanner(System.in);
    ArrayList<String> l1 = new ArrayList();
//    ArrayList<Student> l2 = new ArrayList();
    Student s = new Student();

    public void add1(String a) {
        l1.add(a);
    }

    public void remove1(String a) {
        if (l1.contains(a)) {
            l1.remove(a);
        } else {
            System.out.println("Not found!");
        }
    }

    public void update(String a) {
        if (l1.contains(a)) {
            System.out.println("New Name: ");
            String s = sinput.next();
            l1.set(l1.indexOf(a), s);
        }

    }

    public void display() {
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
