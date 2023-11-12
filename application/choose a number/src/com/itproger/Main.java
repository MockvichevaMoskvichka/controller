package  com.itproger;
import java.util.Scanner;

public class Main {
//public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_draw = "\u001B[12m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";


    //  System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLUE + text + ANSI_RESET);


    //public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_draw + "Напишите свое желание");
            String str = scanner.nextLine();
            System.out.println("напишите цифру от 1 до 5");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Ваше желание сбудется через 1 день");
                    break;
                case 2:
                    System.out.println("Ваше желание сбудется через 2 день");
                    break;
                case 3:
                    System.out.println("Ваше желание сбудется через 3 день");
                    break;
                case 4:
                    System.out.println("Ваше желание сбудется через 4 день");
                    break;
                case 5:
                    System.out.println("Ваше желание сбудется через 5 день");
                    break;
                default:
                    System.out.println("ОШИБКА!!Введите цифры от 1 до 5");
            }
        }
    }


