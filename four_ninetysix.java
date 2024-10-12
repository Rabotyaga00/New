import java.util.Scanner;

public class four_ninetysix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a (a != 0): ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a должно быть ненулевым!");
            return;
        }

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Уравнение имеет два различных вещественных корня: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.printf("Уравнение имеет один вещественный корень: x = %.2f%n", x);
        } else {
            System.out.println("Уравнение не имеет вещественных корней.");
        }
        scanner.close();
    }
}
