package baseball;

import java.util.ArrayList;
import java.util.Random;

public class GameUtil {
    public static ArrayList<String> makeRandomNumbers(int size, int maxNumber) {
        Random random = new Random();
        StringBuilder numbers = new StringBuilder();

        while (numbers.length() < size) {
            String randomNumber = Integer.toString(random.nextInt(maxNumber) + 1);
            if (numbers.indexOf(randomNumber) == -1) {
                numbers.append(randomNumber);
            }
        }

        return convertStringToList(numbers.toString());
    }

    public static ArrayList<String> convertStringToList(String value) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < value.length(); i++) {
            result.add(Character.toString(value.charAt(i)));
        }
        return result;
    }
}
