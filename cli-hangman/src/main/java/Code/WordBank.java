package Code;

import java.util.Random;

public class WordBank {
    private String[] words = {
            "java", "python", "developer", "algorithm", "hangman", "object", "inheritance"
    };

    public String getRandomWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}
