package Collection.EX7;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list.add(20);
        System.out.println("\n");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list.add(0,30);
        System.out.println("\n");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove(0);
        System.out.println("\n");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println("\nSau khi xoa het");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
