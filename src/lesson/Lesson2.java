package lesson;

import curriculum.Curriculum2;

/**
 * This is a multi-part lesson. Each part starts with some assignments that need to be completed in the inner class
 * called "Calculator" at the bottom. When completing a part inside Calculator, go back to the top and complete the
 * assignment methods like you did in Lesson 1. You can see how well you did by running the main method.
 *
 * <strong>Make sure you do not change the method signatures in this class.</strong>
 */
public class Lesson2 {

    /**
     * Running this will test your answers.
     */
    public static void main(String[] args) {
        new Curriculum2().markAssignment();
    }

    /**
     * Complete Part 1 inside of the Calculator class below before completing these.
     *
     * Return a plus b by using the Calculator.add(a, b) method you created as part of assignment 1 in the Calculator
     * class.
     */
    public double assignment5(double a, double b) {
        return Calculator.add(a, b);
    }

    /**
     * Return a minus b by using the Calculator.subtract(a, b) method you created as part of assignment 2 in the
     * Calculator class.
     */
    public double assignment6(double a, double b) {
        return Calculator.subtract(a, b);
    }

    /**
     * Return a plus b by using the Calculator.multiply(a, b) method you created as part of assignment 3 in the
     * Calculator class.
     */
    public double assignment7(double a, double b) {
        return Calculator.multiply(a, b);
    }

    /**
     * Return a plus b by using the Calculator.divide(a, b) method you created as part of assignment 4 in the
     * Calculator class.
     */
    public double assignment8(double a, double b) {
        return Calculator.divide(a, b);
    }

    /**
     * Complete Part 2 inside of the Calculator class below before completing these.
     *
     * Create a new Calculator instance variable. Use the Calculator.number(...) method to set "result" field in the
     * calculator to 42. Return that value from Calculator.result().
     */
    public double assignment17() {
        return 0.0;
    }

    /**
     * Create a new Calculator instance variable and return the result of the following sum:
     *
     * a + b + c
     */
    public double assignment18(double a, double b, double c) {
        return 0.0;
    }

    /**
     * Create a new Calculator instance variable and return the result of the following sum:
     *
     * a * b / c
     */
    public double assignment19(double a, double b, double c) {
        return 0.0;
    }

    /**
     * Complete Part 3 inside of the Calculator class below before completing these.
     *
     * Create a new Calculator instance variable and return the result of the given command.
     *
     * Bonus!
     * When all the assignments pass, the program will continue running. Click on the output window and type our own
     * commands. When you hit enter your Calculator.command() will be called with your input. Play arround with it as
     * much as you like!
     */
    public double assignment22(String command) {
        return 0.0;
    }

