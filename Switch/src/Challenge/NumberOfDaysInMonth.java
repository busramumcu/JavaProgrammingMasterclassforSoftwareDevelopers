package Challenge;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (1 <= year && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {

                    return true;
                }
                return false;

            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month > 1 || month < 12) {
            if (year > 1 && year < 9999) {
                switch (month) {
                    case 0:
                    case 2:
                    case 4:
                    case 6:
                    case 7:
                    case 11:
                        return 31;
                    case 3:
                    case 5:
                    case 8:
                    case 10:
                        return 30;
                    case 1:
                        if (isLeapYear(year) == true) {
                            return 29;
                        } else {
                            return 28;
                        }
                    case 9:
                        if (isLeapYear(year) == true) {
                            return 31;
                        } else {
                            return 30;
                        }
                }

            }
        }
        return -1;
    }

}

