package org.example;

public class Node <T> {
    private Node<T> left;
    private Node<T> right;
    private T data;
    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }
    void set_left(Node<T> left) {
        this.left = left;
    }
    void set_right(Node<T> right) {
        this.right = right;
    }
    Node<T> right() {
        return right;
    }
    Node<T> left() {
        return left;
    }
    void set_data(T data) {
        this.data = data;
    }
    T data() {
        return data;
    }
}
