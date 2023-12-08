package strings;

import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        //Создать функцию, принимающую одну строку с инфой по недвижимости, и
        // возвращающую то что требуется в задаче. Использовать тернарную операцию, split()
        //Дана строка формата "3-комнатная квартира, 117.2 м², 2/12 этаж,
        // Гагарина — Ескараева" или "3-комнатная квартира, 117.2 м², 2 этаж,
        // Гагарина — Ескараева" или "3-комнатная квартира, 117.2 м²,
        // Гагарина — Ескараева". Создать интовые переменные
        // floor и totalFloors и положить туда этаж и этажность.
        // Если какого то параметра нет, то оставить переменные равными нулю.
        // int getFloor(String input), int getTotalFloors(String input)
        String input = "3-комнатная квартира, 117.2 м², 2 этаж, Гагарина — Ескараева";
        int floor = 0;
        int totalFloors = 0;
        StringBuilder s = new StringBuilder();
        String[] parts = input.split(",");
        for (String part : parts) {
            if (part.contains("/")) {
                floor = Integer.parseInt(part.substring(part.indexOf("/")-1, part.indexOf("/")));
                s.append(part.substring(floor+1));
                s.delete(floor+1, s.length());
                totalFloors = Integer.parseInt(s.toString().trim());
            }
        }
        System.out.println(floor);
        System.out.println(totalFloors);

    }
}
