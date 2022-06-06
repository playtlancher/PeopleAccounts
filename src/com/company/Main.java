package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0 ;
        String name ;
        MyEntry2 myEntry = new MyEntry2();
        Scanner scan = new Scanner(System.in);

        while (true) {
            switch (a) {
                case 0:
                    System.out.println("1 - add object");
                    System.out.println("2 - watch list");
                    System.out.println("3 - watch keys");
                    System.out.println("4 - watch all info");
                    System.out.println("5 - remove something by value");
                    System.out.println("6 - remove something by key");
                    a = scan.nextInt();
                    break;
                case 1:
                    myEntry.addObject();
                    a = 0;
                    break;
                case 2:
                    myEntry.watchList();
                    a = 0;
                    break;
                case 3:
                    myEntry.watchKeys();
                    a = 0;
                    break;
                case 4:
                    myEntry.watchAll();
                    a = 0;
                    break;
                case 5:
                    myEntry.removeByValue();
                    a = 0;
                    break;
                case 6:
                    myEntry.removeByKey();
                    a = 0;
                    break;
            }
        }
    }
}