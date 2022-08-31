import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ConsoleTest {

    @Test
    void inputStringShouldBeNotNull() {

        String y = null;

        Assertions.assertThrows(NullPointerException.class,()->Console.returnInputResult(y));}

    @Test
    void inputTextShouldBeNotNull() {
    }
}