import java.util.Scanner;

public class four_nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость в километрах в час: ");
        double speedKmH = scanner.nextDouble();

        System.out.print("Введите скорость в метрах в секунду: ");
        double speedMPS = scanner.nextDouble();

        double speedKmHToMPS = speedKmH * 1000 / 3600;

        if (speedKmHToMPS > speedMPS) {
            System.out.println("Скорость в километрах в час  больше");
        } else if (speedKmHToMPS < speedMPS) {
            System.out.println("Скорость в метрах в секунду  больше");
        } else {
            System.out.println("Скорости равны.");
        }

        scanner.close();
    }
}

