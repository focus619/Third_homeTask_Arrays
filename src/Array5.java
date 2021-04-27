import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                myArray[i]= 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
