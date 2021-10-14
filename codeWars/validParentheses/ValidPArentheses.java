package codeWars.validParentheses;

import java.util.*;

public class ValidPArentheses {
    public static void main(String[] args) {

        System.out.println(validParentheses("1}q()l1(|)xi((rp(p)Y1trsHDM)I)^JGgX+e"));
        System.out.println(balancedParenthensies("1}q()l1(|)xi((rp(p)Y1trsHDM)I)^JGgX+e"));
    }
    public static boolean validParentheses(String parens) {
        List<String> character = Arrays.asList(parens.split(""));
        int counter1 = 0;
        int counter2 = 0;
        for (String characters : character) {
            if (characters.equals("(")) {
                counter1++;
            } else if (characters.equals(")")) {
                counter2++;
            }
        }
        if (counter1 == counter2) {
            return true;
        }

        return false;
    }

    public static boolean balancedParenthensies(String parens) {

        Deque<Character> stack = new ArrayDeque<Character>();


        for (int i = 0; i < parens.length(); i++)
        {
            char x = parens.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
}


/**
 * Write a function that takes a string of parentheses, and determines
 * if the order of the parentheses is valid. The function should
 * return true if the string is valid, and false if it's invalid.
 * <p>
 * Examples
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 * Constraints
 * 0 <= input.length <= 100
 * <p>
 * Along with opening (() and closing ()) parenthesis, input may
 * contain any valid ASCII characters. Furthermore, the input string
 * may be empty and/or not contain any parentheses at all. Do not treat
 * other forms of brackets as parentheses (e.g. [], {}, <>)
 */