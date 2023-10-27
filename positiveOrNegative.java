import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number<0){
            System.out.println("Число отрицательное");
        } else if (number>0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число равно нулю");
        }

    }
}
