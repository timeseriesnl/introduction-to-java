package curriculum;

import lesson.Lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * This lesson covers instantiating all primitive types, the basic {@link Object} type and the {@link String} type.
 */
public class Curriculum1 extends Curriculum<Lesson1> {

    private static final String[] WORDS = new String[]{"coffee", "butter", "chair", "table", "coat", "trousers", "car", "train", "space", "grass"};

    private final Random random = new Random();

    @Override
    protected void doAssignments() {
        Lesson1 lesson = new Lesson1();
        test("Assignment  1", this::verifyAssignment1, lesson);
        test("Assignment  2", this::verifyAssignment2, lesson);
        test("Assignment  3", this::verifyAssignment3, lesson);
        test("Assignment  4", this::verifyAssignment4, lesson);
        test("Assignment  5", this::verifyAssignment5, lesson);
        test("Assignment  6", this::verifyAssignment6, lesson);
        test("Assignment  7", this::verifyAssignment7, lesson);
        test("Assignment  8", this::verifyAssignment8, lesson);
        test("Assignment  9", this::verifyAssignment9, lesson);
        test("Assignment 10", this::verifyAssignment10, lesson);
        test("Assignment 11", this::verifyAssignment11, lesson);
        test("Assignment 12", this::verifyAssignment12, lesson);
        test("Assignment 13", this::verifyAssignment13, lesson);
        test("Assignment 14", this::verifyAssignment14, lesson);
        test("Assignment 15", this::verifyAssignment15, lesson);
        test("Assignment 16", this::verifyAssignment16, lesson);
        test("Assignment 17", this::verifyAssignment17, lesson);
        test("Assignment 18", this::verifyAssignment18, lesson);
        test("Assignment 19", this::verifyAssignment19, lesson);
        test("Assignment 20", this::verifyAssignment20, lesson);
        test("Assignment 21", this::verifyAssignment21, lesson);
        test("Assignment 22", this::verifyAssignment22, lesson);
        test("Assignment 23", this::verifyAssignment23, lesson);
        test("Assignment 24", this::verifyAssignment24, lesson);
        test("Assignment 25", this::verifyAssignment25, lesson);
        test("Assignment 26", this::verifyAssignment26, lesson);
    }

    private void verifyAssignment1(Lesson1 lesson) {
        PrimitiveTypeReceiver receiver = new PrimitiveTypeReceiver();
        lesson.assignment1(receiver);

        long total = receiver.primitiveTypesNeeded();
        long found = receiver.primitiveTypesFound();
        long missing = total - found;
        if (found == 0) {
            throw new AssertionError("No primitive types named." +
                    " Use receiver.namePrimitiveType(name, example) to name each primitive type.");
        } else if (found != total) {
            throw new AssertionError("Almost there. Found " + found + " of total " + total + "." +
                    " Only " + missing + " more to go!.");
        }
    }

    private void verifyAssignment2(Lesson1 lesson) {
        Object candidate = lesson.assignment2();
        if (candidate == null) {
            throw new AssertionError("Returned instance is null. Expecting an actual instance.");
        } else if (!candidate.getClass().equals(Object.class)) {
            throw new AssertionError("Returned instance extends the Object class." +
                    " You should return an actual Object instance.");
        }
    }

    private void verifyAssignment3(Lesson1 lesson) {
        String candidate = lesson.assignment3();
        if (candidate == null) {
            throw new AssertionError("Returned String is null. Expecting an actual String instance.");
        } else if (candidate.isEmpty()) {
            throw new AssertionError("Returned String is empty. Add some text; Any text you like.");
        }
    }

    private void verifyAssignment4(Lesson1 lesson) {
        StringBuilder builder = new StringBuilder();
        lesson.assignment4(builder);
        if (!builder.toString().equals("strawberry")) {
            throw new AssertionError("Expecting the word \"strawberry\" in the builder.");
        }
    }

    private void verifyAssignment5(Lesson1 lesson) {
        int lower = randomInt();
        int higher = lower + randomInt();

        if (!lesson.assignment5(lower, lower)) {
            throw new AssertionError("Expecting true when both a and b are " + lower + ".");
        } else if (lesson.assignment5(lower, higher)) {
            throw new AssertionError("Expecting false when a (" + lower + ") does not equal b (" + higher + ").");
        }
    }

    private void verifyAssignment6(Lesson1 lesson) {
        int lower = randomInt();
        int higher = lower + randomInt();

        if (lesson.assignment6(lower, lower)) {
            throw new AssertionError("Expecting false when both a and b are " + lower + ".");
        } else if (!lesson.assignment6(lower, higher)) {
            throw new AssertionError("Expecting true when a (" + lower + ") does not equal b (" + higher + ").");
        }
    }

