package com.hillel.hrebeniev.homeworks.homework_16;

import lombok.Data;

@Data
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }
}