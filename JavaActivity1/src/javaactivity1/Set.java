/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author 2ndyrGroupC
 */
public class Set {
     Scanner intput = new Scanner(System.in);
    TreeSet<Integer> s = new TreeSet<Integer>();
    
    public void add(int c){
        s.add(c);
    }
    
    public void remove(int a){
       if(s.contains(a)){
        s.remove(a);
        }else {
              System.out.println("Not found!");
        }
        
    }
    
    public void update(int b) {
       if (s.contains(b)) {
            s.remove(b);
            System.out.println("New Name: ");
            int i = intput.nextInt();
            s.add(i);
        }

    }
    
    
    
    public void display(){
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
    }
    
    
}
