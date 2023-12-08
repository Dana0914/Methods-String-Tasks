package strings;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //Напишите функцию countRoots(int a, int b, int c), принимающую коэффициенты
        // квадратного уравнение(a, b, c) и возвращающую кол-во корней этого уравнения.
        // Если дискриминант положительный, то корней 2, если равен нулю - то корень один,
        // если отрицательный, то корней нет (функция не принтит результат, а именно возвращает,
        // т.е. использовать return). Например вызов count_roots(1, 4, 3) вернет 2.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(countRoots(a,b,c));
    }
    public static String countRoots(int a, int b, int c) {
        int x1 = 0;
        int x2 = 0;
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            x1 = (int) (-b + Math.sqrt(d));
            x2 = (int) (-b - Math.sqrt(d));
            return "Корни: " + x1 + " " + x2;
        } else if (d == 0) {
            x1 = (int) -b / (2 * a);
            return "Корень " + x1;
        } else {
           return "Корней нет";
        }
    }
}
