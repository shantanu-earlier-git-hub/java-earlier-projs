package my_new_things;

import java.util.List;

@FunctionalInterface
public interface Conversion {

    public List<Integer> convertCharToInt(List<Character> value);
}
