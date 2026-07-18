import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20.5);
        numbers.add(35.7f);
        numbers.add(200L);

        System.out.println(numbers);
    }
}