import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Треугольник со сторонами a, b и c существует.");
            } else {
                System.out.println("Треугольник со сторонами a, b и c не существует.");
            }
        } else {
            System.out.println("Стороны должны быть положительными числами.");
        }

        scanner.close();
    }
}
