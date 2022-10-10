package com.bridgelab;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();

        System.out.println();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.show();

        LinkedList<Integer>list3 = new LinkedList<>();
        list3.append(56);
        list3.append(30);
        list3.append(70);
        list3.show();


        LinkedList<Integer>list4 = new LinkedList<>();
        list4.insert(56);
        list4.insert(70);
        list4.insert(30);
        list4.show();
        
        Integer popFirstElement = list1.popFirst();
        if (popFirstElement == null) {
            System.out.println("Linked List Empty");
        } else {
            System.out.println("Popped the first element -> "+popFirstElement);
        }
        list1.show();

    }
}
