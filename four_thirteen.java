import java.util.Scanner;

public class four_thirteen {
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
            System.out.println("Уравнение имеет два различных вещественных корня.");
        } else if (D == 0) {
            System.out.println("Уравнение имеет один вещественный корень.");
        } else {
            System.out.println("Уравнение не имеет вещественных корней.");
        }

        scanner.close();
    }
}
