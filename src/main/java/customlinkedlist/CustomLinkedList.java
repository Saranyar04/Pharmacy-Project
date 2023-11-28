package customlinkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomLinkedList<T> {

    private static final Logger LOGGER = LogManager.getLogger(CustomLinkedList.class);
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
        if (head.getData().equals(data)) {
            head = head.getNext();
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().equals(data)) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            LOGGER.info(current.getData() + " ");
            current = current.getNext();
        }
    }
}