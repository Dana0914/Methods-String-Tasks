package strings;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Напишите функцию, которая определяет является ли пароль криптостойким.
        // Пароль называется криптостойким, если он включает в себя и строчные латинские буквы,
        // и заглавные латинские буквы, и цифры, при этом его длина должна быть не менее 8 символов:
        // boolean isEncrypted(String password)

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.length() > 8) {
            System.out.println("Password length should be 8 characters");
        }
        System.out.println(isEncrypted(password));
    }
    public static boolean isEncrypted(String password) {
        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        char ch;
        StringBuilder passwordBuilder = new StringBuilder(password);
        for (ch = 'a'; ch <= 'z'; ch++) {
            passwordBuilder.append(String.valueOf(ch));
        }
        StringBuilder passwordBuilder1 = new StringBuilder(passwordBuilder.toString());
        for (ch = 'A'; ch <= 'Z'; ch++) {
            passwordBuilder1.append(String.valueOf(ch));
        }
        StringBuilder passwordBuilder2 = new StringBuilder(passwordBuilder1.toString());
        for (ch = 48; ch <= 57; ch++) {
            passwordBuilder2.append(String.valueOf(ch));
        }

        for (char c : passwordBuilder.toString().toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase;
    }
}
