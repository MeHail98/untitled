import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppropriateClassTest {

    private final String testFirst = "He said hey(Hello)<>\"";
    private final String testSecond = "He <((said) hello)>";

    @Test
    public void testMethod(){
        org.junit.jupiter.api.Assertions.assertAll(
                ()-> Assertions.assertThat(AppropriateClass.isAppropriate(testFirst)).isEqualTo(false),
                ()-> Assertions.assertThat(AppropriateClass.isAppropriate(testSecond)).isEqualTo(true)
        );
    }
}
