import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class ReversePolishNotationCalculatorTest {

    //Выражение в польской нотации должно передаваться в виде
    // строки, где операнды и операции разделены произвольным количеством пробелов.
    //Достаточно проверить, что код работает для операций +, -, *, а также что
    // он правильно обрабатывает пробельные символы и отрицательные числа.

    @Test
    public void shouldCalculateAddition() {
        String str = "2 3 +";
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        String parts = String.valueOf(reversePolishNotationCalculator.calculatePolishNotation(str));
        assertEquals("5", parts);
    }

    @Test
    public void shouldCalculateSubtraction() {
        String str = "2 3 -";
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        String parts = String.valueOf(reversePolishNotationCalculator.calculatePolishNotation(str));
        assertEquals("-1", parts);
    }

    @Test
    public void shouldCalculateMultiplication() {
        String str = "2 3 *";
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        String parts = String.valueOf(reversePolishNotationCalculator.calculatePolishNotation(str));
        assertEquals("6", parts);
    }

    @Test
    public void shouldCalculateNegativeNumber() {
        String str = "-2 3 6 +";
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        String parts = String.valueOf(reversePolishNotationCalculator.calculatePolishNotation(str));
        assertEquals("9", parts);
    }

    @Test
    public void shouldCalculateNegativeSpaces() {
        String str = "2   -3 -";
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        String parts = String.valueOf(reversePolishNotationCalculator.calculatePolishNotation(str));
        assertEquals("5", parts);
    }
}