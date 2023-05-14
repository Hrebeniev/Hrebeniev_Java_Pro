package com.hillel.hrebeniev.homeworks.homework_18.factory;

public class FurnitureImplement {
    public Furniture createFurniture(String type) {
        switch (type) {
            case "chair":
                return new Chair();
            case "bed":
                return new Bed();
            case "table":
                return new Table();
            default:
                return null;
        }
    }
}