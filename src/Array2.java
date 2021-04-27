import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int[] myArray = new int[n];
        int p = 1;
        int o = 100;

        for (int i = 0; i < n; i++) {
            myArray[i] = p + (int)(Math.random()*o);
        }
            Arrays.sort(myArray);
            System.out.println(Arrays.toString(myArray));
            int min, max;
        min = max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min)
                min = myArray[i];
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
//        Среднее число не смог найти =(
        System.out.println("min is: " + min +"; max is: " + max);
              }



        }