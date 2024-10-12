import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество прошедших дней: ");
        int days_count = scanner.nextInt();
        int weeks_count = days_count / 7;
        System.out.println("Количество прошедших недель: " + weeks_count);

        two_six(scanner);
    }

    public static void two_six(Scanner scanner) {
        System.out.println("Введите количество секунд: ");
        int sec_count = scanner.nextInt();
        int hours_count = sec_count / 3600;
        System.out.println("Количество часов с начала дня: " + hours_count);

        int min_count = (sec_count % 3600) / 60;
        System.out.println("Прошло минут с начала часа: " + min_count);

        int sec_in_min = (sec_count % 3600) % 60;
        System.out.println("Прошло секунд c начала минуты: " + sec_in_min);
    }
    
}
