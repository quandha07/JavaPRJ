public class Main {
    public static void main(String[] args) {
        MoonRover mr1 = new MoonRover(1, 2, 'N');
        mr1.processInstructions("LMLM");
        mr1.getInstructions();
    }
}