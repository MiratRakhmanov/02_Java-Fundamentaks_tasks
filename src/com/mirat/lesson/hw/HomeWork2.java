package com.mirat.lesson.hw;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
        task_01(3);
        task_02();
        task_03();
        task_04();
        task_05();
        task_06(5);
        task_07();
        task_08(3);
        task_09();
        task_10();
    }

    //Task_01
    public static void task_01(int k) {
        System.out.println("Task_01:");
        int[] set = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] % k == 0) {
                count += set[i];
            }
        }
        System.out.println(count);
        System.out.println("********************");
    }

    //Task_02
    public static void task_02() {
        System.out.println("Task_02:");
        int[] set = {1, 2, 0, 4, 5, 0, 7, 0, 0};
        int arrayLength = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] == 0) {
                arrayLength++;
            }
        }
        int[] result = new int[arrayLength];
        int index = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] == 0) {
                result[index++] = i;
            }
        }
        System.out.println(Arrays.toString(result));
        System.out.println("********************");
    }

    //Task_03
    public static void task_03() {
        System.out.println("Task_03:");
        int[] set = {1, 2, 3, 4, 6, 7, 8, 9};
        boolean flag = false;
        for (int index = 1; index < set.length; index++) {
            if (set[index] > set[index - 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Ok" : "Failed");
        System.out.println("********************");
    }

    //Task_04
    public static void task_04() {
        System.out.println("Task_04:");
        int[] set = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] % 2 == 0) {
                arrayLength++;
            }
        }
        if (arrayLength == 0) {
            System.out.println("No even numbers!");
        } else {
            int[] result = new int[arrayLength];
            int index = 0;
            for (int i = 0; i < set.length; i++) {
                if (set[i] % 2 == 0) {
                    result[index++] = set[i];
                }
            }
            System.out.println(Arrays.toString(result));
        }
        System.out.println("********************");
    }

    //Task_05
    public static void task_05() {
        System.out.println("Task_05:");
        int[] set = {200, 2, 3, 4, 5, 600, 7, 8, 9, 100};
        int arrayLength = set[0];
        for (int i = 1; i < set.length; i++) {
            if (set[i] > arrayLength) {
                arrayLength = set[i];
            }
        }
        System.out.println("Min: " + arrayLength);
        System.out.println("********************");
    }

    //Task_06
    public static void task_06(int z) {
        System.out.println("Task_06:");
        int[] set = {11,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < set.length; i++) {
            if (set[i] > z) {
                set[i] = z;
                count++;
            }
        }
        System.out.println("Count: " + count);
        System.out.println(Arrays.toString(set));
        System.out.println("********************");
    }

    //Task_07
    public static void task_07() {
        System.out.println("Task_07:");
        int[] set = {1,2,-3,4,50,6,78,8,9,10};
        int minIndex = 0;
        int min = set[minIndex];
        int maxIndex = 0;
        int max = set[maxIndex];
        for (int i = 1; i < set.length; i++) {
            if(set[i] > max) {
                max = set[i];
                maxIndex = i;
            } else if(set[i] < min) {
                min = set[i];
                minIndex = i;
            }
        }
        int temp;
        temp = set[minIndex];
        set[minIndex] = set[maxIndex];
        set[maxIndex] = temp;
        System.out.println(Arrays.toString(set));
        System.out.println("********************");
    }

    //Task_08
    public static void task_08(int i) {
        System.out.println("Task_08:");
        int[] set = {1,2,-3,4,50,6,78,8,9,10};
        for (int number : set) {
            if(number > i) {
                System.out.println(number);
            }
        }
        System.out.println("********************");
    }

    //Task_09
    public static void task_09() {
        System.out.println("Task_09:");
        int[] set = {1,2,-3,4,50,-6,78,0,8,9,10,0};
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int number : set) {
            if(number > 0) {
                countPositive++;
            }
            if (number < 0) {
                countNegative++;
            }
            if (number == 0) {
                countZero++;
            }
        }
        System.out.println("Positive: " + countPositive);
        System.out.println("Negative: " + countNegative);
        System.out.println("Zero: " + countZero);
        System.out.println("********************");
    }

    //Task_10
    public static void task_10() {
        System.out.println("Task_10:");
        int[] set = {2,1,5,4,3,1,4,3,2,8};
        int value = set.length - 1;
        int max = 0;
        for (int index = 0; index < set.length / 2; index++) {
            int temp = set[index] + set[value--];
            if(temp > max) {
                max = temp;
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("********************");
    }
}
