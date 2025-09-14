package util;

public class ConsoleUI {
    
    public static final String RESET  = "\u001B[0m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN   = "\u001B[36m";
    public static final String WHITE  = "\u001B[37m";

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void header(String title) {
        printSeparator(50);
        System.out.printf("%s%s%s%n", CYAN, title, RESET);
        printSeparator(50);
    }

    public static void printSeparator(int length) {
        System.out.println("-".repeat(Math.max(0, length)));
    }

    public static void pause() {
        System.out.print("\nPressione Enter para continuar...");
        try { System.in.read(); } catch (Exception ignored) {}
    }
}
