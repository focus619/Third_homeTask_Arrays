import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {

        String[] myArray= {"Mary", "Veronika", "Michal", "John", "Anatolii"};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i] + "");
        }
        System.out.println(Arrays.toString(myArray));
    }
}
