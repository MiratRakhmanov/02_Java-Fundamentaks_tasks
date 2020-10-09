package com.mirat.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        task_01(1, 2, 3);
        task_02(1, 2, 3, 4);
        task_03(7700000000000L);
        task_04();
        task_05(3, 6);
        task_06(90, 50);
        task_07(-1, -5, 0);
        task_08(5, 10, 5, 10, 15);
        task_09(5);
        task_10();
        task_11(1, 10, 1);
        task_12();
        task_13();
        task_14(5);
        task_15(100, 555);
    }

    //Task_01
    public static void task_01(double a, double b, double c) {
        System.out.println("Task_01:");
        System.out.println(b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println("********************");
    }

    //Task_02
    public static void task_02(double a, double b, double c, double d) {
        System.out.println("Task_02:");
        System.out.println((a / c) * (b / d) - (a * b - c) / (c * d));
        System.out.println("********************");
    }

    //Task_03
    public static void task_03(long a) {
        System.out.println("Task_03:");
        System.out.println("Kilobyte: " + (a / 1000));
        System.out.println("Megabyte: " + (a / 1000_000));
        System.out.println("Gigabyte: " + (a / 1000_000_000));
        System.out.println("Terabyte: " + (a / 1000_000_000_000f));
        System.out.println("********************");
    }

    //Task_04
    public static void task_04() {
        System.out.println("Task_04:");
        int one = 1;
        int two = 2;
        if (one < two) {
            System.out.println("One is less than two: " + 7);
        } else {
            System.out.println("Two is less than one: " + 8);
        }
        System.out.println("********************");
    }

    //Task_05
    public static void task_05(int a, int b) {
        System.out.println("Task_05:");
        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else if (a < b) {
            System.out.println(b + " is bigger than " + a);
        } else {
            System.out.println("They are equal");
        }
        System.out.println("********************");
    }

    //Task_06
    public static void task_06(double a, double b) {
        System.out.println("Task_06:");
        if (a + b < 180) {
            System.out.println("The triangle exists.");
            if (a + b == 90 || a == 90 || b == 90) {
                System.out.println("Has a right angle");
            } else {
                System.out.println("Has no right angle");
            }
        } else {
            System.out.println("The triangle doesn't exist.");
        }
        System.out.println("********************");
    }

    //Task_07
    public static void task_07(int a, int b, int c) {
        System.out.println("Task_07:");
        int count = 0;
        if (a < 0) {
            count++;
        }
        if (b < 0) {
            count++;
        }
        if (c < 0) {
            count++;
        }
        System.out.println("Number of negative values: " + count);
        System.out.println("********************");
    }

    //Task_08
    public static void task_08(int a, int b, int x, int y, int z) {
        System.out.println("Task_08:");
        if ((a > x) && (b > y))
            System.out.println("Pass.");
        else if ((a > y) && (b > x))
            System.out.println("Pass.");
        else if ((a > x) && (b > z))
            System.out.println("Pass.");
        else if ((a > z) && (b > x))
            System.out.println("Pass.");
        else if ((a > y) && (b > z))
            System.out.println("Pass.");
        else if ((a > z) && (b > y))
            System.out.println("Pass.");
        else
            System.out.println("Fail.");
        System.out.println("********************");
    }

    //Task_09
    public static void task_09(int x) {
        System.out.println("Task_09:");
        double Fx;
        if (x <= 3) {
            Fx = Math.pow(x, 2) - 3 * x + 9;
        } else {
            Fx = 1 / Math.pow(x, 3) + 6;
        }
        System.out.println("Fx: " + Fx);
        System.out.println("********************");
    }

    //Task_10
    public static void task_10() {
        System.out.println("Task_10:");
        int x = 2;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
        System.out.println("********************");
    }

    //Task_11
    public static void task_11(int a, int b, int h) {
        System.out.println("Task_11:");
        int y = 0;
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else if (i <= 2) {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
        System.out.println("********************");
    }

    //Task_12
    public static void task_12() {
        System.out.println("Task_12:");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
        System.out.println("********************");
    }

    //Task_13
    public static void task_13() {
        System.out.println("Task_13:");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please enter a positive number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " is not a valid number.");
                System.out.print("Please enter a integer: ");
            }
            number = scanner.nextInt();
        } while (number < 0);
        int result = 0;
        for (int i = 1; i < number; i++) {
            result += i;
        }
        System.out.println(result);
        System.out.println("********************");
    }

    //Task_14
    public static void task_14(int a) {
        System.out.println("Task_14:");
        int result = 1;
        if (a == 0 || a == 1) {
            System.out.println(result);
        }
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
        System.out.println("********************");
    }

    //Task_15
    public static void task_15(int a, int b) {
        System.out.println("Task_15:");
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        System.out.println(a + b);
        System.out.println("********************");
    }
}

