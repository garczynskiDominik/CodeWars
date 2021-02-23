package codeWars.introduction;

public class Introduction {
    public static void main(String[] args) {
        System.out.println(century(0));
    }

    public static int century(int number) {
        return (number + 99) / 100;

    }

}

/**
 * Introduction
 * The first century spans from the year 1 up to and including the year 100,
 * The second - from the year 101 up to and including the year 200, etc.
 * <p>
 * Task :
 * Given a year, return the century it is in.
 * <p>
 * Input , Output Examples ::
 * centuryFromYear(1705)  returns (18)
 * centuryFromYear(1900)  returns (19)
 * centuryFromYear(1601)  returns (17)
 * centuryFromYear(2000)  returns (20)
 * Hope you enjoy it .. Awaiting for Best Practice Codes
 */
