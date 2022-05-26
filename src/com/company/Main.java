package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0 ;
        String name ;
        PeopleAndAccounts people = new PeopleAndAccounts();
        Scanner scan = new Scanner(System.in);
        while (true) {
            switch (a) {
                case 0:
                    System.out.println("1 - add person");
                    System.out.println("2 - add account to person");
                    System.out.println("3 - watch people and accounts");
                    System.out.println("4 - remove person");
                    System.out.println("5 - remove account");
                    a = scan.nextInt();
                    break;
                case 1:
                    people.addPeople();
                    a = 0;
                    break;
                case 2:
                    people.accountToPeople();
                    a = 0;
                    break;
                case 3:
                    people.watchPeople();
                    a = 0;
                    break;
                case 4:
                    people.removePeople();
                    a = 0;
                    break;
                case 5:
                    people.deleteAccount();
                    a = 0;
                    break;
            }
        }
    }
}