package PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("Укажите длину пароля (от 8 до 12 символов): ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length < 8) {
            System.out.println("Вы выбрали слишком маленькую длину пароля. Попробуйте еще раз!");
            length = scanner.nextInt();
        } else if (length > 12) {
            System.out.println("Вы выбрали слишком большую длину пароля. Попробуйте еще раз!");
            length = scanner.nextInt();
        }

        Random rand = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomType = rand.nextInt(4);
            char randomChar;

            switch (randomType) {
                case 0: // Цифра
                    randomChar = (char) (rand.nextInt(10) + '0');
                    break;
                case 1: // Заглавная буква
                    randomChar = (char) (rand.nextInt(26) + 'A');
                    break;
                case 2: // Строчная буква
                    randomChar = (char) (rand.nextInt(26) + 'a');
                    break;
                case 3: // Специальный символ
                    randomChar = (char) (rand.nextInt(32) + 33);
                    break;
                default:
                    randomChar = ' ';
            }
            password[i] = randomChar;
        }
        System.out.println("Сгенерированный пароль: " + new String(password));
    }
}
