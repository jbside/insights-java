package linkedlist;

public class IteratorLinkedList<T> {
    private Node<T> node;

    public IteratorLinkedList(Node<T> node) {
        this.node = node;
    }

    public boolean hasNext() {
        return node.getNext() != null;
    }

    public Node<T> getNext() {
        node = node.getNext();
        return node;
    }
}