    private void verifyAssignment7(Lesson1 lesson) {
        int lower = randomInt();
        int higher = lower + randomInt();

        if (!lesson.assignment7(lower, lower)) {
            throw new AssertionError("Expecting true when a is equal to b (" + lower + ").");
        } else if (!lesson.assignment7(higher, lower)) {
            throw new AssertionError("Expecting true when a (" + higher + ") is higher than b (" + lower + ").");
        } else if (lesson.assignment7(lower, higher)) {
            throw new AssertionError("Expecting false when a (" + lower + ") is lower than b (" + higher + ").");
        }
    }

    private void verifyAssignment8(Lesson1 lesson) {
        int lower = randomInt();
        int higher = lower + randomInt();

        if (lesson.assignment8(lower, lower)) {
            throw new AssertionError("Expecting false when a is equal to b (" + lower + ").");
        } else if (lesson.assignment8(higher, lower)) {
            throw new AssertionError("Expecting false when a (" + higher + ") is higher than b (" + lower + ").");
        } else if (!lesson.assignment8(lower, higher)) {
            throw new AssertionError("Expecting true when a (" + lower + ") is lower than b (" + higher + ").");
        }
    }

    private void verifyAssignment9(Lesson1 lesson) {
        if (!lesson.assignment9(true, true)) {
            throw new AssertionError("Expecting true when both a and b are true.");
        } else if (lesson.assignment9(false, false)) {
            throw new AssertionError("Expecting false when both a and b are false.");
        } else if (!lesson.assignment9(true, false)) {
            throw new AssertionError("Expecting true when a is true.");
        } else if (!lesson.assignment9(false, true)) {
            throw new AssertionError("Expecting true when b is true.");
        }
    }

    private void verifyAssignment10(Lesson1 lesson) {
        if (!lesson.assignment10(true, true)) {
            throw new AssertionError("Expecting true when both a and b are true.");
        } else if (lesson.assignment10(false, false)) {
            throw new AssertionError("Expecting false when both a and b are false.");
        } else if (lesson.assignment10(true, false)) {
            throw new AssertionError("Expecting false when b is false.");
        } else if (lesson.assignment10(false, true)) {
            throw new AssertionError("Expecting false when a is false.");
        }
    }

    private void verifyAssignment11(Lesson1 lesson) {
        if (!lesson.assignment11(true)) {
            throw new AssertionError("Expecting false when true is given.");
        } else if (lesson.assignment11(false)) {
            throw new AssertionError("Expecting true when false is given.");
        }
    }

    private void verifyAssignment12(Lesson1 lesson) {
        int a = randomInt();
        if (lesson.assignment12(a) != a + 1) {
            throw new AssertionError("Expecting (" + (a + 1) + ") when " + a + " is given.");
        }
    }

    private void verifyAssignment13(Lesson1 lesson) {
        int a = randomInt();
        int b = randomInt();

        if (lesson.assignment13(a, b) != a + b) {
            throw new AssertionError("Expecting (" + (a + b) + ") when a is " + a + " and b is " + b + ".");
        }
    }

    private void verifyAssignment14(Lesson1 lesson) {
        int a = randomInt();
        int b = randomInt();

        if (lesson.assignment14(a, b) != a - b) {
            throw new AssertionError("Expecting (" + (a - b) + ") when a is " + a + " and b is " + b + ".");
        }
    }

    private void verifyAssignment15(Lesson1 lesson) {
        int a = randomInt();
        int b = randomInt();

        if (lesson.assignment15(a, b) != a * b) {
            throw new AssertionError("Expecting (" + (a * b) + ") when a is " + a + " and b is " + b + ".");
        }
    }

    private void verifyAssignment16(Lesson1 lesson) {
        float a = (random.nextInt(10) + 1) * 100;
        int b = random.nextInt(9) + 2;

        if (lesson.assignment16(a, b) != a / b) {
            throw new AssertionError("Expecting (" + (a / b) + ") when a is " + a + " and b is " + b + ".");
        }
    }

    private void verifyAssignment17(Lesson1 lesson) {
        int i = randomInt();
        int j = randomInt();

        float a = Math.max(i, j);
        int b = Math.min(i, j);

        if (lesson.assignment17(a, b) != a % b) {
            throw new AssertionError("Expecting (" + (a % b) + ") when a is " + a + " and b is " + b + ".");
        }
    }

    private void verifyAssignment18(Lesson1 lesson) {
        String a = WORDS[random.nextInt(WORDS.length)];
        String b = WORDS[random.nextInt(WORDS.length)];

        String actual = lesson.assignment18(a, b);
        if (actual == null) {
            throw new AssertionError("Expecting \"" + a + " " + b + "\" when a is \"" + a + "\" and b is \"" + b + "\", got null.");
        } else if (!actual.equals(a + " " + b)) {
            throw new AssertionError("Expecting \"" + a + " " + b + "\" when a is \"" + a + "\" and b is \"" + b + "\", got \"" + actual + "\".");
        }
    }

