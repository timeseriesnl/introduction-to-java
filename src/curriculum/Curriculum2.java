package curriculum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
	public void markAssignment(){
		super.markAssignment();

		if(getTotalAssignments() == getPassedAssignments()){
			executeCalculator();
		}
	}

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

	private void executeCalculator() {
		System.out.printf("%n%nBonus!%nPlay with your own calculator. Enter new commands in the commandline below:%n");

		Method execute = findMethod("execute", String.class).orElseThrow(() ->
				new AssertionError("No method \"execute(String command)\" found."));
		Method result = findMethod("result").orElseThrow(() ->
				new AssertionError("No method \"result()\" found."));
		Calculator calculator = new Calculator();

		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			while(true){
				String line = reader.readLine();
				try{
					execute.invoke(calculator, line);
					System.out.println(result.invoke(calculator));
				}catch (Exception e){
					e.printStackTrace(System.out);
				}
			}
		} catch (IOException e) {
			throw new IllegalStateException("Enexpected error: ", e);
		}
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

		assertPublicStatic(method, "add(double a, double b)");

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

		assertPublicStatic(method, "subtract(double a, double b)");

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

		assertPublicStatic(method, "multiply(double a, double b)");

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

		assertPublicStatic(method, "divide(double a, double b)");

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
		Field field = findField("result").orElseThrow(() ->
				new AssertionError("No field \"result\" found."));

		Class<?> type = field.getType();
		if (!type.equals(double.class)) {
			throw new AssertionError(
					"Field \"result\" should be of type double, but returns " + type + ".");
		}

		assertPrivateMutable(field, "result");
	}

	private void verifyAssignment10(Lesson2 lesson) {
		Field field = findField("function").orElseThrow(() ->
				new AssertionError("No field \"function\" found."));

		Class<?> type = field.getType();
		if (!type.equals(Calculator.Function.class)) {
			throw new AssertionError(
					"Field \"function\" should be of type Function, but returns " + type + ".");
		}

		assertPrivateMutable(field, "result");
	}

	private void verifyAssignment11(Lesson2 lesson) {
		Method method = findMethod("result").orElseThrow(() ->
				new AssertionError("No method \"result()\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(double.class)) {
			throw new AssertionError(
					"Method \"result()\" should return a double, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "result()");

		try {
			Calculator calculator = new Calculator();

			Field field = findField("result").orElseThrow(() ->
					new AssertionError("No field \"result\" found."));

			field.setAccessible(true);
			double randomDouble = randomDouble(100);
			field.set(calculator, randomDouble);

			double result = (double) method.invoke(calculator);
			if (randomDouble != result) {
				throw new AssertionError("Method result() does not return the value from field \"result\".");
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment12(Lesson2 lesson) {
		Method method = findMethod("plus").orElseThrow(() ->
				new AssertionError("No method \"plus()\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(Calculator.class)) {
			throw new AssertionError(
					"Method \"plus()\" should return a Calculator, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "plus()");

		try {
			Calculator calculator = new Calculator();

			assertIdentityEqual(calculator, method.invoke(calculator), "plus()");

			Field field = findField("function").orElseThrow(() ->
					new IllegalStateException("No field \"function\" found."));

			field.setAccessible(true);
			Object fieldValue = field.get(calculator);
			if (!Objects.equals(fieldValue, Calculator.Function.ADD)) {
				throw new AssertionError("The plus() method should set the \"function\" field to ADD,"
						+ " but instead the field is " + fieldValue + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment13(Lesson2 lesson) {
		Method method = findMethod("minus").orElseThrow(() ->
				new AssertionError("No method \"minus()\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(Calculator.class)) {
			throw new AssertionError(
					"Method \"minus()\" should return a Calculator, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "minus()");

		try {
			Calculator calculator = new Calculator();

			assertIdentityEqual(calculator, method.invoke(calculator), "minus()");

			Field field = findField("function").orElseThrow(() ->
					new IllegalStateException("No field \"function\" found."));

			field.setAccessible(true);
			Object fieldValue = field.get(calculator);
			if (!Objects.equals(fieldValue, Calculator.Function.SUBTRACT)) {
				throw new AssertionError("The minus() method should set the \"function\" field to SUBTRACT,"
						+ " but instead the field is " + fieldValue + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment14(Lesson2 lesson) {
		Method method = findMethod("times").orElseThrow(() ->
				new AssertionError("No method \"times()\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(Calculator.class)) {
			throw new AssertionError(
					"Method \"times()\" should return a Calculator, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "times()");

		try {
			Calculator calculator = new Calculator();

			assertIdentityEqual(calculator, method.invoke(calculator), "times()");

			Field field = findField("function").orElseThrow(() ->
					new IllegalStateException("No field \"function\" found."));

			field.setAccessible(true);
			Object fieldValue = field.get(calculator);
			if (!Objects.equals(fieldValue, Calculator.Function.MULTIPLY)) {
				throw new AssertionError("The times() method should set the \"function\" field to MULTIPLY,"
						+ " but instead the field is " + fieldValue + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment15(Lesson2 lesson) {
		Method method = findMethod("dividedBy").orElseThrow(() ->
				new AssertionError("No method \"dividedBy()\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(Calculator.class)) {
			throw new AssertionError(
					"Method \"dividedBy()\" should return a Calculator, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "dividedBy()");

		try {
			Calculator calculator = new Calculator();

			assertIdentityEqual(calculator, method.invoke(calculator), "dividedBy()");

			Field field = findField("function").orElseThrow(() ->
					new IllegalStateException("No field \"function\" found."));

			field.setAccessible(true);
			Object fieldValue = field.get(calculator);
			if (!Objects.equals(fieldValue, Calculator.Function.DIVIDE)) {
				throw new AssertionError("The dividedBy() method should set the \"function\" field to DIVIDE,"
						+ " but instead the field is " + fieldValue + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment16(Lesson2 lesson) {
		Method method = findMethod("number", double.class).orElseThrow(() ->
				new AssertionError("No method \"number(double number)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(Calculator.class)) {
			throw new AssertionError(
					"Method \"number(double number)\" should return a Calculator, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "number(double number)");

		Field functionField = findField("function").orElseThrow(() ->
				new IllegalStateException("No field \"function\" found."));
		functionField.setAccessible(true);

		Field resultField = findField("result").orElseThrow(() ->
				new AssertionError("No field \"result\" found."));
		resultField.setAccessible(true);

		double initialValue = randomDouble(100);

		try {
			Calculator calculator = new Calculator();

			// ADD
			resultField.set(calculator, initialValue);
			functionField.set(calculator, Calculator.Function.ADD);

			assertIdentityEqual(calculator, method.invoke(calculator, 100.0), "number(double number)");

			if ((double) resultField.get(calculator) != initialValue + 100.0) {
				throw new AssertionError("The \"number(double number)\" method should add the given number to the result field"
						+ " when function is ADD.");
			} else if (functionField.get(calculator) != null) {
				throw new AssertionError("The \"number(double number)\" method should always set the function field to null.");
			}

			// SUBTRACT
			resultField.set(calculator, initialValue);
			functionField.set(calculator, Calculator.Function.SUBTRACT);

			assertIdentityEqual(calculator, method.invoke(calculator, 100.0), "number(double number)");

			if ((double) resultField.get(calculator) != initialValue - 100.0) {
				throw new AssertionError("The \"number(double number)\" method should subtract the given number from the result field"
						+ " when function is SUBTRACT.");
			} else if (functionField.get(calculator) != null) {
				throw new AssertionError("The \"number(double number)\" method should always set the function field to null.");
			}

			// MULTIPLY
			double multiplier = randomDouble(5);
			resultField.set(calculator, initialValue);
			functionField.set(calculator, Calculator.Function.MULTIPLY);

			assertIdentityEqual(calculator, method.invoke(calculator, multiplier), "number(double number)");

			if ((double) resultField.get(calculator) != initialValue * multiplier) {
				throw new AssertionError("The \"number(double number)\" method should multiply the result field by the given number"
						+ " when function is MULTIPLY.");
			} else if (functionField.get(calculator) != null) {
				throw new AssertionError("The \"number(double number)\" method should always set the function field to null.");
			}

			// DIVIDE
			double divider = randomDouble(5);
			resultField.set(calculator, initialValue);
			functionField.set(calculator, Calculator.Function.DIVIDE);

			assertIdentityEqual(calculator, method.invoke(calculator, divider), "number(double number)");

			if ((double) resultField.get(calculator) != initialValue / divider) {
				throw new AssertionError("The \"number(double number)\" method should divide the result field by the given number"
						+ " when function is DIVIDE.");
			} else if (functionField.get(calculator) != null) {
				throw new AssertionError("The \"number(double number)\" method should always set the function field to null.");
			}

			// null
			double setter = randomDouble(100);
			resultField.set(calculator, initialValue);
			functionField.set(calculator, null);

			assertIdentityEqual(calculator, method.invoke(calculator, setter), "number(double number)");

			if ((double) resultField.get(calculator) != setter) {
				throw new AssertionError("The \"number(double number)\" method should set the result field to the given number"
						+ " when function is null.");
			} else if (functionField.get(calculator) != null) {
				throw new AssertionError("The \"number(double number)\" method should always set the function field to null.");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment17(Lesson2 lesson) {
		double result = lesson.assignment17();

		if (result != 42.0) {
			throw new AssertionError("Expecting 42, got " + result + ".");
		}
	}

	private void verifyAssignment18(Lesson2 lesson) {
		double a = randomDouble(100);
		double b = randomDouble(100);
		double c = randomDouble(100);
		double result = lesson.assignment18(a, b, c);

		if (result != a + b + c) {
			throw new AssertionError("Expecting " + (a + b + c)
					+ " when a is " + a + " and b is " + b + "and c is " + c + ","
					+ " got " + result + ".");
		}
	}

	private void verifyAssignment19(Lesson2 lesson) {
		double a = randomDouble(100);
		double b = randomDouble(5);
		double c = randomDouble(5);
		double result = lesson.assignment19(a, b, c);

		if (result != (a * b) / c) {
			throw new AssertionError("Expecting " + (a + b + c)
					+ " when a is " + a + " and b is " + b + "and c is " + c + ","
					+ " got " + result + ".");
		}
	}

	private void verifyAssignment20(Lesson2 lesson) {
		Method method = findMethod("accept", String.class).orElseThrow(() ->
				new AssertionError("No method \"acceot(String token)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(void.class)) {
			throw new AssertionError(
					"Method \"accept(String token)\" should not return anything, but returns " + returnType + ".");
		}

		assertPrivateNonStatic(method, "accept(String token)");
		method.setAccessible(true);

		Field functionField = findField("function").orElseThrow(() ->
				new IllegalStateException("No field \"function\" found."));
		functionField.setAccessible(true);

		Field resultField = findField("result").orElseThrow(() ->
				new AssertionError("No field \"result\" found."));
		resultField.setAccessible(true);

		try {
			Calculator calculator = new Calculator();

			// +
			method.invoke(calculator, "+");
			if (functionField.get(calculator) != Calculator.Function.ADD) {
				throw new AssertionError("The \"accept(String token)\" method should call the plus() method"
						+ " when the given String token is +.");
			}

			// +
			method.invoke(calculator, "-");
			if (functionField.get(calculator) != Calculator.Function.SUBTRACT) {
				throw new AssertionError("The \"accept(String token)\" method should call the minus() method"
						+ " when the given String token is -.");
			}

			// +
			method.invoke(calculator, "*");
			if (functionField.get(calculator) != Calculator.Function.MULTIPLY) {
				throw new AssertionError("The \"accept(String token)\" method should call the times() method"
						+ " when the given String token is *.");
			}

			// +
			method.invoke(calculator, "/");
			if (functionField.get(calculator) != Calculator.Function.DIVIDE) {
				throw new AssertionError("The \"accept(String token)\" method should call the divide() method"
						+ " when the given String token is /.");
			}

			// double
			double number = randomDouble(100);
			functionField.set(calculator, null);

			method.invoke(calculator, "" + number);

			if ((double) resultField.get(calculator) != number) {
				throw new AssertionError("The \"accept(String token)\" method should call the number(double number)"
						+ " with the result from Double.parseDouble(token)"
						+ " when function is null.");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment21(Lesson2 lesson) {
		Method method = findMethod("execute", String.class).orElseThrow(() ->
				new AssertionError("No method \"execute(String command)\" found."));

		Class<?> returnType = method.getReturnType();
		if (!returnType.equals(Calculator.class)) {
			throw new AssertionError(
					"Method \"execute(String command)\" should return a Calculator, but returns " + returnType + ".");
		}

		assertPublicNonStatic(method, "execute(String command)");

		try {
			Calculator calculator = new Calculator();

			double a = randomDouble(100);
			double b = randomDouble(100);
			double c = randomDouble(5);
			double d = randomDouble(5);
			double e = randomDouble(100);

			String command = String.format("%s + %s * %s / %s - %s", a, b, c, d, e);
			double expected = (((a + b) * c) / d) - e;

			assertIdentityEqual(calculator, method.invoke(calculator, command), "execute(String command)");

			Field field = findField("result").orElseThrow(() ->
					new IllegalStateException("No field \"result\" found."));

			field.setAccessible(true);
			double fieldValue = (double) field.get(calculator);
			if (fieldValue != expected) {
				throw new AssertionError("The execute(String command) method should the result of the given command"
						+ " (" + command + " = " + expected + "),"
						+ " but instead the field is " + fieldValue + ".");
			}

		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException("Unexpected error:", e);
		}
	}

	private void verifyAssignment22(Lesson2 lesson) {
		double a = randomDouble(100);
		double b = randomDouble(100);
		double c = randomDouble(5);
		double d = randomDouble(5);
		double e = randomDouble(100);

		String command = String.format("%s + %s * %s / %s - %s", a, b, c, d, e);
		double expected = (((a + b) * c) / d) - e;

		double result = lesson.assignment22(command);
		if(result != expected){
			throw new AssertionError("The execute(String command) method should the result of the given command"
					+ " (" + command + " = " + expected + "),"
					+ " but instead the field is " + result + ".");
		}
	}

	private void assertPublicStatic(Method method, final String signature) {
		int modifiers = method.getModifiers();
		if (!Modifier.isPublic(modifiers)) {
			throw new AssertionError(
					"Method \"" + signature + "\" should be public.");
		} else if (!Modifier.isStatic(modifiers)) {
			throw new AssertionError(
					"Method \"" + signature + "\" should be static.");
		}
	}

	private void assertPublicNonStatic(Method method, final String signature) {
		int modifiers = method.getModifiers();
		if (!Modifier.isPublic(modifiers)) {
			throw new AssertionError(
					"Method \"" + signature + "\" should be public.");
		} else if (Modifier.isStatic(modifiers)) {
			throw new AssertionError(
					"Method \"" + signature + "\" should NOT be static.");
		}
	}

	private void assertPrivateNonStatic(Method method, final String signature) {
		int modifiers = method.getModifiers();
		if (!Modifier.isPrivate(modifiers)) {
			throw new AssertionError(
					"Method \"" + signature + "\" should be private.");
		} else if (Modifier.isStatic(modifiers)) {
			throw new AssertionError(
					"Method \"" + signature + "\" should NOT be static.");
		}
	}

	private void assertPrivateMutable(Field field, final String fieldName) {
		int modifiers = field.getModifiers();
		if (!Modifier.isPrivate(modifiers)) {
			throw new AssertionError(
					"Field \"" + fieldName + "\" should be private.");
		} else if (Modifier.isFinal(modifiers)) {
			throw new AssertionError(
					"Field \"" + fieldName + "\" should bot be final.");
		}
	}

	private void assertIdentityEqual(Object original, Object result, String signature) {
		if (original != result) {
			throw new AssertionError("The " + signature + " method should return this instance,"
					+ " but instead returns " + result + ".");
		}
	}

	private Optional<Field> findField(String name) {
		return Arrays.stream(Calculator.class.getDeclaredFields())
				.filter(field -> field.getName().equals(name))
				.findFirst();
	}

	private Optional<Method> findMethod(String name, Class<?>... parametersArray) {
		List<Class<?>> parameters = Arrays.asList(parametersArray);
		return Arrays.stream(Calculator.class.getDeclaredMethods())
				.filter(method -> method.getName().equals(name))
				.filter(method ->
						parameters.equals(Arrays.asList(method.getParameterTypes())))
				.findFirst();
	}

	private double randomDouble(int max) {
		return 1 + random.nextInt(max * 1000) / 1000.0;
	}
}
