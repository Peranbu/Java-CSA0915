import java.util.HashSet;
import java.util.Iterator;
public class one {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        set.add("INDIA");
        set.add("IS");
        set.add("MY");
        set.add("COUNTRY");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
