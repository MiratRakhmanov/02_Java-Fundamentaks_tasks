package com.mirat.lesson.hw;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {
        task01();
        task02(2, 1);
        task03();
        task04(6, 5);
        task05(4, 4);
        task06(6, 6);
        task07(6, 6);
        task08(6, 6);
        task09(6, 6);
        task10();
        task11();
        task12();
    }

    //Task_01
    public static void task01() {
        System.out.println("Task_01:");
        int[][] set = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int i = 0; i < set.length; i++) {
            System.out.println(set[i][i]);
        }

        System.out.println("********************");
    }

    //Task_02
    public static void task02(int row, int column) {
        System.out.println("Task_02:");
        int[][] set = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(set[row][column]);
        System.out.println("********************");
    }

    //Task_03
    public static void task03() {
        System.out.println("Task_03:");
        int[][] set = {{1, 2, 3, 4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}, {14, 15, 16, 17, 18}};
        for (int j = 0; j < set.length; j++) {
            if (j % 2 == 0) {
                for (int i = set[j].length - 1; i >= 0; i--) {
                    System.out.print(set[j][i] + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < set[j].length; i++) {
                    System.out.print(set[j][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("********************");
    }

    //Task_04
    public static void task04(int row, int column) {
        System.out.println("Task_04:");
        int[][] set = new int[row][column];
        int count = 1;
        for (int j = 0; j < set.length; j++) {
            for (int i = 0; i < set[j].length; i++) {
                if (j % 2 == 0) {
                    set[j][i] = count++;
                    System.out.print(set[j][i] + " ");
                } else {
                    set[j][i] = --count;
                    System.out.print(set[j][i] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("********************");
    }

    //Task_05
    public static void task05(int row, int column) {
        System.out.println("Task_05:");
        int[][] set = new int[row][column];
        int count = 1;
        for (int j = column - 1; j >= 0; j--) {
                set[count - 1][j] = count++;
        }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_06
    public static void task06(int row, int column) {
        System.out.println("Task_06:");
        int[][] set = new int[row][column];
        for(int i = 0; i < set.length; i++) {
                for(int j = 0; j < set[i].length; j++) {
                    if(j == 0 || j == set[i].length - 1) {
                        set[j][i] = 1;
                    }
                    if(i == 0 || i == set.length - 1) {
                        set[j][i] = 1;
                    }
                }
            }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_07
    public static void task07(int row, int column) {
        System.out.println("Task_07:");
        int[][] set = new int[row][column];
        int count = 0;
        int l = row;
        for(int i = 0; i < set.length; i++) {
            count++;
            l--;
            for(int j = 0; j <= l; j++) {
                set[i][j] = count;
            }
        }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_08
    public static void task08(int row, int column) {
        System.out.println("Task_08:");
        int[][] set = new int[row][column];
        for(int i = 0; i < set.length; i++) {
            int count = i + 1;
            for(int j = 0; j < set[i].length - i; j++) {
                set[i][j] = count++;
                }
            }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_09
    public static void task09(int row, int column) {
        System.out.println("Task_09:");
        int[][] set = new int[row][column];
        int l = row / 2;
        for(int i = 0; i < set.length; i++) {
            int count = 2;
            for(int j = 0; j < l; j++) {
                set[i][j] = (int) Math.pow(count++, i + 1);
            }
            for(int j = l; j < set[i].length; j++) {
                set[i][j] = (int) Math.pow(--count, i + 1);
            }
        }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_10
    public static void task10() {
        System.out.println("Task_10:");
        int[][] set = {{1,2,3},{4,-5,6},{7,8,-9}};
        int count = 0;
        for(int i = 0; i < set.length; i++) {
            if(set[i][count] > 0) {
                System.out.println(set[i][count]);
            }
            count++;
        }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_11
    public static void task11() {
        System.out.println("Task_11:");
        int[][] set = new int[10][20];
        System.out.println(set.length);
        System.out.println(set[0].length);
        Random random = new Random();
        int max = 0;
        for(int i = 0; i < set.length; i++) {
            for(int j = 0; j < set[i].length; j++) {
                set[i][j] = random.nextInt(15);
                if(set[i][j] == 5) {
                    max += 1;
                }
            }
            if(max >= 3) {
                System.out.println("Row:" + (i + 1));
            }
            max = 0;
        }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

    //Task_12
    public static void task12() {
        System.out.println("Task_12:");
        Random random = new Random();
        int row = random.nextInt(5) + 2;
        int column = random.nextInt(5) + 2;
        int[][] set = new int[row][column];
        for(int j = 0; j < set[row - 1].length; j++) {
            int count = j;
            for(int i = 0; i < set.length; i++) {
                if(count > 0) {
                    set[i][j] = 1;
                    count--;
                }
            }
        }
        System.out.println(Arrays.deepToString(set));
        System.out.println("********************");
    }

//    public static void print(int[][] set) {
//       for(int i = 0; i < set.length; i++) {
//           System.out.println();
//           for(int j = 0; j < set[i].length; j++) {
//               System.out.print(set[i][j] + " ");
//           }
//       }
//    }
}
