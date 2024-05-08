package exceptions.duplicates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesCheck {
    public static void checkDuplicates(List<Integer> numbers) throws DuplicateNumbersException {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (Integer number : numbers) {
            if (uniqueNumbers.contains(number)) {
                throw new DuplicateNumbersException("Duplicate number found: " + number);
            }

            uniqueNumbers.add(number);
        }
    }

    public static void main(String[] args) {
        try {
            checkDuplicates(List.of(2, 4, 789, 12, 56, 4));
        } catch (DuplicateNumbersException e) {
            System.out.println(e);
        }
    }
}
