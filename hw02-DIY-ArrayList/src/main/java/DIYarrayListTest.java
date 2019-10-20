public class DIYarrayListTest {

    public static void main(String[] args) {
        DIYarrayList<String> diyArrayList1 = new DIYarrayList<String>();
        DIYarrayList<String> diyArrayList2 = new DIYarrayList<String>(100);

       String[] a = new String[100];
        for (int i = 0; i < a.length ; i++) {
            a[i] = "" + i;
        }
        java.util.Collections.addAll(diyArrayList1,a);
        java.util.Collections.copy(diyArrayList2, diyArrayList1);
        java.util.Collections.sort(diyArrayList2, String::compareTo);
        java.util.Collections.sort(diyArrayList1, String::compareTo  );
        for (int i = 0; i <diyArrayList1.size(); i++) {
            System.out.println(diyArrayList1.get(i));
            System.out.println(diyArrayList2.get(i));
        }
    }

}
