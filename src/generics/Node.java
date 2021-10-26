package generics;

public class Node<T> {
    T data;
    Node<T> link;

    Node(T data, Node<T> link){
        this.data=data;
        this.link=link;
    }
}
