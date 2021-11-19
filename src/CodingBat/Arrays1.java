package CodingBat;

public class Arrays1 {
    public static void main(String[] args) {
        boolean result = firstLast6(new int[]{26, 2, 6, 4, 5});
        System.out.println(result);

        int[] num = {6,2, 4, 6, 8, 16};
        result = firstLast6(num);
        System.out.println(result);

        int totalNumbers = sumNumbers(3,5);
        System.out.println(totalNumbers);
    }

    /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.
    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false*/

    public static boolean firstLast6(int[] nums) {
        // boolean result = false;

        // if(nums[0]==6 || nums[nums.length-1]==6){
        //           result= true;
        //       }else result = false;

        //   return result;

        if(nums[0]==6 || nums[nums.length-1]==6){
            return true;
        }else return false;
    }




    public static int sumNumbers(int a, int b){
//        int total;
//        total = a - b;    // 3(a) + 5(b)
//        return total;
        return a+b;
    }

}
