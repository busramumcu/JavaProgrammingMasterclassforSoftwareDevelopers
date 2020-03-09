public class MAin {

    /*

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }
*/

    public static void main(String[] args) {
        int hours = SeecondAndMinutesChallenge.getDurationString(65, 45);
        int hours2 = SeecondAndMinutesChallenge.getDurationString(3945);
        if (hours != 1 || hours2 != 1) {
            System.out.println(hours);
            System.out.println(hours2);
        }

    }
}
