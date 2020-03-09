public class Main {
    public static void main(String[] args) {


        boolean decimal = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, 3.175);
        if (decimal == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
