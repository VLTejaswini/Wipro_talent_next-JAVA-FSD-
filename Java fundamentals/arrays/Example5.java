import java.util.Arrays;

public class Example5 {
<<<<<<< HEAD
    public static void main(String[] args) {
=======
        public static void main(String[] args) {
>>>>>>> 77eb61a (Initial commit with Oops assignments)
        int[] arr = {34, 12, 56, 78, 9, 21};
        Arrays.sort(arr);
        System.out.println("Smallest Numbers:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("Largest Numbers:");
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
    }
}