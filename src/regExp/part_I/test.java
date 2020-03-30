package regExp.part_I;

public class test {
    public static void main(String[] args) {

        /*
            \\d - одна цифра
            \\w одна английская буква
            \\w = [a-zA-Z]

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до

            (x|y|z) - одна строка из множества строк

            (abcdefg) = [a|b|c|d|e|f|g]
            [a-zA-Z] - все английские буквы
            [0-9] = \\d
            [^abc] - мы хотим все символы кроме [abc]

            . - любой символ

            {2} - 2 символа до (\\d{2})
            {2,} - 2 или более символа (\\d{2,})
            {2, 4} - от 2 до 4 символов (\\d{2,4})
         */

        String a = "-91";
        String b = "3423423";
        String c = "+1234";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "gksaj133hdfgsad12312424";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "hello there!";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{2,}"));

    }
}
