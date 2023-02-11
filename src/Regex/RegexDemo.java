
// Machter and pattern classes provide the facility of java regular expression
// Regex package provide following classes
/*
 * MatchResult interface
 * Matcher class
 * Pattern class
 * PatternSyntexException class
 * 
 * Matcher class implements MatchResult interface, it is a regex engine that
 * perform match operation on sequence of characters
 * 
 * Pattern class
 */
package Regex;

import java.util.regex.*;

public class RegexDemo {

    public static void main(String[] args) {
        // first way
        // (.s) = if last character is s
        // s represent the character to be matched
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        Boolean matched = matcher.matches();
        System.out.println("Match Result is : " + matched);

        // Second way
        matched = Pattern.compile(".s").matcher("as").matches();
        System.out.println("Match Result is : " + matched);

        // Third way
        System.out.println("Match Result is : " + Pattern.matches(".s", "as"));

        threeCharacterMatch("ops");
        threeCharacterMatch("Osas");
        threeCharacterMatch("abcd");
    }

    public static void threeCharacterMatch(String match) {
        System.out.println("Three Character Match Result is : " + Pattern.matches("..s", match));
        System.out.println("Matching a,b,c or d : " + Pattern.matches("abcd", match));
    }

}