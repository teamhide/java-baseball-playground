package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class GameUtilTest {
    @Test
    @DisplayName("랜덤 숫자 생성")
    void makeRandomNumbers() {
        ArrayList<String> numbers = GameUtil.makeRandomNumbers(3, 9);
        assertThat(numbers.size()).isEqualTo(3);
        for (int i = 0; i < numbers.size(); i++) {
            assertThat(Integer.parseInt(numbers.get(i))).isLessThan(10);
        }
    }

    @Test
    @DisplayName("문자열 리스트 변환")
    void convertStringToList() {
        String str = "abc";
        ArrayList<String> result = GameUtil.convertStringToList(str);
        assertThat(result.get(0)).isEqualTo("a");
        assertThat(result.get(1)).isEqualTo("b");
        assertThat(result.get(2)).isEqualTo("c");
    }
}
