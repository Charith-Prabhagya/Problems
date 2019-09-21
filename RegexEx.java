import java.util.regex.*;

class RegexEx {
    public static void main(String args[]) {
        System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)

        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));// false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));// true (a or m or n may come zero or more times)

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)

    }
}