public class SztringKetto {
    
    private static String verbing(String s) {
        if (s.length() < 3) {
            return s;
        }

        if (s.endsWith("ing")) {
            return s + "ly";
        } else {
            return s + "ing";
        }
    }

    
    private static String notBad(String s) {
        int indexOfNot = s.indexOf("not");
        int indexOfBad = s.indexOf("bad");

        if (indexOfNot != -1 && indexOfBad != -1 && indexOfNot < indexOfBad) {
            return s.substring(0, indexOfNot) + "good" + s.substring(indexOfBad + 3);
        } else {
            return s;
        }
    }

    // G. front_back
    private static String frontBack(String a, String b) {
        int aMid = (a.length() + 1) / 2;
        int bMid = (b.length() + 1) / 2;

        String aFront = a.substring(0, aMid);
        String aBack = a.substring(aMid);
        String bFront = b.substring(0, bMid);
        String bBack = b.substring(bMid);

        return aFront + bFront + aBack + bBack;
    }

    static void test(String got, String expected) {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args) {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(notBad("This movie is not so bad"), "This movie is good");
        test(notBad("This dinner is not that bad!"), "This dinner is good!");
        test(notBad("This tea is not hot"), "This tea is not hot");
        test(notBad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(frontBack("abcd", "xy"), "abxcdy");
        test(frontBack("abcde", "xyz"), "abcxydez");
        test(frontBack("Kitten", "Donut"), "KitDontenut");
    }
}
