package com.hillel.hrebeniev.homeworks.homework_17;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Box<T extends Fruit> {
    private float weight;
    private final List<T> fruits;

    public Box() {
        this.weight = 0;
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void add(List<T> newFruits) {
        for (T fruit : newFruits) {
            add(fruit);
        }
    }

    public float getWeight() {
        weight = fruits.size() * weight;
        return weight;
    }


    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void merge(Box<T> box) {
        if (fruits.size() == 0 || box.fruits.size() == 0) {
            return;
        }

        if (fruits.get(0).getClass() == box.fruits.get(0).getClass()) {
            fruits.addAll(box.fruits);
            box.fruits.clear();
        } else {
            System.out.println("It is not possible to combine boxes with different types of fruit");
        }
    }
}
