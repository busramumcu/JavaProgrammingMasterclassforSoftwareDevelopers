public class SeecondAndMinutesChallenge {

    public static int getDurationString(int minutes, int seconds) {

        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid Value");
            return 0;
        } else {

            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            System.out.println(hours + "h  " + remainingMinutes + "m  " + seconds + "s");
            return hours;
        }
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
            return 0;
        } else {

            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);

        }
    }

}
/*  BONUS CHALLENGE SOLUTION
  private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds <0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }


        return hoursString + " " + minutesString + " " + secondsString + "";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

*/