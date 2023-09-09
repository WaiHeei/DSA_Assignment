package adt;

import java.util.Iterator;

public class TreeSet<T extends Comparable<T>> implements TreeSetInterface<T> {
    private Node firstNode;

    private int size;

    public TreeSet() {
        this.firstNode = null;
    }

    @Override
    public void add(T t) {
        Node newNode = new Node(t);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            // Traverse the TreeSet to find the correct position to insert the new node
            Node current = firstNode;
            Node previous = null;

            while (current != null && t.compareTo(current.data) > 0) {
                previous = current;
                current = current.next;
            }

            // Insert the new node
            if (previous == null) {
                // Insert at the beginning of the TreeSet
                newNode.next = firstNode;
                firstNode = newNode;
            } else {
                // Insert after the 'previous' node
                newNode.next = current;
                previous.next = newNode;
            }
        }

        // Increment the size of the TreeSet
        size++;
    }

    @Override
    public boolean contains(T t) {
        return contains(firstNode, t);
    }

    private boolean contains(Node node, T target) {
        while (node != null) {
            int compareResult = target.compareTo(node.data);

            if (compareResult == 0) {
                return true; // Element found
            } else if (compareResult < 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return false; // Element not found
    }


    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void remove(T t) {
        Node currentNode = firstNode;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.data.equals(t)) {
                if (previousNode != null) {
                    previousNode.next = currentNode.next; // Remove the current node
                } else {
                    // If the first node matches, update the firstNode reference
                    firstNode = currentNode.next;
                }
                size--; // Decrease the size of the TreeSet
                return; // Exit the loop after removing the element
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> getIterator() {
        return new TreeSetIterator();
    }

    private class TreeSetIterator implements Iterator<T> {
        Node currentNode = firstNode;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T currentEntry = null;
            if (hasNext()) {
                currentEntry = currentNode.data;
                currentNode = currentNode.next;
            }else {
                System.out.println("No node available");
            }
            return currentEntry;
        }
    }

    private class Node {

        private T data;
        private Node next;
        private Node previous;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

        public Node(T data, Node next, Node left, Node right, Node previous) {
            this.data = data;
            this.next = next;
            this.left = left;
            this.right = right;
            this.previous = previous;
        }
    }

}
