import testpackage.foundation;

public class AccessTest {

    public static void main(String[] args) {

        foundation f = new foundation();

        // System.out.println(f.var1); // Private - Not Accessible
        // System.out.println(f.var2); // Default - Not Accessible
        // System.out.println(f.var3); // Protected - Not Accessible

        System.out.println(f.var4); // Public Accessible
    }
}