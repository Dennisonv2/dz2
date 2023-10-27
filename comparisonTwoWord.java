import java.util.Objects;
import java.util.Scanner;

public class comparisonTwoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово: ");
        String secondWord = scanner.nextLine();

        if (Objects.equals(firstWord, secondWord)){
            System.out.println("Слова одинаковы");
        } else{
            System.out.println("Слова разные");
        }
    }
}
