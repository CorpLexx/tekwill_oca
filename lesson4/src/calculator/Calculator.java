package calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Inceput calculare");
        int a = 5;
        int b = 11;
        int c = 4;
        int d = 3;
        int e = 7;
        int f = 3;
        int h = 4;

        int sumResult = sum(a, b);
        System.out.println("Sum of a + b = " + sumResult);

        int substrResult = subtr(sumResult, c);
        System.out.println("Subtraction of sumResult from c = " + substrResult);

        int multiplyResult = multiply(substrResult, d);
        System.out.println("Multiply substrResult and d =  " + multiplyResult);

        double divideResult = divide(multiplyResult, e);
        System.out.println("Divide multiplyResult and e = " + divideResult);

        double putere = putere(f, h);
        System.out.println(f + " ^ " + h + " = " + putere);

        System.out.println("Sfirsit calculare");
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int subtr(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b){
        return a * b;
    }

    private static double divide(int a, double b) {
        return a / b;
    }

    private static double putere(int a, int b){
        return Math.pow(a, b);
    }
}
