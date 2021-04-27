import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array0 {

    public static void main(String[] args) {
        int[] myArray = {0 ,1, 2, 3, 4, 8, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(myArray, key );
//        System.out.println(index);
        if (index >=0){
            System.out.println("There is such a number in the myArray ");
        } else {
            System.out.println("There isn`t such number in the myArray");
        }

        }


}


