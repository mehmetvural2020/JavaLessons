public class Lesson1 {
    public static void main(String[] args) {
        int x = 10;
        x += 5;  //==>  x = x +5;
        System.out.println(x);

        int newSum = sum(5,7);
        System.out.println("New sum : " + newSum);

        String fruits;
        fruits = "Apple";
        fruits = "peach";
        fruits = "banana";
        System.out.println("\"Fruits name is :\"" + fruits);
        String name;
        name = "JAVA";
        System.out.println("Welcome to " + name + " Programming Language.");

        int i = 9;
        double d = 2.72;

// Safe conversion, thus implicit conversion
        double fromInt = i;

// Potentially unsafe conversion, thus explicit conversion
        int fromDouble = (int) d;  // (int) ==> casting from double type to int type
        int fDouble = (int) d;



    }

    public static int sum(int x, int y){

        return x+y;
    }
}
