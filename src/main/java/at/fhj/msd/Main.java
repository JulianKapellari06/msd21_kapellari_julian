package at.fhj.msd;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double a = 10, b = 2.3;

        System.out.println(calculator.add(a, b));
        System.out.println(calculator.minus(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));
        //System.out.println(calculator.faculty(3));

    }

}
