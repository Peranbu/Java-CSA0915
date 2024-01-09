import java.util.Iterator;
import java.util.TreeSet;
public class one {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Im");
        set.add("A");
        set.remove("GOOD");
        set.add("BOY");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
