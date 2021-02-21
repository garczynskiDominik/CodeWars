package codeWars.camelCaseMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CamelCaseMethod {
    public static void main(String[] args) {
        System.out.println(camelCase("gvHhSKYagwbwK VPSczvqyoEjgE zCcROzmIjvkLR vkFjRUubXFcfdia ikIOgCdYLwYC"));

    }

    public static String camelCase(String str) {
        return (str == null || str.isEmpty()) ? "" : Arrays.stream(str.trim().split("\\s+"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length()))
                .collect(Collectors.joining());
    }
}


/**
 * Write simple .camelCase method (camel_case function in PHP,
 * CamelCase in C# or camelCase in Java) for strings.
 * All words must have their first letter capitalized without spaces.
 * <p>
 * For instance:
 * <p>
 * camelCase("hello case"); // => "HelloCase"
 * camelCase("camel case word"); // => "CamelCaseWord"
 */
