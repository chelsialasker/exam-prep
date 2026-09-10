import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

// This is the CLASS BEING TESTED (normally in its own file, shown here for reference)
class Calculator {
public int add(int a, int b) {
return a + b;
}

public int divide(int a, int b) {
if (b == 0) {
throw new ArithmeticException("Cannot divide by zero");
}
return a / b;
}

public boolean isEven(int number) {
return number % 2 == 0;
}
}

// This is the TEST CLASS
public class JUnitBasics {

private Calculator calculator;

// runs before EACH test method — good for resetting objects
@BeforeEach
public void setUp() {
calculator = new Calculator();
}

@Test
public void testAdd() {
int result = calculator.add(2, 3);
assertEquals(5, result); // expected, actual
}

@Test
public void testAddNegativeNumbers() {
int result = calculator.add(-2, -3);
assertEquals(-5, result);
}

@Test
public void testDivide() {
int result = calculator.divide(10, 2);
assertEquals(5, result);
}

@Test
public void testDivideByZeroThrowsException() {
// assertThrows checks that the expected exception is actually thrown
assertThrows(ArithmeticException.class, () -> {
calculator.divide(10, 0);
});
}

@Test
public void testIsEvenTrue() {
assertTrue(calculator.isEven(4));
}

@Test
public void testIsEvenFalse() {
assertFalse(calculator.isEven(7));
}

@Test
public void testNotNull() {
assertNotNull(calculator);
}

@Test
public void testNotEquals() {
assertNotEquals(4, calculator.add(2, 3));
}
}
