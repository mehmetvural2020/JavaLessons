import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 2;
        numbers[1] =4;
        numbers[2] =6;
        numbers[3] =8;
        numbers[4] =10;
        numbers[5] =12;

        numbers[6] = 66;

        int num = 0;

        for(int i = 0; i < numbers.length; i++){
//            System.out.println(i);
            numbers[i] = num + 2;
//            num = num + 2;   => num += 2;
            num += 2;
//            System.out.println("Indexi " + i + " olan Numbers array'nin degeri : " + numbers[i]);
//            System.out.println(num);
        }
        System.out.println(Arrays.toString(numbers));

        for(int i=0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
        }

        int [] newNumbers = Arrays.copyOf(numbers, 10); //new int [10];
        newNumbers[6] = 999;
        // Arraylerin birbirine kopyalanmasi ve outoufboubd exception vermesi...

        System.out.println(Arrays.toString(newNumbers));
        newNumbers = numbers;


    }

}
