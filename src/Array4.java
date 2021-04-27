import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int b = sc.nextInt();
        int[] myArray = new int[b];
        int p = 1;
        int o = 100;
        if (myArray.length < 5) {
            System.out.println("Please enter number more then 5");

        } else if (myArray.length > 10) {
            System.out.println("Please enter number less then 11");

        } else {
            for(int i = 0; i < b ; i++)
            myArray[i] = p + (int)(Math.random()*o);
            System.out.println(Arrays.toString(myArray));
        }
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                count++;
            }
        }
            int[] arrayCopy = new int [count];
            int myEvenIndex = 0;
            for (int i = 0; i< myArray.length; i++){
                if (myArray[i]% 2 == 0){
                    arrayCopy[myEvenIndex] = myArray[i];
                    myEvenIndex++;
                    System.out.println(Arrays.toString(arrayCopy));
                }
            }

    }

}