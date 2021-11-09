package generics;

public class SList<T> {
    static Node head;

    SList(){
        head = null;
    }
    public static SListIterator iterator(){
        SListIterator sListIterator = new SListIterator(head);
        return sListIterator;
    }



}
