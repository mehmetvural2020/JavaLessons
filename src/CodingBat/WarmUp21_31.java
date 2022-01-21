package CodingBat;

public class WarmUp21_31 {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
    }

    /*Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.


    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedelbc") → "adedbc"*/

    public static String delDel(String str) {
        //Solution 1 :
//        int num = 0;
//        num = str.indexOf("del");
//        if(num==1) return str.substring(0,1) + str.substring(4,str.length());
//        return str;

        //Solution 2 :
        if(str.length()>3 && str.substring(1,4).equals("del")) return str.substring(0,1).concat(str.substring(4));
        return str;
                    }

    /*Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false*/

    public boolean mixStart(String str) {
//        Solution 1 :
//        if(str.indexOf("ix")==1) return true;
//        return false;

        if(str.length()>2 && str.substring(1,3).equals("ix")) return true;
        return false;
    }

    /*Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".


    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/

    public String startOz(String str) {
        // String newStr = "";
        //       if(str.startsWith("o")) newStr = "o";
        //       if(str.length()>1 && str.substring(1,2).equals("z")) newStr = newStr + "z";
        //       return newStr;

        //Solution 2:
        String newStr = "";
        if(str.startsWith("o")) newStr = "o";
        if(str.length()>1 && str.charAt(1)=='z') newStr = newStr + "z"; //newSTr=o+""+z
        return newStr;
    }

    /*Given three int values, a b c, return the largest.
    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3*/
    public int intMax(int a, int b, int c) {
           int aMax = Math.max(a,b);
            aMax = Math.max(aMax,c);
            return aMax;
//        return Math.max(a,Math.max(b,c));
    }

    /*Given 2 int values, return whichever value is nearest to the value 10,
    or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/

    public int close10(int a, int b) {
        if(Math.abs(10-a) < Math.abs(10-b)) return a;
        if(Math.abs(10-a) > Math.abs(10-b)) return b;
        return 0;
    }

    /*Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true*/
    public boolean in3050(int a, int b) {
        if((a <= 40 && a >=30) && (b<=40 && b>=30)) return true;
        if((a<=50 && a>=40) && (b<=50 && b>=40)) return true;
        return false;
    }

    /*Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false*/

    public boolean stringE(String str) {
        int count=0;
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='e') count++;
        }
        if(count>0 && count < 4) return true;
        return false;
    }
}
