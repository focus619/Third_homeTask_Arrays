import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {

        int[] myArray = {14, 1, 17, 3, 12, 13, 22};
        System.out.println("Before");
        System.out.println(Arrays.toString(myArray));

        for(int i = myArray.length-1;i > 0; i--){
            for (int j = 0; j < i; j++){

                if (myArray[j] > myArray[j+1]){
                    int tmp =myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j+1] = tmp;
                }
            }
        }
        System.out.println("After");
        System.out.println(Arrays.toString(myArray));

    }
}