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
            System.out.printf("\u001B[1m%s: \u001B[32mPASS\u001B[0m%n", name);
            passedAssignments++;
        } catch (AssertionError e) {
            System.out.printf("\u001B[1m%s: \u001B[33mFAIL\u001B[0m%n" +
                    "  %s%n", name, e.getMessage());
        } catch (RuntimeException e) {
            System.out.printf("\u001B[1m%s: \u001B[31mERROR\u001B[0m%n", name);

            System.out.print("\u001B[31m");
            e.printStackTrace(System.out);
            System.out.print("\u001B[0m");
        }
    }
}
