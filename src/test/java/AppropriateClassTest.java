import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppropriateClassTest {

    private final String testFirst = "He said hey(Hello)<>}";
    private final String testSecond = "He <((said) he[]llo)>";

    private final String testThird = "()(";

    private final String testFourth = "[]{}()";

    private final String testFifth = ")()";

    @Test
    public void testFirstVariant(){
        org.junit.jupiter.api.Assertions.assertAll(
                ()-> Assertions.assertThat(FirstVariant.isAppropriate(testFirst)).isEqualTo(false),
                ()-> Assertions.assertThat(FirstVariant.isAppropriate(testSecond)).isEqualTo(true),
                ()-> Assertions.assertThat(FirstVariant.isAppropriate(testThird)).isEqualTo(false),
                ()-> Assertions.assertThat(FirstVariant.isAppropriate(testFourth)).isEqualTo(true),
                ()-> Assertions.assertThat(FirstVariant.isAppropriate(testFifth)).isEqualTo(false)
                );
    }

    @Test
    public void testSecondVariant(){
        org.junit.jupiter.api.Assertions.assertAll(
                ()-> Assertions.assertThat(SecondVariant.isAppropriate(testFirst)).isEqualTo(false),
                ()-> Assertions.assertThat(SecondVariant.isAppropriate(testSecond)).isEqualTo(true),
                ()-> Assertions.assertThat(SecondVariant.isAppropriate(testThird)).isEqualTo(false),
                ()-> Assertions.assertThat(SecondVariant.isAppropriate(testFourth)).isEqualTo(true)
        );
    }
}
