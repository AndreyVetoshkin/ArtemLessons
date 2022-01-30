import java.util.Scanner;

public class ConsoleIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        System.out.printf("Ваше введенное число: %d", num);
        System.out.println();
        System.out.printf("Введенное число, умноженное на 2: %d", num * 2);

        {
            // Программа для вывода Имени, Возраста и Роста
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            System.out.print("Введите возраст: ");
            int age = in.nextInt();
            System.out.print("Введите рост: ");
            float height = in.nextFloat();

            System.out.printf("\nИмя:\t\t%15s\nВозраст:\t%15d\nРост:\t\t%-15.2f \n", name, age, height);
        }
        in.close();
    }
}
