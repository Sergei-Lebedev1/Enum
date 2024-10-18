import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[]args){
        String [] arr2 = {"Aa","Bb","Cc","Dd"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(list2);
        list2.add("Ii");
        System.out.println(list2);


        int [] arr = new int [5];
        Arrays.fill(arr,3);
        for (int el:arr) {
            System.out.println(el);

        }
        String [] arr1 = {"Aa","Bb","Cc","Dd"};
        String str = Arrays.toString(arr1);
        System.out.println(str);
    }
}
