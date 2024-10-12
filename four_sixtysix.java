import java.util.Scanner;

public class four_sixtysix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время в минутах (t): ");
        double t = scanner.nextDouble();
        double timeInCycle = t % 10;

        if (timeInCycle < 3) {
            System.out.println("Сигнал: Зеленый");
        } else if (timeInCycle < 5) {
            System.out.println("Сигнал: Красный");
        } else if (timeInCycle < 8) {
            System.out.println("Сигнал: Зеленый");
        } else {
            System.out.println("Сигнал: Красный");
        }

        scanner.close();
    }
}
