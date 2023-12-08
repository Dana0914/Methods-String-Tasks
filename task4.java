package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        //Напишите функцию listUpper(ArrayList lst), принимающую список строк
        // и возвращающую новый список из тех же строк, но только все строки должны
        // быть с большой буквы (функция не принтит новый список, а именно возвращает,
        // т.е. использовать return). Например вызов listUpper(['python', 'java', 'c#'])
        // вернет список ['Python', 'Java', 'C#']
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("python", "java", "c#"));
        System.out.println(listUpper(stringList));
    }
    public static List<String> listUpper(List<String> lst) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < lst.size(); ++i) {
            list.add(lst.get(i).toUpperCase().charAt(0) + lst.get(i).substring(1));
        }
        return list;

    }
}
