package pl.sii.eu;

public class DuplicateCheckerRUN {

    public static void main(String[] args) {

        DuplicateCheckerImpl duplicateChecker = new DuplicateCheckerImpl();
        String input = "an NA";

        System.out.println(duplicateChecker.hasDuplicateCharacters(input));

    }
}
