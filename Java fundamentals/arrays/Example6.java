import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {

        int[] arr = {34, 5, 67, 12, 1};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}