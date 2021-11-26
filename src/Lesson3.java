public class Lesson3 {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate")); // Outputs 7

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("where")); // Outputs 14

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.concat("Adem"));

        System.out.println("Adem's Home");

        System.out.println("Adem said that : \"Come to school\" .");

        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3);

        String txt4 = "He\bo World!"; //delete a character from the left of back slash  --> HO World!
        System.out.println(txt4);

        String txt5 = "He\fo World!"; //delete a character from the left of back slash  --> HO World!
        System.out.println(txt5);

        int x = 10;
        int y = 20;
        int z = x + y;      // z will be 30 (an integer/number)

        String xs = "10";
        String ys = "20";
        String zs = xs + ys;   // z will be 1020 (a String)

        String sums = Integer.toString(10) + 25;
        System.out.println(sums);

        int i=300;
        String s=String.valueOf(i);//Now it will return "10"
        System.out.println(s + 25);

        int a=200;
        String ss=String.valueOf(a);
        System.out.println(a+100);//300 because + is binary plus operator
        System.out.println(ss+100);//200100 because + is string concatenation operator

        // Math Class :

        System.out.println(Math.max(5, 10));
        int findMaxNumber = Math.max(10,25);
        System.out.println(findMaxNumber);

        i = Math.min(5, 10); // Find a minimum number.

        double xDouble =  Math.sqrt(64); //The Math.sqrt(x) method returns the square root of x:

        int xInt = (int) Math.sqrt(64);
        System.out.println(xInt);
        System.out.println(xDouble);


        // The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.abs(-407));

//        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

    }
}
