public class EqualSumChecker {

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber + secondNumber == thirdNumber) || (firstNumber + thirdNumber == secondNumber) || (secondNumber + thirdNumber == firstNumber)) {
            return true;
        } else {
            return false;
        }
    }

}