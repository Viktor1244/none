import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class main1 {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(7);



//        System.out.println(Findmax(list));
//        System.out.println(uniqueCount(list));
//        System.out.println(frequency_of_occurrence_of_numbers(list));
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("шалаш fsds fdsf fds grgr rge  ");

//        System.out.println(palindrome_check(list1));
        String text = "The quick brown fox jumps over the lazy dog. The dog barks at the fox.";
        Map<String, Integer> wordFrequency = countWordFrequency(String.valueOf(list1));
        printWordFrequency(wordFrequency);
    }


    public static int Findmax(ArrayList<Integer> list) {
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static String palindrome_check(ArrayList<String> list) {
        for (String str : list) {
            if (isPalindrome(str)) {
                return "Все окей";
            }
        }
        return "Здесь его нету";
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static ArrayList<Integer> uniqueCount(ArrayList<Integer> array) {


        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) == array.get(j)) {
                    array.remove(j);
                }
            }
        }
        return array;
    }




    public static ArrayList<Integer> frequency_of_occurrence_of_numbers(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.merge(num, 1, Integer::sum);
        }

        for (int num : array) {
            result.add(frequencyMap.get(num));
        }

        return result;
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();


        String[] words = text.toLowerCase().split("\\s+");


        for (String word : words) {
            wordFrequency.merge(word, 1, Integer::sum);
        }

        return wordFrequency;

    }




    public static void printWordFrequency(Map<String, Integer> wordFrequency) {
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }







}

