import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class ConsoleTest {

    @Test
    void inputStringShouldBeNotNull() {

        String y = null;

        Assertions.assertThrows(NullPointerException.class,()->Console.returnInputResult(y));}

    @Test
    void inputTextShouldBeNotNull() {
    }
}