import java.util.Scanner;

public class two_nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");

        int num = scanner.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Ошибка: введите трехзначное число.");
        } else {
            int n1 = num % 10;
            int n2 = num / 10 % 10;
            int n3 = num / 100;

            System.out.println(n1+""+n2+""+n3);
        }

        scanner.close();
    }
}
