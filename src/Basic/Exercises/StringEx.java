package Basic.Exercises;

//Объявить строку с вашим полным именем и вывести на экран результат работы всех стандартных методов работы со строками.

public class StringEx {
    public static void main(String[] args) {
        String s = "Yevhenii Bondarenko";
        String s2 = "Vitaly Bohdan";
        String s3 = "Yevhenii Bondarenko";
        System.out.println("Length - " + s.length());
        System.out.println("Empty? - " + s.isEmpty());
        System.out.println("CharAt \"0\"? - " + s.charAt(0));
        System.out.println("Equals with \"Bing\"? - " + s.equals("Bing"));
        System.out.println("Equals with s2? - " + s.equalsIgnoreCase(s2));
        System.out.println("Equals with s3? - " + s.equalsIgnoreCase(s3));
        System.out.println("Starts with \"Yev\" prefics? - " + s.startsWith("Yev"));
        System.out.println("Ends with \"nko\" ending? - " + s.endsWith("nko"));
        System.out.println("Concat 2 strings: " + s.concat(s2));
        System.out.println("Replace all e letters on 0: " + s.replace("e", "0"));
        System.out.println("String contains specified character sequence or not?: " + s.contains("o"));
    }
}
