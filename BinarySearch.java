import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // Если элемент найден, возвращаем его индекс
            } else if (array[mid] > target) {
                high = mid - 1; // Ищем слева от середины
            } else {
                low = mid + 1; // Ищем справа от середины
            }
        }

        return -1; // Если элемент не найден, возвращаем -1
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(array));
        System.out.println("Какой элемент вы хотите найти?");
        int target = scanner.nextInt();

        // Пример использования итеративного алгоритма бинарного поиска
        int indexSearched = binarySearch(array, target);
        if (indexSearched != -1) {
            System.out.println("Элемент " + target + " найден по индексу " + indexSearched);
        } else {
            System.out.println("Элемент " + target + " не найден");
        }
    }

}
