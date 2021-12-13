package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void replace_1() {
        String[] result = "1,2".split(",");
        assertThat(result[0]).isEqualTo("1");
        assertThat(result[1]).isEqualTo("2");
        assertThat(result).contains("1");
        assertThat(result).contains("2");
        assertThat(result).containsExactly("1", "2");
    }

    @Test
    void replace_2() {
        String result = "(1,2)".substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("chatAt() 예외 assertThatThrownBy 테스트")
    void replace_3() {
        assertThatThrownBy(() -> {
            "abc".charAt(55);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 55");
    }

    @Test
    @DisplayName("chatAt() 예외 assertThatExceptionOfType 테스트")
    void replace_4() {
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    "abc".charAt(55);
                }).withMessageMatching("String index out of range: 55");
    }
}
