package Programme_1_calculator;

/**
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective
 * for other symbol.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 *  */
public class Calculator {
    // method to calculate addition
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is :" + (a + b));
    }

    //
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + "is :" + (a - b));
    }

    // method to calculate Division
    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is :" + (a / b));
    }

    // method to calculate Multiplication
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is :" + (a * b));
    }

    // Method to calculate a result
    public void CalculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else
            System.out.println("Invalid input !!!"); // Warning msg for an invalid entry

    }
}







