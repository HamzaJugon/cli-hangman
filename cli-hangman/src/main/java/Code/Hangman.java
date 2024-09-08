package Code;

public class Hangman {
    public void draw(int attemptsLeft) {
        switch (attemptsLeft) {
            case 6:
                System.out.println("""
                   ------
                   |    |
                   |
                   |
                   |
                   |
                --------
                """);
                break;
            case 5:
                System.out.println("""
                   ------
                   |    |
                   |    O
                   |
                   |
                   |
                --------
                """);
                break;
            case 4:
                System.out.println("""
                   ------
                   |    |
                   |    O
                   |    |
                   |
                   |
                --------
                """);
                break;
            case 3:
                System.out.println("""
                   ------
                   |    |
                   |    O
                   |   /|
                   |
                   |
                --------
                """);
                break;
            case 2:
                System.out.println("""
                   ------
                   |    |
                   |    O
                   |   /|\\
                   |
                   |
                --------
                """);
                break;
            case 1:
                System.out.println("""
                   ------
                   |    |
                   |    O
                   |   /|\\
                   |   /
                   |
                --------
                """);
                break;
            case 0:
                System.out.println("""
                   ------
                   |    |
                   |    O
                   |   /|\\
                   |   / \\
                   |
                --------
                """);
                break;
            default:
                System.out.println("Invalid state");
        }
    }
}