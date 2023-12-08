package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        //Напишите функцию search(ArrayList lst, String substr), принимающую список
        // строк и искомую подстроку, и возвращающую новый список из тех же строк,
        // но только тех, внутри которых есть искомая фраза,  (функция не принтит новый список,
        // а именно возвращает, т.е. использовать return).
        // Например вызов search(['python', 'java', 'c#', 'javascript'], "c")
        // вернет список ['c#', 'javascript'] (т.к. только эти строки содержат искомое 'c')
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("python", "java", "c#", "javascript"));
        String substr = "c";
        System.out.println(search(stringList, substr));
    }
    public static ArrayList<String> search(ArrayList<String> lst, String substr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < lst.size(); ++i) {
            if (lst.get(i).contains(substr)) {
                list.add(lst.get(i));
            }
        }
        return list;
    }
}
