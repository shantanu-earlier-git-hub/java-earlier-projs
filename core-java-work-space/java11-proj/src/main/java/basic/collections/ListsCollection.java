package basic.collections;

import java.util.ArrayList;
import java.util.List;

public class ListsCollection {

    public static void main(String[] args) {

        String[] strArr1 = {"123", "345", "567"};
        String[] strArr2 = {"abc", "def", "hij"};
        String[] strArr3 = {"hd4", "4gt", "47j"};

        List<String[]> strList = new ArrayList<String[]>();

        strList.add(strArr1);
        strList.add(strArr2);
        strList.add(strArr3);

        strList
                .stream()
                .forEach(stringsArr ->
                {
                    for (String str : stringsArr) {
                        System.out.println("str = " + str);
                    }
                });
    }
}