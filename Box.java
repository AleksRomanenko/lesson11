package ru.geekbrains;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> fruitsBox = new ArrayList<>();
    private int weight = 0;

    public String getFruitType() {
        String fruit = "пустая";
        if (!fruitsBox.isEmpty()) {
            fruit = fruitsBox.get(0).getName();
        }
        return fruit;
    }

    public int getWeight() {
        return weight;
    }

    public ArrayList<T> getFruitsBox() {
        return fruitsBox;
    }

    public void addFruit(T fruit) {
        fruitsBox.add(fruit);
        weight += fruit.getWeight();
    }

    public void getBoxWeight() {
        if (weight == 0) {
            System.out.println("Эта коробка пустая");
        } else {
            System.out.printf("\nОбщий вес плодов (%s) составляет %d г.", getFruitType(), weight);
        }
    }

    public Boolean compare(Box<?> box) {
        return weight == box.getWeight();
    }

    public void moveToAnotherBox(Box<T> box) {
        box.getFruitsBox().addAll(fruitsBox);
        fruitsBox.clear();
    }

    public void displayBox() {
        System.out.printf("Коробка содержит %d фруктов (%s)\n", fruitsBox.size(), getFruitType());
    }
}