    private void verifyAssignment19(Lesson1 lesson) {
        int i = 3 + randomInt();

        if (!Objects.equals(lesson.assignment19(1), "red")) {
            throw new AssertionError("Expecting \"red\" when a is 1.");
        } else if (!Objects.equals(lesson.assignment19(2), "green")) {
            throw new AssertionError("Expecting \"green\" when a is 2.");
        } else if (!Objects.equals(lesson.assignment19(3), "blue")) {
            throw new AssertionError("Expecting \"blue\" when a is 3.");
        } else if (lesson.assignment19(i) != null) {
            throw new AssertionError("Expecting null when a is " + i + ".");
        }
    }

    private void verifyAssignment20(Lesson1 lesson) {
        int i = 3 + randomInt();

        if (!Objects.equals(lesson.assignment20(1), "red")) {
            throw new AssertionError("Expecting \"red\" when a is 1.");
        } else if (!Objects.equals(lesson.assignment20(2), "green")) {
            throw new AssertionError("Expecting \"green\" when a is 2.");
        } else if (!Objects.equals(lesson.assignment20(3), "blue")) {
            throw new AssertionError("Expecting \"blue\" when a is 3.");
        } else if (lesson.assignment20(i) != null) {
            throw new AssertionError("Expecting null when a is " + i + ".");
        }
    }

    private void verifyAssignment21(Lesson1 lesson) {
        IntReceiver receiver = new IntReceiver();
        lesson.assignment21(receiver);

        if (receiver.received.size() != 10) {
            throw new AssertionError("Expecting " + 10 + "numbers in the receiver, only received " + receiver.received.size() + " (" + receiver.received.stream().map(Object::toString).collect(Collectors.joining(", ")) + ").");
        }

        Iterator<Integer> iterator = receiver.received.iterator();
        int current;
        if ((current = iterator.next()) != 0) {
            throw new AssertionError("Expecting first integer to be 0, was " + current + ".");
        } else if ((current = iterator.next()) != 1) {
            throw new AssertionError("Expecting second integer to be 1, was " + current + ".");
        } else if ((current = iterator.next()) != 2) {
            throw new AssertionError("Expecting third integer to be 2, was " + current + ".");
        } else if ((current = iterator.next()) != 3) {
            throw new AssertionError("Expecting fourth integer to be 3, was " + current + ".");
        } else if ((current = iterator.next()) != 4) {
            throw new AssertionError("Expecting fifth integer to be 4, was " + current + ".");
        } else if ((current = iterator.next()) != 5) {
            throw new AssertionError("Expecting sixth integer to be 5, was " + current + ".");
        } else if ((current = iterator.next()) != 6) {
            throw new AssertionError("Expecting seventh integer to be 6, was " + current + ".");
        } else if ((current = iterator.next()) != 7) {
            throw new AssertionError("Expecting eighth integer to be 7, was " + current + ".");
        } else if ((current = iterator.next()) != 8) {
            throw new AssertionError("Expecting ninth integer to be 8, was " + current + ".");
        } else if ((current = iterator.next()) != 9) {
            throw new AssertionError("Expecting tenth integer to be 9, was " + current + ".");
        }
    }

    private void verifyAssignment22(Lesson1 lesson) {
        Crossing crossing = new Crossing(randomInt());

        lesson.assignment22(crossing);

        if (crossing.isLightGreen()) {
            throw new AssertionError("You can still cross. The light is still green.");
        }
    }

    private void verifyAssignment23(Lesson1 lesson) {
        Soup soup = new Soup(randomInt());

        lesson.assignment23(soup);

        if (!soup.isTasty()) {
            throw new AssertionError("The soup is not tasty yet. Add more salt.");
        }
    }

    private void verifyAssignment24(Lesson1 lesson) {
        String[] array = lesson.assignment24();

        if (array == null) {
            throw new AssertionError("Expecting an array with capacity for 10 Strings, got null.");
        } else if (array.length != 10) {
            throw new AssertionError("Expecting an array with capacity for 10 Strings, got array with capacity " + array.length + ".");
        }
    }

    private void verifyAssignment25(Lesson1 lesson) {
        int[] array = lesson.assignment25();

        if (array == null) {
            throw new AssertionError("Expecting an array with 5 integer, got null.");
        } else if (array.length != 5) {
            throw new AssertionError("Expecting an array with 5 integer, got only " + array.length + ".");
        }

        if (array[0] != 0) {
            throw new AssertionError("Expecting first integer to be 0, was " + array[0] + ".");
        } else if (array[1] != 1) {
            throw new AssertionError("Expecting second integer to be 1, was " + array[1] + ".");
        } else if (array[2] != 2) {
            throw new AssertionError("Expecting third integer to be 2, was " + array[2] + ".");
        } else if (array[3] != 3) {
            throw new AssertionError("Expecting fourth integer to be 3, was " + array[3] + ".");
        } else if (array[4] != 4) {
            throw new AssertionError("Expecting fifth integer to be 4, was " + array[4] + ".");
        }
    }

