import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4, 8, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(myArray, key);
        if (index < 0) {
            System.out.println("There isn`t such a number in the myArray ");
        } else {

            int[] result = new int[myArray.length - 1];
            System.arraycopy(myArray, 0, result, 0, index);

            System.arraycopy(myArray, index + 1, result, index, myArray.length - index - 1);

            System.out.println(Arrays.toString(result));
        }

    }
}