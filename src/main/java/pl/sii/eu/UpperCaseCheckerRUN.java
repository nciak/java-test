package pl.sii.eu;

public class UpperCaseCheckerRUN{
    public static void main(String[] args) {
        UpperCaseCheckerImpl upperCaseChecker = new UpperCaseCheckerImpl();
        String input = "BLabla";

        System.out.println(upperCaseChecker.hasUpperCaseLetters(input));

    }
}
