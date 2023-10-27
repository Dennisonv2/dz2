import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner me = new Scanner(System.in);
        int numb = me.nextInt();
        System.out.println("Введите число");
        if (numb > 0)
            System.out.print("Ваше число " + numb + " не отрицательное");
        else{
            System.out.print("Ваше число " + numb + "отрицательное");
        }
    }
}