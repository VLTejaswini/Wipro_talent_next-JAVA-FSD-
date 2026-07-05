public class Example10 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }
}