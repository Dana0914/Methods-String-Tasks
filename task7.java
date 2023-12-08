package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        //Напишите функцию totalLength(ArrayList lst), принимающую список строк и
        // возвращающую суммарную длину всех строк в списке (функция не принтит новый список,
        // а именно возвращает, т.е. использовать return). Например вызов
        // totalLength(['python', 'java', 'c#']) вернет 12 (т.к. 6 + 4 + 2 равно 12)
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("python", "java", "c#"));
        System.out.println(totalLength(stringList));
    }
    public static int totalLength(ArrayList<String> lst) {
        int count = 0;
        for (int i = 0; i < lst.size(); ++i) {
            int totalLength = lst.get(i).length();
            count += totalLength;
        }
        return count;
    }
}
