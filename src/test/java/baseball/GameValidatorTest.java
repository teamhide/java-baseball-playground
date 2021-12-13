package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameValidatorTest {
    @Test
    @DisplayName("야구 숫자 1-9 성공 케이스")
    void isCorrectNumberRange_성공() {
        assertThat(GameValidator.isCorrectNumberRange("123")).isTrue();

        assertThat(GameValidator.isCorrectNumberRange("456")).isTrue();

        ArrayList<String> arr3 = new ArrayList<>(Arrays.asList("7", "8", "9"));
        assertThat(GameValidator.isCorrectNumberRange("789")).isTrue();
    }

    @Test
    @DisplayName("야구 숫자 1-9 실패 케이스")
    void isCorrectNumberRange_실패() {
        boolean result = GameValidator.isCorrectNumberRange("120");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("중복 숫자 성공 케이스")
    void hasDuplicateNumber_성공() {
        boolean result = GameValidator.hasDuplicateNumber("123");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("중복 숫자 실패 케이스")
    void hasDuplicateNumber_실패() {
        boolean result = GameValidator.hasDuplicateNumber("112");
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("숫자 길이 성공 케이스")
    void isCorrectNumberLength_성공() {
        boolean result = GameValidator.isCorrectNumberLength("123");
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("숫자 길이 실패 케이스 1")
    void isCorrectNumberLength_실패_1() {
        boolean result = GameValidator.isCorrectNumberLength("1");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("숫자 길이 실패 케이스 2")
    void isCorrectNumberLength_실패_2() {
        boolean result = GameValidator.isCorrectNumberLength("12");
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("숫자 길이 실패 케이스 3")
    void isCorrectNumberLength_실패_3() {
        boolean result = GameValidator.isCorrectNumberLength("1234");
        assertThat(result).isFalse();
    }
}
