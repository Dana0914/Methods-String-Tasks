package strings;

public class task10 {
    public static void main(String[] args) {
        //Создать функцию, принимающую одну строку с инфой по недвижимости,
        // и возвращающую то что требуется в задаче. Использовать тернарную операцию, split()
        //Дана строка формата "3-комнатная квартира, 117.2 м², 2/12 этаж, Гагарина — Ескараева"
        // или "3-комнатная квартира, 117.2 м², 2/12 этаж, Гагарина".
        // Создать строковые переменные address и crossing.
        // В оригинальной строке они разделены знаком '—'.
        // Если его нет в строке значит пересечение улиц не указано.
        // String getAddress(String input), String getCrossing(String input)
        String input = "3-комнатная квартира, 117.2 м², 2/12 этаж, Гагарина";
        String address = null;
        String crossing = "—";
        String[] parts = input.split(",");
        for (String part : parts) {
            if (part.contains(crossing)) {
                address = part.trim();
            }
        }
        System.out.println(address);

    }

}
