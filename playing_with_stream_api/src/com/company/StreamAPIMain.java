package com.company;

import com.company.dto.Address;
import com.company.dto.Person;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamAPIMain {

    public static void main(String[] args) {
        Person person1 = new Person(new Address("City1-Madurai", 12345));
        Person person2 = new Person(new Address("City2-Madurai", 66666));
        Person person3 = new Person(new Address("City3-Madurai", 11112));
        Person person4 = new Person(new Address("City4-Theni", 33232));
        Person person5 = new Person(new Address("City5-Theni", 11111));
        Person person6 = new Person(new Address("City6-Theni", 345321));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        persons.stream().filter(it -> it.getAddress().getCity().contains("Madurai")).collect(Collectors.toList());
        persons.stream().filter(it -> it.getAddress().getCity().contains("Madurai")).findFirst();
        persons.stream().filter(it -> it.getAddress().getCity().contains("theni")).findAny();
        persons.stream().filter(it -> it.getAddress().getCity().contains("theni")).map(it -> it.getAddress()).collect(Collectors.toList());

    }
}
