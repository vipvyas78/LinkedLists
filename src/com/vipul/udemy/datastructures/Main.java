package com.vipul.udemy.datastructures;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


	// write your code here

        Employee vihv = new Employee("vihaan","Vyas",123);
        Employee tv = new Employee("Tvishi","Vyas",777);
        Employee ts = new Employee("Taruna","Sharma",666);
        Employee vipv = new Employee("Vipul","Vyas",98);

        EmployeeLinkedList mylist = new EmployeeLinkedList();


        LinkedList<Employee> jdkLinkedList = new LinkedList<>();
        jdkLinkedList.add(vihv);
        jdkLinkedList.add(ts);
        jdkLinkedList.addFirst(vipv);

        System.out.println("Does jdk linked list contains Vipul = " + jdkLinkedList.contains(vipv));

        System.out.println("JDK Linked List = " + jdkLinkedList.toString());

        System.out.println("First Element=" + jdkLinkedList.getFirst().toString());



        mylist.addToFront(vipv);
        mylist.addToFront(ts);
        mylist.addToFront(vihv);
        mylist.addToFront(tv);



        mylist.printList();
        mylist.getSize();
        System.out.println(mylist.isEmpty());

        mylist.removeFromFront();
        mylist.printList();
        mylist.getSize();


    }
}
