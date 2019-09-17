package Practice_Purpose;
import java.util.StringJoiner;
import java.lang.StringBuilder;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder provider = new StringBuilder("Hello Hello");
        provider.append(" Kot");
        provider.append(" Cat");
        provider.delete(2,4);

        System.out.println(provider);

        provider.deleteCharAt(0);
        System.out.println(provider);

        StringBuilder asel = new StringBuilder("Asel");
        provider.insert(2,asel);

        int nums = 1;
        int count = 0;
        nums = nums + count++;
        System.out.println(count);
    }
}
