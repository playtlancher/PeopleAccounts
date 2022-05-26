package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleAndAccounts {
    String name;
    int number = 1 , numerator = 0;
    Scanner scan = new Scanner(System.in);
    List<Person> list = new ArrayList<Person>();
    public void addPeople() {
        System.out.println("Enter name");
        name = scan.nextLine();
        list.add(new Person(name));
    }
    public void watchPeople(){
        list.stream().forEach( people -> people.getAccountsAndName());
    }
    public void accountToPeople(){
        System.out.println("Choose a person");
        list.stream().forEach( people ->{
            System.out.println(number + " - " + people.getName());
            number++;
        } );
        numerator = scan.nextInt();
        number = 0;
        for(Person people : list){
            number++;
            if (number==numerator){
                people.peopleAddAccount();
            }
        }
        number = 1;
    }
    public void removePeople(){
        System.out.println("Choose a person");
        list.stream().forEach( people ->{
            System.out.println(number + " - " + people.getName());
            number++;
        } );
        number = scan.nextInt()-1;
        list.remove(number);
        number = 1;
    }
    public void deleteAccount(){
        System.out.println("Choose a person");
        list.stream().forEach( people ->{
            System.out.println(number + " - " + people.getName());
            number++;
        } );
        numerator = scan.nextInt();
        number = 0;
        for(Person people : list){
            number++;
            if (number==numerator){
                people.getAccounts();
                System.out.println("Choose account");
                numerator = scan.nextInt()-1;
                people.deleteAccount(numerator);
            }
        }
        number = 1;
    }
}
