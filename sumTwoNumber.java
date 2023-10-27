import java.util.Scanner;

public class sumTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();

        int lastDigit=number%10;
        while (number>=10){
            number/=10;
        }
        int firstDigit=number;
        int sum=firstDigit+lastDigit;
        System.out.println("Сумма первой и последней цифры: "+sum);
    }
}
