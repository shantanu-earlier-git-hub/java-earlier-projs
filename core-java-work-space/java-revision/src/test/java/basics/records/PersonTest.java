package basics.records;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("unit")
class PersonTest {

    @Test
    @Disabled
    void checkRecords() {

        Person person = new Person(100, "name1", new Person.Address("some street", "some city"));
        System.out.println(" address " + person.address());
    }


    @ParameterizedTest()
    @ValueSource(ints = {2, 4, 6, 8})
    @DisplayName("check if even from ValueSource")
    void someTest(Integer num) {
        Assertions.assertTrue(isEven(num));
    }

    private Boolean isEven(int num) {
        return num % 2 == 0;
    }

    @TestFactory
    @DisplayName("Collection of dynamic tests ")
    Collection<DynamicTest> dynamicTestWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("add it",
                        () -> assertEquals(3, Math.addExact(1, 2))),
                DynamicTest.dynamicTest("multiply it",
                        () -> assertEquals(200, Math.multiplyExact(10, 20)))
        );

    }

    @TestFactory
    @DisplayName("stream of dynamic tests")
    Stream<DynamicTest> dynamicTestStream() {

        Stream<DynamicTest> s1 = IntStream.range(0, 10)
                .boxed()
                .map(num -> {
                    return DynamicTest.dynamicTest("even num : " + num + " -> ", () -> {
                        assertTrue(((Integer) num) instanceof Integer);
                    });
                });

        Stream<DynamicTest> s2 = IntStream.range(11, 20)
                .boxed()
                .map(num -> {
                    return DynamicTest.dynamicTest("even num : " + num + " -> ", () -> {
                        assertTrue(((Integer) num) instanceof Integer);
                    });
                });

        return Stream.concat(s1, s2);

    }


}