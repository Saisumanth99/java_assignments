package generics;

public class SListIterator {

    Node head;
    Node tail;
    int length;

    SListIterator(Node head){
        this.head = head;
        this.tail = head;

    }
    public void insert(Node node){
        if(head == null){
            head = node;
            tail = head;

        } else {
            tail.link = node;

            tail = node;

        }
        length++;

    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Linked list is empty");
        } else if(head.link == null){
            head = null; tail = null;
        } else {
            Node temp = head;
            while (temp.link != tail) temp = temp.link;
            tail = temp;
            tail.link = null;
        }

    }
    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("empty list"); return;
        }
        while(temp!=null){
            System.out.print(temp.data+" --> "); temp = temp.link;
        }
        System.out.println("end");
    }
}
