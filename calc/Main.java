package calc;

class Main {
    public static void main(String[] args) {
        try {
            Calculator calc = Calculator.instance.get();

            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println("You should not divide a number by zero");
        }
    }
}