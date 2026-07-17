import java.util.StringJoiner;

public class mergestringjoiner {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Chennai");
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Hyderabad");
        s2.add("Pune");
        s2.add("Kolkata");
        StringJoiner temp1 = new StringJoiner("-");
        temp1.merge(s1);
        temp1.merge(s2);
        System.out.println("s1 merged to s2:");
        System.out.println(temp1);
        StringJoiner temp2 = new StringJoiner("-");
        temp2.merge(s2);
        temp2.merge(s1);
        System.out.println("s2 merged to s1:");
        System.out.println(temp2);
    }
}