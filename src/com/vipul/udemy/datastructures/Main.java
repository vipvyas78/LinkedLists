package com.vipul.udemy.datastructures;

public class Main {

    public static void main(String[] args) {



	// write your code here

        Employee vihv = new Employee("vihaan","Vyas",123);
        Employee tv = new Employee("Tvishi","Vyas",777);
        Employee ts = new Employee("Taruna","Sharma",666);
        Employee vipv = new Employee("Vipul","Vyas",98);

        EmployeeLinkedList mylist = new EmployeeLinkedList();

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
