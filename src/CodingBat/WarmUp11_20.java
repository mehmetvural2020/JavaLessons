package CodingBat;

import java.util.Scanner;

public class WarmUp11_20 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 100; i=i+2){
            total += i;
//            System.out.println(total);
        }
        System.out.println(total);
        Scanner scan = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        for(int i = 1; i < 4; i++) {
            System.out.println("please enter one size of triangle : ");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        }
        int parameter = a+b+c;
        System.out.println(parameter);

    }


    /*Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"*/

    public String frontBack(String str) {
        if(str.length()>1) return str.substring(str.length()-1) + str.substring(1,str.length()-1) + str.substring(0,1);
        return str;
    }

    /* Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.

    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"*/

    public String front3(String str) {
        if(str.length()<3) return str+str+str;
        return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
    }

    /*Given a string, take the last char and return a new string
    with the last char added at the front and back, so "cat" yields "tcatt".
    The original string will be length 1 or more.

    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"*/
    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);
//        return lastChar + str + lastChar;
        return lastChar.concat(str.concat(lastChar));
//        return str.substring(str.length()-1) + str + str.substring(str.length()-1);
    }

    /*Return true if the given non-negative number is a multiple of 3
    or a multiple of 5.
    Use the % "mod" operator -- see Introduction to Mod

    or35(3) → true
    or35(10) → true
    or35(8) → false*/
    public boolean or35(int n) {
        if(n % 3 == 0 || n % 5 ==0) return true;
        return false;
    }

    /*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"*/
    public String front22(String str) {
        String front = str.substring(0,2);
        if(str.length()>= 2) return front + str + front; //return front.concat(str.concat(front))
        return str.concat(str.concat(str));  // return str+str+str;
    }

    /*Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false*/

    public boolean startHi(String str) {
//        if(str.startsWith("hi")) return true;
//        return false;

        if(str.length()>1 && str.substring(0,2).equals("hi")) return true;
        return false;

//        if(str.length()>1 && str.substring(0,2) == "hi") return true;
//        return false;
    }

    /*Given two temperatures, return true if one is less than 0 and the other is greater than 100.


    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false*/

    public boolean icyHot(int temp1, int temp2) {
        if((temp1<0 && temp2>100) || (temp1>100 && temp2 < 0)) return true;
        return false;
    }

    /*Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false*/
    public boolean in1020(int a, int b) {
        if((a>=10 && a<=20) || (b>=10 && b<=20)) return true;
        return false;
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.

    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true*/

    public boolean hasTeen(int a, int b, int c) {
        if((a<=19 && a>=13)||(b<=19 && b>=13) || (c<=19 && c>=13)) return true;
        return false;
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/
    public boolean loneTeen(int a, int b) {
//        if(((a>=13 && a<=19) && (b<13 || b>19)) || ((b>=13 && b<=19) && (a<13 || a>19))) return true;
//        return false;

        return ((a>=13 && a<=19) && (b<13 || b>19)) || ((b>=13 && b<=19) && (a<13 || a>19)) ? true : false;
    }


}
