import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
public class one {
    public static void main(String args[]) {
        Queue<String> al = new LinkedList<>();
        al.add("INDIA");
        al.add("IS");
        al.add("OUR");
        al.add("NATION");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
