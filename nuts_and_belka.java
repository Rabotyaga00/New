import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class nuts_and_belka {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\andre\\IdeaProjects\\hw 6.10\\src\\input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");

                if (numbers.length == 3) {
                    int N = Integer.parseInt(numbers[0]);
                    int M = Integer.parseInt(numbers[1]);
                    int K = Integer.parseInt(numbers[2]);

                    int allNuts = N * M;

                    if (allNuts >= K) {
                        System.out.println("Хватает орехов");
                    } else {
                        System.out.println("Маловато");
                    }
                } else {
                    System.out.println("Неверное количество чисел в строке: " + line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: ");
        }
    }
}
