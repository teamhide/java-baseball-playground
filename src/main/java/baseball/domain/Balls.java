package baseball.domain;

import baseball.GameUtil;
import baseball.GameValidator;
import baseball.InvalidNumberException;

import java.util.ArrayList;

public class Balls {
    private ArrayList<String> balls;

    public Balls(String numbers) {
//        validateNumbers(numbers);
        balls = GameUtil.convertStringToList(numbers);
    }

//    private void validateNumbers(String numbers) {
//        if (GameValidator.hasDuplicateNumber(numbers) || !GameValidator.isCorrectNumberLength(numbers) || !GameValidator.isCorrectNumberRange(numbers)) {
//            throw new InvalidNumberException();
//        }
//    }
}
