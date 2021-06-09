package codeWars.stringEndWith;

public class StringWndWith {
    public static void main(String[] args) {
        System.out.println(solution("abc","d"));

    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
