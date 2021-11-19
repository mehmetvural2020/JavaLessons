public class SwitchCaseSamples {
    public static void main(String[] args) {
        int day = 110;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 11:
                day = 1000;
                System.out.println("Wednesday");
                System.out.println(day);
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default :
                System.out.println("There is no such a number or day.");
        }

// Outputs "Thursday" (day 4)
    }
}
