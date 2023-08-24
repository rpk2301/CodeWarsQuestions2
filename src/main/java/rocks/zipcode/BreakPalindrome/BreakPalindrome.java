package rocks.zipcode.BreakPalindrome;

public class BreakPalindrome {
/*This one was pretty hard. Want to go back and make
it a little more efficient, but glad I got it
to pass!
 */


    public static String breakPalindrome(String palindrome) {

        if(palindrome.length()==1 && palindrome.charAt(0)=='a')
        {
            return "";
        }
       char[] ret = palindrome.toCharArray();
        for(int i =0;i<ret.length;i++)
        {
            if(i!='a' && !addLetterAndCheckPalindrome(palindrome,i)) {

                return returnNewWordWithLowestCharAtIndex(palindrome,i);
            }
       }
        return returnNewWordIfEntireWordIsa(palindrome,palindrome.length()-1);
    }
        public static boolean isPalindrome(String str)
        {
            String rev = "";
            boolean ans = false;
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev)) {
                ans = true;
            }
            return ans;
        }

    public static boolean addLetterAndCheckPalindrome(String palindrome, int f) {
        String compare = "";
        for (int i = 0; i < palindrome.length(); i++) {
            if (i == f) {
                compare += 'a';
            } else compare += palindrome.charAt(i);
        }
        return isPalindrome(compare);
    }
    public static String returnNewWordWithLowestCharAtIndex(String palindrome, int f) {
        String compare = "";
        for (int i = 0; i < palindrome.length(); i++) {
            if (i == f) {
                compare += 'a';
            } else compare += palindrome.charAt(i);
        }
        System.out.println(compare);
        return compare;
    }
    public static String returnNewWordIfEntireWordIsa(String palindrome, int f) {
        String compare = "";
        for (int i = 0; i < palindrome.length(); i++) {
            if (i == f) {
                compare += 'b';
            } else compare += palindrome.charAt(i);
        }
        System.out.println(compare);
        return compare;
    }
}
