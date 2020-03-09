public class TeenNumberChecker {

    public static boolean hasTeen (int firstNum, int secondNum, int thirdNum) {

        if (isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum) ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int firstParameter) {
        return 13 <= firstParameter && firstParameter <=19;
    }
}