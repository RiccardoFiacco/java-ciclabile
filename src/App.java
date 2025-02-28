import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(11);
        list.add(111);
        list.add(1111);
        list.add(11111);
        list.add(111111);
        list.add(1111111);
        list.add(1);
        list.add(34);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
