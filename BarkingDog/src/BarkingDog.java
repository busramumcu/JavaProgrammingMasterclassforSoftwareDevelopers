public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (barking == true) {

            if ((0 <= hourOfDay && hourOfDay < 8) || hourOfDay == 23) {
                return true;
            }
            return false;
        }
        if (hourOfDay < 0 || hourOfDay >23) {
            return false;
        }
        return barking;
    }

}