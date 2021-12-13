import baseball.GameUtil;

import java.util.ArrayList;
import java.util.Random;

public class GameService {
    private final int MAX_NUMBER = 9;
    private final int NUMBER_SIZE = 3;
    private final ArrayList<String> randomNumbers;

    public GameService() {
        randomNumbers = makeRandomNumbers();
    }

    public boolean judge(ArrayList<String> inputNumbers) {
        checkNumberSize(inputNumbers);

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < NUMBER_SIZE; i++) {
            System.out.println(randomNumbers.get(i) + " / " + inputNumbers.get(i));
            if (randomNumbers.get(i).equals(inputNumbers.get(i))) {
                strike += 1;
            } else if (randomNumbers.contains(inputNumbers.get(i))) {
                ball += 1;
            }
        }
        System.out.println(ball + "볼 " + strike + "스트라이크");
        if (strike == 3) {
            return true;
        }
        return false;
    }

    private void checkNumberSize(ArrayList<String> numbers) {
        if (numbers.size() != NUMBER_SIZE) {
            throw new InvalidNumberSizeException();
        }
    }

    public ArrayList<String> makeRandomNumbers() {
        Random random = new Random();
        StringBuilder numbers = new StringBuilder();

        while (numbers.length() < NUMBER_SIZE) {
            String randomNumber = Integer.toString(random.nextInt(MAX_NUMBER) + 1);
            if (numbers.indexOf(randomNumber) == -1) {
                numbers.append(randomNumber);
            }
        }

        return GameUtil.convertStringToList(numbers.toString());
    }
}
