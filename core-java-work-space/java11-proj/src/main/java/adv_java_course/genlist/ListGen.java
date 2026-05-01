package adv_java_course.genlist;

import java.util.Arrays;
import java.util.List;

public class ListGen {

    public static void main(String[] args) {

        String[] words = {"some", "words", "here"};

        Integer[] ints = {1, 2, 3};


    }

    private static <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }


}
