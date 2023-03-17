import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(991) + 10;
        int tries = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Загадайте число от 10 до 1000");
            System.out.println("1. Загадал");
            System.out.println("2. Выход");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();

            while (choice != 2) {
                if (choice == 1) {
                    int guess = 0;
                    int min = 10; 
                    int max = 1000;
                    while (guess != secretNumber) {
                        guess = (min + max) / 2;
                        tries++;
                        System.out.println("Вы загадали " + guess + "?");
                        System.out.println("1. Больше");
                        System.out.println("2. Меньше");
                        System.out.println("3. Угадал");
                        System.out.println("4. Выход");
                        System.out.print("Ваш выбор: ");
                        int answer = scanner.nextInt();
                        switch (answer) {
                            case 1:
                                min = guess + 1;
                                break;
                            case 2:
                                max = guess - 1;
                                break;
                            case 3:
                                System.out.println("Число угадано за " + tries + " попыток!");
                                System.exit(0);
                            case 4:
                                System.exit(0);
                            default:
                                System.out.println("Неправильный выбор.");
                        }
                    }
                } else {
                    System.out.println("Неправильный выбор.");
                }
                System.out.println();
                System.out.println("Загадайте число от 10 до 1000");
                System.out.println("1. Загадал");
                System.out.println("2. Выход");
                System.out.print("Ваш выбор: ");
                choice = scanner.nextInt();
            }
        }

        System.out.println("До свидания!");
    }
}
