package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
        String brackets = "";
        System.out.println("Test String: " + str);

        for (char ch : str.toCharArray()) {
            System.out.println(String.format("ch: %c, bracketsString: %s", ch, brackets));
            if (ch == '[') {
                brackets += '[';

            } else if (ch == ']') {
                if (brackets.length() > 0) {
                    brackets = brackets.substring(0, brackets.length() - 1);
                    System.out.println("else - " + brackets);
                    System.out.println(brackets.length() == 0);
                } else {
                    return false; // covers the edge case ']'
                }
            }
        }
        return brackets.length() == 0;
    }
}