    private void verifyAssignment26(Lesson1 lesson) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = randomInt();
        }

        IntReceiver receiver = new IntReceiver();
        lesson.assignment26(receiver, array);

        if (receiver.received.size() != 10) {
            throw new AssertionError("Expecting " + 10 + "numbers in the receiver, only received " + receiver.received.size() + " (" + receiver.received.stream().map(Object::toString).collect(Collectors.joining(", ")) + ").");
        }

        Iterator<Integer> iterator = receiver.received.iterator();
        int current;
        if ((current = iterator.next()) != array[0]) {
            throw new AssertionError("Expecting first integer to be 0, was " + current + ".");
        } else if ((current = iterator.next()) != array[1]) {
            throw new AssertionError("Expecting second integer to be " + array[1] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[2]) {
            throw new AssertionError("Expecting third integer to be " + array[2] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[3]) {
            throw new AssertionError("Expecting fourth integer to be " + array[3] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[4]) {
            throw new AssertionError("Expecting fifth integer to be " + array[4] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[5]) {
            throw new AssertionError("Expecting sixth integer to be " + array[5] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[6]) {
            throw new AssertionError("Expecting seventh integer to be " + array[6] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[7]) {
            throw new AssertionError("Expecting eighth integer to be " + array[7] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[8]) {
            throw new AssertionError("Expecting ninth integer to be " + array[8] + ", was " + current + ".");
        } else if ((current = iterator.next()) != array[9]) {
            throw new AssertionError("Expecting tenth integer to be " + array[9] + ", was " + current + ".");
        }
    }

    private int randomInt() {
        return random.nextInt(100) + 1;
    }


    public static final class PrimitiveTypeReceiver {
        private static final Map<String, Predicate<Object>> VERIFIERS =
                ((Supplier<Map<String, Predicate<Object>>>) () -> {
                    HashMap<String, Predicate<Object>> map = new HashMap<>();
                    map.put("boolean", o -> o instanceof Boolean);
                    map.put("char", o -> o instanceof Character);
                    map.put("byte", o -> o instanceof Byte);
                    map.put("short", o -> o instanceof Short);
                    map.put("int", o -> o instanceof Integer);
                    map.put("long", o -> o instanceof Long);
                    map.put("float", o -> o instanceof Float);
                    map.put("double", o -> o instanceof Double);
                    return map;
                }).get();

        private final Map<String, Boolean> statusMap = ((Supplier<Map<String, Boolean>>) () -> {
            HashMap<String, Boolean> map = new HashMap<>();
            map.put("boolean", false);
            map.put("char", false);
            map.put("byte", false);
            map.put("short", false);
            map.put("int", false);
            map.put("long", false);
            map.put("float", false);
            map.put("double", false);
            return map;
        }).get();

        private PrimitiveTypeReceiver() {
            // Should only be created by this curriculum.
        }

        public void namePrimitiveType(String name, Object example) {
            if (!VERIFIERS.containsKey(name)) {
                throw new AssertionError("There is no primitive type named \"" + name + "\"." +
                        " Keep in mind that Java is case sensitive!");
            } else if (example == null) {
                throw new AssertionError("Example null given. Please give an actual example");
            } else if (!VERIFIERS.get(name).test(example)) {
                throw new AssertionError("The given example " + example + " is not a \"" + name + "\".");
            }
            statusMap.put(name, true);
        }

        private long primitiveTypesFound() {
            return statusMap.values().stream()
                    .filter(b -> b)
                    .count();
        }

        private long primitiveTypesNeeded() {
            return statusMap.size();
        }
    }

    public static final class IntReceiver {
        private final List<Integer> received = new ArrayList<>();

        public void receive(int integer) {
            received.add(integer);
        }
    }

    public static final class Crossing {
        private final int total;
        private int current = 0;

        private Crossing(int total) {
            this.total = total;
        }

        public boolean isLightGreen() {
            return current < total;
        }

        public void cross() {
            if (!isLightGreen()) {
                throw new AssertionError("You crossed the crossing while the light wasn't green!");
            }
            current++;
        }
    }

    public static final class Soup {
        private final int total;
        private int current = 0;

        public Soup(int total) {
            this.total = total;
        }

        public void addSalt() {
            if (isTasty()) {
                throw new AssertionError("Soup is already tasty!");
            }
            current++;
        }

        public boolean isTasty() {
            return current >= total;
        }
    }
}
