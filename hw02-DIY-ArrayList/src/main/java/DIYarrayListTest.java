import java.util.ArrayList;
import java.util.List;

public class DIYarrayListTest {
    public static void main(String[] args) {
        List eList = new ArrayList();
        eList.add("1");
        eList.add(2);
        eList.add(3.0);
        eList.add(4l);
        eList.addAll(eList);
        DIYarrayList<Integer> diYarrayList = new DIYarrayList();
        System.out.println(diYarrayList.size());
        System.out.println(eList);


    }


}
