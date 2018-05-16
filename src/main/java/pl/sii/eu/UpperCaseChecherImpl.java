package pl.sii.eu;

class UpperCaseCheckerImpl implements UpperCaseChecker {

    @Override
    public boolean hasUpperCaseLetters(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    }
