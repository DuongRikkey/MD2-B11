package Collection;

import java.util.ArrayList;

public class EX6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(9);
        list.add(7);
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();

        // B3: Duyệt danh sách cũ để kiểm tra phần tử nào xuất hiện một lần duy nhất
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            boolean isUnique = true;

            // Kiểm tra phần tử có xuất hiện ở các chỉ số khác không
            for (int j = 0; j < list.size(); j++) {
                if (i != j && number.equals(list.get(j))) {
                    isUnique = false;
                    break;
                }
            }

            // Nếu phần tử là duy nhất, thêm vào danh sách uniqueList
            if (isUnique) {
                uniqueList.add(number);
            }
        }

        // B4: In danh sách các phần tử không trùng lặp
        System.out.println("List after removing all duplicates: " + uniqueList);

    }
}
