package pl.sii.eu;

public class DuplicateCheckerImpl implements DuplicateChecker {

    @Override
    public boolean hasDuplicateCharacters(String input) {

        String inputIgnoreSpaces = input.replaceAll("\\s+","");
        for (int i=0;i<inputIgnoreSpaces.length();i++)
            for (int j=i+1;j<inputIgnoreSpaces.length();j++)
                if (j!=i && inputIgnoreSpaces.toLowerCase().charAt(j)
                        == inputIgnoreSpaces.toLowerCase().charAt(i)) {
                    return true;
                }
        return false;
    }
}
