package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Person {
    private String name , login;
    private int number = 0;
    List<Account> list = new ArrayList<Account>();
    Scanner scan = new Scanner(System.in);
    public Person(String name){
        this.name = name;
    }

    public void peopleAddAccount(){
        System.out.println("Enter account");
        login = scan.nextLine();
        list.add(new Account(login));
    }
    public String getName(){
        return name;
    }
    public void getAccountsAndName(){
        System.out.println("Name - " + name );
        System.out.print("accounts - ");
        list.stream().forEach( account -> System.out.print(account.getLogin() + ", "));
        System.out.println("");
    }
    public void getAccounts(){
        list.stream().forEach( account -> {
            number++;
            System.out.println(number +" - "+ account.getLogin());
        });
    }
    public void deleteAccount(int a){
        list.remove(a);
    }
}
