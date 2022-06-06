package com.company;

import java.util.Scanner;
import java.util.*;

public class MyEntry2 {
    int numerator = 0 , number , c , key;
    String a , b ;
    Scanner scan = new Scanner(System.in);
    List<MyEntry> list = new ArrayList();
    public void watchList() {
        for (MyEntry m : list){
            numerator ++;
            System.out.print(numerator + " - ");
            System.out.print(m.getK() + " ");
            System.out.println(m.getV());
        }
        numerator = 0;
    }
    public void watchKeys(){
        list.stream().forEach( myEntry ->System.out.println(myEntry.getKey()));
    }
    public void watchAll(){
        for (MyEntry m : list){
            numerator ++;
            System.out.print(numerator + " - ");
            System.out.print(m.getK() + " ");
            System.out.print(m.getV());
            System.out.println(" Key - " + m.getKey());
        }
        numerator = 0;
    }
    public void addObject(){
        System.out.println("Enter first something");
        a = scan.nextLine();
        if(list.size()!=0) {
            a = scan.nextLine();
        }
        System.out.println("Enter second something");
        b = scan.nextLine();
        System.out.println("Enter key");
        key = scan.nextInt();
        list.add(new MyEntry(a , b , key));
    }
    public void removeByValue(){
        int numerator = 0 ;
        for (MyEntry myEntry : list){
            numerator++;
            System.out.print(numerator + " " + myEntry.getK() );
            System.out.println(" " + myEntry.getV());
        }
        System.out.println("Enter number");
        number = scan.nextInt()-1;
        list.remove(number);
    }
    public void removeByKey(){
        System.out.println("Enter key");
        c = scan.nextInt();
        for (MyEntry myEntry : list){
            numerator++;
            if(c == (myEntry.getKey())) {
                list.remove(numerator-1);
                numerator = 0;
                break;
            }
        }
        if (numerator == list.size() & list.size() != 0){
            System.out.println("Error: not right key");
            numerator = 0;
        }
    }
}
