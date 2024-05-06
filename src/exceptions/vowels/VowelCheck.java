package exceptions.vowels;

public class VowelCheck {
    public static void checkVowels(String text) throws NoVowelsException {
        boolean hasVowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (vowels.contains(String.valueOf(letter))) {
                hasVowels = true;
                break;
            }
        }

        if (!hasVowels) {
            throw new NoVowelsException("No vowels in the text");
        }
    }

    public static void main(String[] args) {
        try {
            checkVowels("lfkrlty");
        } catch (NoVowelsException e) {
            e.printStackTrace();
        }
    }
}
