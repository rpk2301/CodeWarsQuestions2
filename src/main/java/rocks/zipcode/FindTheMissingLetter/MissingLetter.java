package rocks.zipcode.FindTheMissingLetter;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        int i = 0;
        while (array[i + 1] == array[i] + 1) {
            i++;
        }
        return (char) (array[i] + 1);
    }
}
