
import java.util.ArrayList;

public class ArrayListBrackets {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("яблоко");
        words.add("банан");
        words.add("вишня");

        wrapAndPrint(words);
    }

    public static void wrapAndPrint(ArrayList<String> words) {
        for (String word : words) {
            System.out.println("(" + word + ")");
        }
    }
}