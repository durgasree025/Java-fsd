public class typeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting
        int num1 = 10;
        double num2 = num1;

        System.out.println("Implicit Type Casting:");
        System.out.println("num1 (int): " + num1);
        System.out.println("num2 (double): " + num2);

        // Explicit Type Casting
        double num3 = 15.75;
        int num4 = (int) num3;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("num3 (double): " + num3);
        System.out.println("num4 (int): " + num4);
    }
}
