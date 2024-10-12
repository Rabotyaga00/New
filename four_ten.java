import java.util.Scanner;
public class four_ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");

        double radius = scanner.nextDouble();
        System.out.print("Введите сторону квадрата: ");
        double side = scanner.nextDouble();

        double areaCircle = Math.PI * Math.pow(radius, 2);
        double areaSquare = Math.pow(side, 2);

        System.out.println("Площадь круга: " + areaCircle);
        System.out.println("Площадь квадрата: " + areaSquare);

        if (areaCircle > areaSquare) {
            System.out.println("Площадь круга больше площади квадрата.");
        } else if (areaCircle < areaSquare) {
            System.out.println("Площадь квадрата больше площади круга.");
        } else {
            System.out.println("Площади равны.");
        }

        scanner.close();
    }
}
