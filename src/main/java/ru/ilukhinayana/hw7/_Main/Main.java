package ru.ilukhinayana.hw7._Main;

import java.util.Arrays;
import java.util.Stack;

// 2. Задачка на Stack. Задачка: Проверка правильности скобочной последовательности
//Описание задачи: Написать программу, которая будет проверять правильность скобочной последовательности. Дана СТРОКА,
// содержащая только символы скобок: '(', ')', '[', ']', '{' и '}'. Необходимо проверить, что скобочная последова-
// тельность верна, т.е. каждая открывающая скобка имеет соответствующую закрывающую скобку, и пары скобок правильно
// вложены друг в друга.
//Примеры:
//"([)]" - неправильная скобочная последовательность
//"()[]{}" - правильная скобочная последовательность
//"()" - правильная скобочная последовательность
//Мы используем стек, чтобы проверить правильность скобочной последовательности. Если мы встречаем открывающую скобку, мы добавляем ее в стек. Если мы встречаем закрывающую скобку, мы проверяем, что последняя добавленная скобка в стеке соответствует этой закрывающей скобке. Если да, то мы удаляем эту открывающую скобку из стека. Если нет, то скобочная последовательность неправильная. По завершении проверки мы проверяем, что стек пустой. Если стек не пустой, значит скобочная последовательность неправильная.
public class Main {

    public static void main(String[] args) {
        String bracet1 = new String("([{}])");
        String bracet2 = new String("([{");
        String bracet3 = new String("([{)]}");
        String[] braket1Array = bracet1.split("");
        String[] braket2Array = bracet2.split("");
        String[] braket3Array = bracet3.split("");

        System.out.println("Последовательность " + Arrays.toString(braket1Array) + " " + checkBracketPair(braket1Array));
        System.out.println("Последовательность " + Arrays.toString(braket2Array) + " " + checkBracketPair(braket2Array));
        System.out.print("Последовательность " + Arrays.toString(braket3Array) + " " + checkBracketPair(braket3Array));
    }

    public static String checkBracketPair(String[] braketArray) {
        Stack<String> deck = new Stack<>();
        int ln = braketArray.length;
        for (int i = 0; i < ln; i++) {
            switch (braketArray[i]) {
                case "(", "[", "{" -> deck.push(braketArray[i]); // если это открывающаяся скобка, добавить в ее стек
                case ")" -> { // если закрывающая скобка, то проверяем пару
                    if (deck.peek().equals("(")) {
                        deck.pop(); // если пара правильная, стираем скобку из стека
                    } else return "Последовательность НЕправильная";
                }
                case "]" -> {
                    if (deck.peek().equals("[")) {
                        deck.pop(); // если пара правильная, стираем скобку из стека
                    } else return "Последовательность НЕправильная";
                }
                case "}" -> {
                    if (deck.peek().equals("{")) {
                        deck.pop(); // если пара правильная, стираем скобку из стека
                    } else return "Последовательность НЕправильная";
                }
                default -> {
                    return "Есть символы не-скобки";
                }
            }
        }
        return deck.empty() ? "Последовательность Правильная" : "Последовательность НЕправильная";
    }
}
