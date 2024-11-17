package ru.ilukhinayana.hw7._Main;

import java.util.Iterator;
import java.util.LinkedList;
// 4. Задачка на LinkedList. Задачка: Удаление элементов из связного списка
//Описание задачи: Написать программу, которая будет удалять все элементы из связного списка, которые являются
// четными числами. // Подсказка: Мы используем связный список LinkedList, чтобы хранить элементы. Мы проходим по списку
// с помощью итератора и проверяем каждый элемент на четность. Если элемент четный, то мы удаляем его из списка с помощью
// метода remove() итератора. После этого мы выводим список на экран с помощью метода println() класса System.out.

public class RemoveEvenNumbers {

    public static void main(String[] args) {
        LinkedList<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(101);


        System.out.println("Исходный список: " + numbersList);
        Iterator<Integer> iterator = numbersList.iterator(); // Создаем итератор для прохода по списку
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        } // numbersList.removeIf(number -> number % 2 == 0);
        System.out.print("Список после удаления четных чисел: " + numbersList);
    }
}
