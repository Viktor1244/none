import java.util.Arrays;

public class main2 {


    public static void main(String[] args) {
        String g = "Hello grfdsgfd gfsgfd bghd sdf ";


    }

    public static String inverted_text(String text){

        return new StringBuilder(text).reverse().toString();

    }


    public static int vowels(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean palindromeCheck(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        return str.equals(new StringBuilder(str).reverse().toString());
    }



    public static String remove_repetition(String str){


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String[] getWordsFromString(String input) {

        String[] words = input.split("\\s+");
        return words;
    }


    public static String reverse_string(String str){

        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }


    public static String uppercase_first_letters(String str){


        String[] words = getWordsFromString(str);

        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }

    public boolean areAnagrams(String s, String s2){

        char[] sAr = s.toCharArray();

        char[] sAr2 = s2.toCharArray();

        Arrays.sort(sAr);

        Arrays.sort(sAr2);

        return Arrays.equals(sAr,sAr2);
    }



}
