package codeWars.simpleNumberSwquence;


public class SimpleNumberSequence {
    public static void main(String[] args) {
        System.out.println(missing("8990919395"));
    }

    public static int missing(String s) {
        int len = s.length();
        if (len == 0 || s.charAt(0) == '0')
            return -1;
        outer:
        for (int k = 1, maxK = Math.min(9, len / 2); k <= maxK; k++) {
            int n = Integer.parseInt(s.substring(0, k));
            int x = 0;
            int i = k;
            while (i < len) {
                String ns = Integer.toString(++n);
                if (s.startsWith(ns, i))
                    i += ns.length();
                else if (x > 0)
                    continue outer;
                else
                    x = n;
            }
            if (x > 0 && i == len)
                return x;
        }
        return -1;
    }
}
