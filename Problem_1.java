class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public String calculate() {
        switch (operation) {
            case "add":
                return "Result: " + (a + b);
            case "subtract":
                return "Result: " + (a - b);
            case "multiply":
                return "Result: " + (a * b);
            case "divide":
                    return "Result: " + (a / b);
            default:
                return "Invalid operation";
        }
    }

}

public class Problem_1 {

    public static void main(String[] s) {
        Calculator op1 = new Calculator(10, 0, "divide");
        System.out.println(op1.calculate());
    }
}
