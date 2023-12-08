package strings;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        //Создать функцию, принимающую одну строку с инфой по недвижимости,
        // и возвращающую то что требуется в задаче. Использовать тернарную операцию, split()
        //Дана строка формата "3-комнатная квартира, 117.2 м², 2/12 этаж, Гагарина — Ескараева".
        // Создать double переменную square и сохранить туда площадь.
        // public static double getSquare(String input)
        String str = "3-комнатная квартира, 117.2 м², 2/12 этаж, Гагарина — Ескараева";
        double square = 0;
        String[] parts = str.split(",");
        for (String part : parts) {
            if (part.contains("м²")) {
                square = part.contains("м²") ? Double.parseDouble(part.substring(0, part.indexOf("м²")).trim()) : 0;
            }
        }
        System.out.println(square);


    }
}
