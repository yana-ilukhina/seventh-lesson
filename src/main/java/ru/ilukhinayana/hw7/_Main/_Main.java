package ru.ilukhinayana.hw7._Main;

import java.util.Arrays;
import java.util.Stack;
/*1. Задачка на массивы: Дан массив целых чисел nums. Вам необходимо реализовать метод removeDuplicates(int[] nums).
Он должен удалять дублирующие значения в массиве. Числа в исходном массиве находятся в порядке НЕУБЫВАНИЯ. Например,
из массива [0,0,1,1,1,2,2,3,3,4] должен получится массив [0,1,2,3,4,0,0,0,0,0] При запуске этого класса, у вас
должно вывестись true в консоль.*/
class Solution {
    public static void main(String[] args) {
        Stack<String> deck = new Stack<>();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);
        System.out.print(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates(int[] nums) { // вариант решения через новый массив
        int[] result = new int[nums.length]; // по умолчанию в массиве 0 везде
        result[0] = nums[0];// вдруг первое число не 0
        int d = 1;
        int ln = nums.length;
        for (int i = 1; i < ln; i++) {
            if (result[d - 1] != nums[i]) {
                result[d] = nums[i];
                d++;
            }
        }
        for (int j : result) System.out.print(j + " ");
        return result;
    }
}