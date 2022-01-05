public class Lesson5 {
    public static void main(String[] args) {
        int z = myMethod(7,11);
        System.out.println(z+1);

        String sz;
        sz = Integer.toString(myMethod(3,4));
        System.out.println(sz+1);

        plusMethodInt(5, (int) 6.3);
        plusMethodDouble(7,9);
        plusMethodInt("Ali", 15);
    }

    static int myMethod(int x, int y) {
        return x + y;
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethodInt(String fname, int age) {
        return age+1;
    }

}
