package curriculum;

import java.util.function.Consumer;

public abstract class Curriculum<T> {
    private int totalAssignments;
    private int passedAssignments;

    public void markAssignment(){
        doAssignments();

        System.out.printf("Passed %d of %d assignments.%n", passedAssignments, totalAssignments);
    }

    protected abstract void doAssignments();

    protected int getTotalAssignments() {
        return totalAssignments;
    }

    protected int getPassedAssignments() {
        return passedAssignments;
    }

    protected void test(final String name, Consumer<T> consumer, T item) {
        totalAssignments++;
        try {
            consumer.accept(item);
            System.out.println(name + ": PASS");
            passedAssignments++;
        } catch (AssertionError e) {
            System.out.println(name + ": FAIL");
            System.out.println("  " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(name + ": ERROR");
            e.printStackTrace(System.out);
        }
    }
}
