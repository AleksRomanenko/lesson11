package ru.geekbrains;

public abstract class Fruit {

    final String name = "Фрукт";
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

class Apple extends Fruit {

    final String name = "Яблоко";
    private final int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Яблоко %d гр", weight);
    }
}

class Orange extends Fruit {

    final String name = "Апельсин";
    private final int weight;

    public Orange(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Апельсин %d гр", weight);
    }
}
