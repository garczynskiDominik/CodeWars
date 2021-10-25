package src.main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {
    public static String changeFormat(String paragraph) {

        String reg = "\\d{3}-\\d{2}-\\d{4}";
        String found;
        String test = "";


        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(paragraph);
        if (matcher.find()) {
            found = matcher.group();
            String[] tab = found.split("-");
            String result = tab[0].replace(".", "") + "/" + tab[2].replace(".", "") + "/" + tab[1].replace(".", "");
            test = paragraph.replaceFirst(reg, result);

        }
        return test;
    }

    public static void main(String[] args) {
        System.out.println(changeFormat("Please quote your policy number: 112-39-8552."));
    }
}


//Firma ubezpieczeniowa zdecydowała się zmienić format swoich numerów polis
// z XXX-YY-ZZZZ na XXX/ZZZZ/YY (gdzie X, Y i Z oznaczają cyfry 0-9).
// Napisz metodę, która ponownie formatuje wszystkie numery zasad w dobrze sformatowanym akapicie
// (w innym miejscu tekstu może pojawić się znak „-”).
// Na przykład polecenie changeFormatf „Proszę podać numer polisy: 112-39-8552. ”) powinno zwrócić „Proszę podać numer polisy: 112/8552/39”.
