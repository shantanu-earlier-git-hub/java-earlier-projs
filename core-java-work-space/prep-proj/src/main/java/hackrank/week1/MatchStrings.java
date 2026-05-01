package hackrank.week1;

import java.util.ArrayList;
import java.util.List;

public class MatchStrings {

    /*

            strings = ["ab", "ab" , "abc"]
            q =["ab" , "abc" , "bc"]

            res= [2,1,0]

     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> countList = new ArrayList<>();

        for (String query : queries) {
                    long count = strings.stream()
                            .filter(str -> str.equals(query) || str.equalsIgnoreCase(query))
                            .count();
            countList.add((int) count);
        }

        return countList;
    }

    public static void main(String[] args) {

        List<String> strings = List.of("ab", "ab" , "abc");
        List<String> q =List.of("ab" , "abc" , "bc");

        System.out.println(matchingStrings(strings, q));

    }


}
