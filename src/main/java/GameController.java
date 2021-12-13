import baseball.GameUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    private static final Scanner sc = new Scanner(System.in);
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    public void run() {
        boolean isCorrect = false;

        while (!isCorrect) {
            ArrayList<String> inputNumbers = getInput();
            isCorrect = gameService.judge(inputNumbers);
        }
    }

    private ArrayList<String> getInput() {
        String inputNumbers = sc.nextLine();
        if (inputNumbers.isEmpty()) {
            throw new InvalidInputException();
        }
        return GameUtil.convertStringToList(inputNumbers);
    }
}
