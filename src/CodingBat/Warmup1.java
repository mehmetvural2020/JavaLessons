package CodingBat;

public class Warmup1 {
    public static void main(String[] args) {
        System.out.println(sleepIn(true, true));
        boolean result = sleepIn(true, false); // → true
        System.out.println(result);

        result = monkeyTrouble(false,true);
        System.out.println("Monkey trouble : " + result);

        System.out.println(parrotTrouble(true, 3));
        result = parrotTrouble(false, 8);
        if(result) System.out.println("We are in trouble.");
        else System.out.println("We are not in trouble.");

    }

    /*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true*/

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(vacation || !weekday) return true;

        return false;
    }


    /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false*/

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile==true & bSmile== true) || (aSmile==false & bSmile==false)) return true;

        return false;
    }

    /*Given two int values, return their sum. Unless the two values are the same,
    then return double their sum.
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8*/

    public static int sumDouble(int a, int b) {
//        if(a != b) return a+b;
//        if(a==b) return 2*(a+b);

//        if(a != b) return a+b;
//        else return 2*(a+b);

        return (a != b) ? a+b : 2*(a+b);

    }

    /*Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0*/

    public static int diff21(int n) {
//        if(n>21) return 2*(Math.abs(n-21));
//        return Math.abs(n-21);

        return (n>21) ? 2*(Math.abs(n-21)) : Math.abs(n-21);
    }

    /*We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    Return true if we are in trouble.

    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false*/

    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && ((hour < 7) || hour > 20)) return true;

        return false;
    }


    /*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true*/

    public static boolean makes10(int a, int b) {
        if(a==10 || b==10 || (a+b)==10) return true;

        return false;
    }

    /*Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.

    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false*/

    public static boolean nearHundred(int n) {
        if(Math.abs(n-100) <=10 || Math.abs(n-200) <=10) return true;
        return false;
    }

    /*Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true,
    then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true*/

    public static boolean posNeg(int a, int b, boolean negative) {
        if((negative) && (a<0 && b<0) || (!negative && ((a<0 && b>0) || (a>0 && b<0)))) return true;
        return false;

    }

    /*Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.


    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"*/

    public static String notString(String str) {
        if(str.length()>3 && str.substring(0,3).equals("not")) return str;
        else return "not" + str;
    }




}
