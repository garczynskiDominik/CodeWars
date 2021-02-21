package codeWars.findTheMissingLetter;

public class FindTheMissingLetter {
    public static void main(String[] args) {
        char[] array = {'d', 'e', 'f', 'h'};
        System.out.println(findMissingLetter(array));
    }

    public static char findMissingLetter(char[] array) {
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                result = array[i] + 1;
            }
        }
        return (char) result;
    }
}

/**
 * Write a method that takes an array of consecutive (increasing)
 * letters as input and that returns the missing letter in the array.
 * You will always get an valid array. And it will be always
 * exactly one letter be missing. The length of the array
 * will always be at least 2.
 * The array will always contain letters in only one case.
 * <p>
 * Example:
 * <p>
 * ["a","b","c","d","f"] -> "e"
 * ["O","Q","R","S"] -> "P"
 * (Use the English alphabet with 26 letters!)
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 * <p>
 * I have also created other katas. Take a look if you enjoyed this kata!
 */
