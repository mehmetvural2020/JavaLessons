package CodingBat;

public class WarmUp2_1_10 {
    public static void main(String[] args) {

    }

    /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"*/


    /*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"*/
    public String frontTimes(String str, int n) {
        String newStr = "";
        for(int i = 0; i < n; i++){
            if(str.length()>=3) {
                newStr = newStr + str.substring(0,3);
            }
            else newStr += str;
        }
        return newStr;
    }

    /*Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3*/
    int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x') count++;
        }
        return count;
    }

    /*Given a string, return true if the first instance of "x"
    in the string is immediately followed by another "x".

    doubleX("axxbb") → true   hax
    doubleX("axaxxax") → false
    doubleX("xxxxx") → true*/

    boolean doubleX(String str) {
//        for(int i = 0; i < str.length()-1; i++){
//            if(str.charAt(i)=='x'){
//                if(str.charAt(i+1)=='x') return true;
//                else return false;
//            }
//        }
//        return true;
//        int firstX = str.indexOf('x');
//        if(firstX < str.length()-1 && str.charAt(firstX+1) == 'x') return true;
//        return false;

        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?

//        boolean result = str.substring(i+1, i+2).equals("x")
//        return result;

        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }

    /*Given a string, return a new string made of every other char
    starting with the first, so "Hello" yields "Hlo".


    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"*/
    public String stringBits(String str) {

        return str;
    }

}
