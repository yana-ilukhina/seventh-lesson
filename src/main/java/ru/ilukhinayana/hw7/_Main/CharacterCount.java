package ru.ilukhinayana.hw7._Main;

import java.util.HashMap;
import java.util.Map;

// 3. Задачка на Map Задачка: Подсчет количества повторений символов в строке
// Описание задачи: Написать программу, которая будет подсчитывать количество повторений каждого символа в заданной СТРОКЕ.
// Результат необходимо вывести в виде пар "символ - количество повторений".
//Пример: Для строки "hello world" результат должен быть следующим:
//h - 1 //e - 1 //l - 3 //o - 2 //  - 1 //w - 1 //r - 1 //d - 1
// Подсказка: Мы используем HashMap, чтобы подсчитать количество повторений каждого символа в заданной строке. Мы проходим по строке и для каждого символа проверяем, есть ли он уже в HashMap. Если да, то мы увеличиваем счетчик на 1. Если нет, то мы добавляем символ в HashMap со значением 1. После этого мы выводим все символы и их количество повторений с помощью методов keySet() и get() HashMap.
public class CharacterCount {

    public static void main(String[] args) {
        String str = ("hello itgirls");
        char[] strArr = str.toCharArray(); // строку в массив из char
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        int ln = strArr.length;
        for (int i = 0; i < ln; i++) { //
            if (charCountMap.containsKey(strArr[i])) {
                charCountMap.put(strArr[i], charCountMap.get(strArr[i]) + 1);
            } else {
                charCountMap.put(strArr[i], 1);
            }
        }
        //for (Character key : charCountMap.keySet()) {
        //    System.out.println(key + " - " + charCountMap.get(key));}
        for (Map.Entry<Character, Integer> element : charCountMap.entrySet()) {
            System.out.println(element);
        }
    }
}

