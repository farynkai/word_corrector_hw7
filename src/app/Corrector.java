package app;

public class Corrector {

    public String handleData(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        int count = 1;

        for (String word : words) {
            String correctedWord = correctWord(word);

            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(correctedWord)
                    .append(System.lineSeparator());

            count++;
        }

        return stringBuilder.toString();
    }

    private String correctWord(String word) {
        return word
                .replace("brange", "orange")
                .replace("onibn", "onion");
    }
}
