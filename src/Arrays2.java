import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // new String[];
        cars[0] = "Opel";
        cars[2] = "TOYOTA";

        for(String car : cars){     //for each loop...
            System.out.println(car);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[0][3];
        System.out.println(x); // Outputs 4

        String[][] fruits = { {"Banana", "Apple", "Cherry"}, {"Orange", "Grapes", "Durian", "Strawberry"} };

        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<fruits[i].length; j++){
                System.out.println(fruits[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(fruits));



    }
}
