package com.vipul.udemy.datastructures;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int listsize = 0;

    public void addToFront(Employee employee)
    {
        EmployeeNode node  = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        listsize ++;
    }


    public void printList()
    {
        EmployeeNode current=head;
        System.out.print("Head -->");
        while (current != null)
        {
            System.out.print(current.getEmployee().toString());
            System.out.print(" --> ");
            current = current.getNext();
        }
        System.out.println("");
    }


    public void getSize()
    {
        System.out.println("Linked List size =" + listsize);
    }

    public boolean isEmpty()
    {
        return head == null;
    }



    public EmployeeNode removeFromFront()
    {
      if(isEmpty())
          return  null;

       EmployeeNode removedNode = head;
        head = head.getNext();
        listsize--;
        return removedNode;
    }
}
