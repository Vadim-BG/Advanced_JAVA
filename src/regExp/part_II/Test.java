package regExp.part_II;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello.there.hey";
        String[] words2 = b.split("\\.");
        System.out.println(Arrays.toString(words2));

        String c = "Hello123124there2345324hey23423qwecsa";
        String[] words3 = c.split("\\d+");
        System.out.println(Arrays.toString(words3));

        String d = "Hello there hey";
        String modifiedString = d.replace(" ", ".");
        System.out.println(modifiedString);

        String e = "Hello123214there123421341hey";
        String modifiedString2 = e.replaceAll("\\d+", "-");
        String modifiedString3 = e.replaceFirst("\\d+", "-");
        System.out.println(modifiedString2);
        System.out.println(modifiedString3);
    }
}
