package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        //Напишите функцию maxWordLength(ArrayList lst), принимающую список строк
        // и возвращающую длину самой большой строки (функция не принтит новый список,
        // а именно возвращает, т.е. использовать return).
        // Например вызов maxWordLength(['python', 'java', 'c#']) вернет 6
        // (т.к. самое длинное слово это 'python', и его длина 6)
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("python", "java", "c#"));
        System.out.println(maxWordLength(stringList));
    }
    public static int maxWordLength(ArrayList<String> lst) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lst.size(); ++i) {
            int maxWord = lst.get(i).length();
            if (maxWord > max) {
                max = maxWord;
            }
        }
        return max;
    }
}
