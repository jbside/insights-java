package linkedlist;

import java.util.Objects;

public class LinkedListClass<T> {
    private Node<T> first;
    private Node<T> last;
    private Integer size;

    public LinkedListClass() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }
    public void setFirst(Node<T> first) {
        this.first = first;
    }
    public Node<T> getLast() {
        return last;
    }
    public void setLast(Node<T> last) {
        this.last = last;
    }
    
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public void add(T value) {
        Node newNode = new Node<T>(value);
        if (this.first == null ) {
            this.first = newNode;
        }
        if (this.last != null) {
            this.last.setNext(newNode);
        }

        this.last = newNode;
        size++;
    }

    public Node<T> get(int index) {
        Node node = this.first;
        for (int i = 0; i < index; i++) {
            if (node.getNext() != null) {
                node = node.getNext();
            }
        }
        return node;
    }

    public void remove(T value) {
        Node previous = null;
        Node node = this.first;
        for (int i = 0; i < this.getSize(); i++) {
            if (node.getValue().equals(value)) {
                if (this.size == 1) {
                    this.first = null;
                    this.last = null;
                    node.setNext(null);
                }
                else if (node.equals(this.first)) {
                    this.first = node.getNext();
                    node.setNext(null);
                }
                else if (node.equals(this.last)) {
                    this.last = previous;
                    previous.setNext(null);
                } else {
                    previous.setNext(node.getNext());
                    node = null;
                }
                size--;
                break;
            }

            previous = node;
            if (node.getNext() != null) {
                node = node.getNext();
            }
        }
    }

    public IteratorLinkedList<T> getIterator() {
        return new IteratorLinkedList<T>(this.first);
    }
}
