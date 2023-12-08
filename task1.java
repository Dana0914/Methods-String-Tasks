package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //Напишите функцию getRandList(int n), принимающую целое число n и возвращающую
        // ArrayList случайных чисел от 0 до 10 длиною n (функция не принтит сгенерированный список,
        // а именно возвращает, т.е. использовать return).
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getRandList(n));
    }
    public static List<Integer> getRandList(int n) {
        List<Integer> num = new ArrayList<>();
        int rand = 0;
        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * n + 1);
            num.add(rand);
        }
        return num;
    }
}
