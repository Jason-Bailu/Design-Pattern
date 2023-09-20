package com.bailu.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Robert", "Male", "Single"));
        people.add(new Person("John", "Male", "Married"));
        people.add(new Person("Laura", "Female", "Married"));
        people.add(new Person("Diana", "Female", "Single"));
        people.add(new Person("Mike", "Male", "Single"));
        people.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(people));

        System.out.println("Females: ");
        printPersons(female.meetCriteria(people));

        System.out.println("Single Males: ");
        printPersons(singleMale.meetCriteria(people));

        System.out.println("Single or Females: ");
        printPersons(singleOrFemale.meetCriteria(people));

    }

    public static void printPersons(List<Person> people) {
        for (Person person : people) {
            System.out.println("Person : [ Name : "+person.getName()
            +", Gender : "+person.getGender()
            +", Marital Status : "+person.getMaritalStatus()
            +" ]");
        }
    }
}
