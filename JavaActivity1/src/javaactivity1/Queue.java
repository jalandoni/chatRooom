/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupC
 */
public class Queue {

    Scanner intput = new Scanner(System.in);
    PriorityQueue<Integer> p = new PriorityQueue<Integer>();

    public void add(int b) {
        p.add(b);
    }

    public void remove(int b) {
        if (p.contains(b)) {
            p.remove(b);
        } else {
            System.out.println("Not found!");
        }
    }

    public void update(int b) {
        if (p.contains(b)) {
            p.remove(b);
            System.out.println("New Name: ");
            int i = intput.nextInt();
            p.add(i);
        }
    }

    public void display() {
        Iterator itr = p.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
