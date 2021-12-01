public class Lesson4 {
    public static void main(String[] args) {


        int time = 15;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        /*Short Hand If...Else (Ternary Operator)
    There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
    It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:
    Syntax
    variable = (condition) ? expressionTrue :  expressionFalse;
    */
        String result = (time<18) ? "iyi gunler" : "iyi aksamlar";
        System.out.println(result);


        myMethod("Adem", 2021);




    }

    static void myMethod(String fname, int year) {
        System.out.println( fname + " Doe " + year);
    }
}
