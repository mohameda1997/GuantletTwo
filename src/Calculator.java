// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;

    public Calculator() {

    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(String operation) {
        if (operation.equals("+") || operation.equals("-")) {
            this.operation = operation;
        } else {
            System.out.println(" Only + and - are supported.");
        }
    }

    public void performOperation() {
        if (operation == null) {
            System.out.println("set the operation (+ or -) before starting.");
            return;
        }

        double result = 0.0;

        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        }

        // Print the result
        System.out.println("Result: " + result);
    }

    public double getResults() {
        if (operation == null) {
            System.out.println("No operation.");
            return 0.0;
        }

        if (operation.equals("+")) {
            return operandOne + operandTwo;
        } else if (operation.equals("-")) {
            return operandOne - operandTwo;
        }

        return 0.0;
    }
}
