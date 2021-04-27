import java.util.Arrays;

public class Array3 {


    public static void main(String[] args) {

        int[] Array1 = {10, 3, 5, 7, 9};
        int[] Array2 = {20, 4, 22, 6, 14};

        System.out.println("This is first array" + Arrays.toString(Array1));
        System.out.println("This is second array" + Arrays.toString(Array2));

        Arrays.sort(Array1);
        Arrays.sort(Array2);

        double avr1 = 0;
        double avr2 = 0;

        for(int i = 0; i < 5; i++){
            avr1 += Array1[i];
            avr2 += Array2[i];
        }
        avr1 /=5;
        avr2 /=5;

//        System.out.println(avr1);
//        System.out.println(avr2);
        if (avr1>avr2){
            System.out.println("First array more then second");
        }
      else if (avr1 < avr2){
            System.out.println("Second array more then first");
        } else {
            System.out.println("These arrays are equal");
        }

    }
}