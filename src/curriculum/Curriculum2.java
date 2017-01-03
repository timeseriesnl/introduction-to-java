package curriculum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import lesson.Lesson2;
import lesson.Lesson2.Calculator;

/**
 * This lesson covers basic classes.
 */
public class Curriculum2 extends Curriculum<Lesson2> {

	private final Random random = new Random();

	@Override
	protected void doAssignments() {
		Lesson2 lesson = new Lesson2();
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
	}

	private void verifyAssignment1(Lesson2 lesson) {
		Method method = findMethod("add", double.class, double.class).orElseThrow(() ->
				new AssertionError("No method \"add(double a, double b)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(double.class)) {
			throw new AssertionError(
					"Method \"add(double a, double b)\" should return a double,"
							+ " but returns " + returnType + ".");
		}

		assertPublicStatic(method);

		try {
			double a = randomDouble(100);
			double b = randomDouble(100);
			double result = (double) method.invoke(null, a, b);

			if (result != a + b) {
				throw new AssertionError("Expecting " + (a + b)
						+ " when a is " + a + " and b is " + b + ", got " + result + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment2(Lesson2 lesson) {
		Method method = findMethod("subtract", double.class, double.class).orElseThrow(() ->
				new AssertionError("No method \"subtract(double a, double b)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(double.class)) {
			throw new AssertionError(
					"Method \"subtract(double a, double b)\" should return a double,"
							+ " but returns " + returnType + ".");
		}

		assertPublicStatic(method);

		try {
			double i = randomDouble(100);
			double j = randomDouble(100);

			double a = Math.max(i, j);
			double b = Math.min(i, j);
			double result = (double) method.invoke(null, a, b);

			if (result != a - b) {
				throw new AssertionError("Expecting " + (a - b)
						+ " when a is " + a + " and b is " + b + ", got " + result + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment3(Lesson2 lesson) {
		Method method = findMethod("multiply", double.class, double.class).orElseThrow(() ->
				new AssertionError("No method \"multiply(double a, double b)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(double.class)) {
			throw new AssertionError(
					"Method \"multiply(double a, double b)\" should return a double,"
							+ " but returns " + returnType + ".");
		}

		assertPublicStatic(method);

		try {
			double a = randomDouble(100);
			double b = randomDouble(100);
			double result = (double) method.invoke(null, a, b);

			if (result != a * b) {
				throw new AssertionError("Expecting " + (a * b)
						+ " when a is " + a + " and b is " + b + ", got " + result + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment4(Lesson2 lesson) {
		Method method = findMethod("divide", double.class, double.class).orElseThrow(() ->
				new AssertionError("No method \"divide(double a, double b)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(double.class)) {
			throw new AssertionError(
					"Method \"divide(double a, double b)\" should return a double,"
							+ " but returns " + returnType + ".");
		}

		assertPublicStatic(method);

		try {
			double a = randomDouble(100);
			double b = randomDouble(5);
			double result = (double) method.invoke(null, a, b);

			if (result != a / b) {
				throw new AssertionError("Expecting " + (a / b)
						+ " when a is " + a + " and b is " + b + ", got " + result + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment5(Lesson2 lesson) {
		double a = randomDouble(100);
		double b = randomDouble(100);
		double result = lesson.assignment5(a, b);

		if (result != a + b) {
			throw new AssertionError("Expecting " + (a + b)
					+ " when a is " + a + " and b is " + b + ", got " + result + ".");
		}
	}

	private void verifyAssignment6(Lesson2 lesson) {
		double i = randomDouble(100);
		double j = randomDouble(100);

		double a = Math.max(i, j);
		double b = Math.min(i, j);
		double result = lesson.assignment6(a, b);

		if (result != a - b) {
			throw new AssertionError("Expecting " + (a - b)
					+ " when a is " + a + " and b is " + b + ", got " + result + ".");
		}
	}

	private void verifyAssignment7(Lesson2 lesson) {
		double a = randomDouble(100);
		double b = randomDouble(100);
		double result = lesson.assignment7(a, b);

		if (result != a * b) {
			throw new AssertionError("Expecting " + (a * b)
					+ " when a is " + a + " and b is " + b + ", got " + result + ".");
		}
	}

	private void verifyAssignment8(Lesson2 lesson) {
		double a = randomDouble(100);
		double b = randomDouble(5);
		double result = lesson.assignment8(a, b);

		if (result != a / b) {
			throw new AssertionError("Expecting " + (a / b)
					+ " when a is " + a + " and b is " + b + ", got " + result + ".");
		}
	}

	private void verifyAssignment9(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment10(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment11(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment12(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment13(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment14(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment15(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment16(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment17(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment18(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment19(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment20(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment21(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void verifyAssignment22(Lesson2 lesson) {
		throw new UnsupportedOperationException("Assignment not marked yet.");
	}

	private void assertPublicStatic(Method method) {
		int modifiers = method.getModifiers();
		if (!Modifier.isPublic(modifiers)) {
			throw new AssertionError(
					"Method \"add(double a, double b)\" should be public.");
		} else if (!Modifier.isStatic(modifiers)) {
			throw new AssertionError(
					"Method \"add(double a, double b)\" should be static.");
		}
	}

	private Optional<Method> findMethod(String name, Class<?>... parametersArray) {
		List<Class<?>> parameters = Arrays.asList(parametersArray);
		return Arrays.stream(Calculator.class.getMethods())
				.filter(method -> method.getName().equals(name))
				.filter(method ->
						parameters.equals(Arrays.asList(method.getParameterTypes())))
				.findFirst();
	}

	private double randomDouble(int max) {
		return 1 + random.nextInt(max * 1000) / 1000.0;
	}
}