    /**
     * This class will function like a real world calculator when all assignments have been completed. For now the
     * calculator works only on double type numbers.
     *
     * Complete all the following assignments:
     *
     * Part 1 - Add static behaviour
     * In the first part we set up some static methods that people can use to do calculations without needing an
     * instance of the Calculator. Later on you can use these methods yourself to avoid code duplication.
     *
     * Assignment 1:
     * Add the public static "add" method that takes a double "a" and double "b" and returns "a + b".
     *
     * Assignment 2:
     * Add the public static "subtract" method that takes a double "a" and double "b" and returns "a - b".
     *
     * Assignment 3:
     * Add the public static "multiply" method that takes a double "a" and double "b" and returns "a * b".
     *
     * Assignment 4:
     * Add the public static "divide" method that takes a double "a" and double "b" and returns "a / b".
     *
     * Go back up and complete assignment 5 to 8.
     *
     * Part 2 - Setting up calculator for in-memory calculations.
     * Real world calculators work by changing the state of the calculator with each press of a button. We are going to
     * simulate each press of a button on a basic calculator. This means that if we want to do 1 + 1, we need to press
     * one button for the 1 first; Press the "plus" button second and finally press plus button again. We will add a
     * result method to see what the current in-memory result is.
     *
     * Assignment 9:
     * Add the private field of type double named "result".
     *
     * Assignment 10:
     * Add the private field of type Function named "function".
     *
     * Assignment 11:
     * Add a public method with the name "result" that returns the current value of field "result".
     *
     * Assignment 12:
     * Add a public method with the name "plus". This method does not accept any arguments and has return type
     * Calculator. In the body of the method it will set the "function" field to ADD and then return this Calculator
     * instance.
     *
     * Assignment 13:
     * Add a public method with the name "minus". This method does not accept any arguments and has return type
     * Calculator. In the body of the method it will set the "function" field to SUBTRACT and then return this
     * Calculator instance.
     *
     * Assignment 14:
     * Add a public method with the name "times". This method does not accept any arguments and has return type
     * Calculator. In the body of the method it will set the "function" field to MULTIPLY and then return this
     * Calculator instance.
     *
     * Assignment 15:
     * Add a public method with the name "dividedBy". This method does not accept any arguments and has return type
     * Calculator. In the body of the method it will set the "function" field to DIVIDE and then return this Calculator
     * instance.
     *
     * Assignment 16:
     * Add a public method with the name "number". This method accepts one double argument called "number" and has
     * return type Calculator. In the body of the method it will do different things depending on what is in the
     * "function" field:
     * - If "function" is ADD, it will change "result" by adding the value of argument "number" to it;
     * - If "function" is SUBTRACT, it will change "result" by subtracting the value of argument "number" from it;
     * - If "function" is MULTIPLY, it will change "result" by multiplying it by the the value of argument "number";
     * - If "function" is DIVIDE, it will change "result" by dividing it by the value of argument "number";
     * - If function is null, it will set "result" to the given "number" argument.
     * In all cases it will set the field "function" to null afterwards and return this Calculator instance.
     *
     * Go back up and complete assignment 17 to 19
     *
     * Part 3 - Using the calculator with Strings
     * It would be nice if we could use our new Calculator from the command line. From the command line however a user
     * can only give the application String values. So next we are going to transform use String input to data our class
     * can understand.
     *
     * Assignment 20:
     * Add a new private method with the name "accept". This method accepts one String argument called "token" and does
     * not return anything. In the body of the method it will do the following things depending on the value of the
     * "token" variable:
     * - If the token variable is equal to "+", it will call the calculator's plus method;
     * - If the token variable is equal to "-", it will call the calculator's minus method;
     * - If the token variable is equal to "*", it will call the calculator's times method;
     * - If the token variable is equal to "/", it will call the calculator's divideBy method;
     * In all other cases you must do the following:
     * - Create a new double variable with the name "number";
     * - Set the value of "number" by using "Double.parseDouble(token)". The Double.parseDouble is a static method is
     * part of Java by default and can be used to convert a String to a double;
     * - Call the Calculator.number method with the new "number" variable.
     *
     * Assignment 21:
     * Add a new public method with the name "execute". This method accepts one String argument called "command" and
     * returns this Calculator instance. In the method body we are going to do the following:
     * - Create a new String array variable named "tokens";
     * - Set the value of "tokens" by calling command.split(" "). This will split the single String up into multiple
     * parts every time a space is found. So "1 + 1" would be split up into three parts: "1" "+" "1";
     * - Use an enhanced for loop to loop over all tokens;
     * - Call Calculator.accept(token) for each token;
     * - Return this Calculator instance.
     *
     * Go back up and complete assignment 22.
     */
    public static class Calculator {

        public static double add(double a, double b){
            return a + b;
        }

        public static double subtract(double a, double b){
            return a - b;
        }

        public static double multiply(double a, double b){
            return a * b;
        }

        public static double divide(double a, double b){
            return a / b;
        }

        /**
         * Functions supported by this calculator.
         */
        public enum Function {
            ADD, SUBTRACT, MULTIPLY, DIVIDE
        }
    }
}
