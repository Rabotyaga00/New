import java.util.Scanner;

public class four_ninetyseven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        System.out.print("Введите третье целое число: ");
        int third = scanner.nextInt();
        int max = first;
        int min = first;

        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }

        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }

        int middle;
        if ((first > min && first < max)) {
            middle = first;
        } else if ((second > min && second < max)) {
            middle = second;
        } else {
            middle = third;
        }

        System.out.println("Самое большое число: " + max);
        System.out.println("Самое маленькое число: " + min);
        System.out.println("Среднее число: " + middle);

        scanner.close();
    }
}
