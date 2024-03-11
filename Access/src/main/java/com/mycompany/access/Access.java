package com.mycompany.access;
import people.Person;

public class Access {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.sayHello();
        
        Person person = new Person("Anamaria","Quintero", 18);
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
    }
}
