package pack;

import java.util.Arrays;

public class NodeList<E> {
    Node first;
    int size = 0;

    public int getSize() {
        return size;
    }

    public NodeList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(E data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        size++;
    }


    public void removeFirst() {
        Node temp = first;
        first = first.next;
        size--;
    }

    public Node find(E item) {
        Node current = first;
        while (current.data != item) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    public void delete(E item) {
        Node current = first;
        Node previous = first;
        while (current.data != item) {
            if (current.next == null) {
                break;
            } else {
                previous = current;
                current = current.next;
            }
            if (current == first) {
                first = first.next;
                size--;
            } else {
                previous.next = current.next;
                size--;
            }

        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return tmpNode(index).data;
    }

    public boolean add(int index, E value) {
        Node current = tmpNode(index);
        Node previous = first;
        while (previous.next != current) {
            previous = previous.next;
        }
        Node<E> node = new Node<>(value);
        previous.next = node;
        node.next = current;
        return true;
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
        System.out.println("");
    }

    Node<E> tmpNode(int index) {
        Node<E> el = this.first;
        for (int i = 0; i <= index; i++) {
            if (i == index) break;
            el = el.next;
        }
        return el;
    }

}
