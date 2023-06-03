package main.LinkedList;

public  class Link {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(1);
        ll.insertFirst(5);
        ll.insertFirst(7);
        ll.insertFirst(11);
        ll.insertLast(20);
        ll.deleteLast();
        ll.deleteFirst();

        ll.display();

    }
}
