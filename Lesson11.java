package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson11 {
    public static void main(String[] args) {

        System.out.println("\nНа вход подается массив. С помощью метода меняем два элемента местами в массиве");

        String[] strArray = {"BMW", "Mercedes", "Audi", "Mazda", "Toyota"};
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(changePlace(strArray, 1, 4)));
        System.out.println();

        Box<Apple> boxApples1 = new Box<>();
        Box<Apple> boxApples2 = new Box<>();
        Box<Orange> boxOranges1 = new Box<>();
        Box<Orange> boxOranges2 = new Box<>();

        boxApples1.addFruit(new Apple(180));
        boxApples1.addFruit(new Apple(150));
        boxApples1.addFruit(new Apple(140));
        boxApples2.addFruit(new Apple(120));
        boxApples2.addFruit(new Apple(110));

        boxOranges1.addFruit(new Orange(180));
        boxOranges2.addFruit(new Orange(120));
        boxOranges2.addFruit(new Orange(110));
        boxOranges2.addFruit(new Orange(90));
        boxOranges2.addFruit(new Orange(150));


        boxOranges1.displayBox();
        boxOranges2.displayBox();
        boxApples1.displayBox();
        boxApples2.displayBox();

        boxApples1.getBoxWeight();
        boxApples2.getBoxWeight();
        boxOranges1.getBoxWeight();
        boxOranges2.getBoxWeight();

        System.out.println();

        System.out.println(boxOranges1.compare(boxOranges2));
        System.out.println(boxApples1.compare(boxOranges2));
        boxApples1.moveToAnotherBox(boxApples2);
        boxApples1.displayBox();
        boxApples2.displayBox();

    }

    /**
     * Изменяет места двух элементов в заданном массиве
     * @param array любого типа
     * @param index1  индекс один
     * @param index2 индекс два
     * @return массив с замененными элементами
     */
    public static <T> T[] changePlace(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length) {
            System.out.printf("Индекс %d находится за пределами, при условии, что массив содержит элементов %d.\n", index1, array.length);
        } else if (index2 < 0 || index2 >= array.length) {
            System.out.printf("Индекс %d находится за пределами, при условии, что массив содержит элементов %d.\n", index2, array.length);
        } else {
            T element = array[index1];
            array[index1] = array[index2];
            array[index2] = element;
        }
        return array;
    }

    /**
     * Преобразует массив в ArrayList
     * @param array заданный массив
     * @return ArrayList
     */
    public static <T> ArrayList<T> arrayToArrayList (T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}

