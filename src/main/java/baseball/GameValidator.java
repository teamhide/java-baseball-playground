package baseball;

import java.util.HashSet;

public class GameValidator {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final int NUMBER_LENGTH = 3;

    public static boolean isCorrectNumberRange(String numbers) {
        for (int i = 0; i < numbers.length(); i++) {
            int currentNumber = Integer.parseInt(Character.toString(numbers.charAt(i)));
            if (currentNumber < MIN_NUMBER || currentNumber > MAX_NUMBER) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasDuplicateNumber(String numbers) {
        HashSet<String> setNumbers = new HashSet<>();
        for (int i = 0; i < numbers.length(); i++) {
            setNumbers.add(Character.toString(numbers.charAt(i)));
        }
        return numbers.length() != setNumbers.size();
    }

    public static boolean isCorrectNumberLength(String numbers) {
        if (numbers.length() == NUMBER_LENGTH) {
            return true;
        }
        return false;
    }
}
