package lesson;

import curriculum.Curriculum1;
import curriculum.Curriculum1.Crossing;
import curriculum.Curriculum1.IntReceiver;
import curriculum.Curriculum1.PrimitiveTypeReceiver;
import curriculum.Curriculum1.Soup;

/**
 * Contains assignments to cover the basic Java syntax. Change the body of the assignment methods until they all PASS.
 * You can see how well you did by running the main method.
 *
 * <strong>Make sure you do not change the method signatures in this class.</strong>
 */
public class Lesson1 {

    /**
     * Running this will test your answers.
     */
    public static void main(String[] args) {
        new Curriculum1().markAssignment();
    }

    /**
     * Use the given receiver to name all primitive types, like so:
     *
     * receiver.namePrimitiveType("name", 42);
     */
    public void assignment1(PrimitiveTypeReceiver receiver) {
        // Put your code here
    }

    /**
     * Return a new Object instance.
     */
    public Object assignment2() {
        return null; // Replace null with an actual instance.
    }

    /**
     * Return a new non-empty String instance.
     */
    public String assignment3() {
        return null;
    }

    /**
     * The commented out code is supposed to add the String "strawberry", but it contains a compile error caused by a
     * scoping issue. Uncomment the code and fix it by using the indicated line.
     */
    public void assignment4(StringBuilder builder) {
//        {
//            String fruit;         // Move this line only
//            fruit = "strawberry";
//        }
//        builder.append(fruit);
    }

    /**
     * Return true if the given numbers are equal
     */
    public boolean assignment5(int a, int b) {
        return false;
    }

    /**
     * Return true if the given numbers are not equal
     */
    public boolean assignment6(int a, int b) {
        return false;
    }

    /**
     * Return true if a is higher than, or equal to b.
     */
    public boolean assignment7(int a, int b) {
        return false;
    }

    /**
     * Return true if a is lower than b.
     */
    public boolean assignment8(int a, int b) {
        return false;
    }

    /**
     * Return true if either a or b is true.
     */
    public boolean assignment9(boolean a, boolean b) {
        return false;
    }

    /**
     * Return true if both a and b are true.
     */
    public boolean assignment10(boolean a, boolean b) {
        return false;
    }

    /**
     * Return the opposite boolean value
     */
    public boolean assignment11(boolean a) {
        return false;
    }

    /**
     * Increment the given number by one.
     */
    public int assignment12(int a) {
        return 0;
    }

    /**
     * Return a plus b.
     */
    public int assignment13(int a, int b) {
        return 0;
    }

    /**
     * Return a minus b.
     */
    public int assignment14(int a, int b) {
        return 0;
    }

    /**
     * Return a multiplied by b.
     */
    public int assignment15(int a, int b) {
        return 0;
    }

    /**
     * Return a divided by b.
     */
    public float assignment16(float a, int b) {
        return 0;
    }

    /**
     * Return the remainder of dividing a by b.
     */
    public float assignment17(float a, int b) {
        return 0;
    }

    /**
     * Return a and be added together with a space between them.
     */
    public String assignment18(String a, String b) {
        return null;
    }

    /**
     * Use an if/else block to do the following:
     *
     * Return "red" when a is 1;
     * Return "green" when a is 2;
     * Return "blue" when a is 3;
     * Return null otherwise.
     */
    public String assignment19(int a) {
        return null;
    }

    /**
     * Use á switch/case block to do the following:
     *
     * Return "red" when a is 1;
     * Return "green" when a is 2;
     * Return "blue" when a is 3;
     * Return null otherwise.
     */
    public String assignment20(int a) {
        return null;
    }

    /**
     * Use a for loop to add integer 0 (inclusive) to 10 (exclusive) to the receiver.
     */
    public void assignment21(IntReceiver receiver) {

    }

    /**
     * Cross the road while the lights are green.
     *
     * Use a while loop to call crossing.cross() while crossing.isLightGreen() returns true.
     */
    public void assignment22(Crossing crossing) {

    }

    /**
     * Add salt until the soup is tasty.
     *
     * Use a do/while loop to call soup.addSalt() until soup.isTasty() returns true.
     */
    public void assignment23(Soup soup) {

    }

    /**
     * Create a new array that can contain 10 Strings.
     */
    public String[] assignment24() {
        return null;
    }

    /**
     * Create a new array of integers from 0 (inclusive) to 5 (exclusive).
     */
    public int[] assignment25() {
        return null;
    }

    /**
     * Use an enhanced for loop to add all numbers to the receiver.
     */
    public void assignment26(IntReceiver receiver, int[] numbers) {

    }
}
