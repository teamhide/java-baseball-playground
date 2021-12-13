public class BaseballGame {
    public static void main(String[] args) {
        GameController controller = new GameController(new GameService());
        controller.run();
    }
}
