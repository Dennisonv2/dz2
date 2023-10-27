import java.util.Scanner;

public class comparisonTwoDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber=scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber=scanner.nextInt();

        String str1 = Integer.toString(firstNumber);
        String str2 = Integer.toString(secondNumber);

        if (str1.charAt(0)==str2.charAt(0)) {
            System.out.println("Первые цифры совпадают");
        } else {
            System.out.println("Первые цифры не совпадают");
        }
    }
}
