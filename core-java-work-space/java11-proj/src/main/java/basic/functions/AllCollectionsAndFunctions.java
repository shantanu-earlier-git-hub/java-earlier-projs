package basic.functions;

import problems.PersonModel;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllCollectionsAndFunctions {


    private Supplier<? extends Object> intSupplier = () -> {
        return 100;
    };

    // consumer

    private Consumer<? super Object> consumer = (Object o) -> {
        System.out.println("object passed is " + o);
    };

    //BiConsumer
    private BiConsumer<? super Object, ? super Object> biConsumer = (Object value1, Object value2) -> {
        System.out.printf("the values passed are = %s %s", value1, value2);

    };

    // BiFunction

    private BiFunction<Integer, Integer, Long> biFunction1 = (Integer val1, Integer val2) -> {
        return Long.valueOf(val1 + val2);
    };

    private Function<Long, String> getSum = (sumValue) -> {
        return Optional.of(sumValue).toString();
    };

    private static List<PersonModel> buildPerson() {

        List<PersonModel> personModels = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            PersonModel model = PersonModel.builder()
                    .id(100 + i)
                    .name("name" + 1)
                    .age(10 + i)
                    .address("addess" + i)
                    .build();
            personModels.add(model);
        }

        return personModels;

    }

    private static void convertToMapFromListsDuplicates() {

        List<Integer> idList = Arrays.asList(4, 3, 2, 1, 4, 2);
        List<String> nameList = Arrays.asList("name1", "name2", "name3", "name4", "name5", "name6");


        Map<Integer, String> personTreeMap =
                IntStream.range(0, idList.size())
                        .boxed()
                        .collect(Collectors.toMap(idList::get, nameList::get,
                                (earlier, now) -> earlier));


        personTreeMap.forEach((id, name) -> {
            System.out.println("id-> " + id + " name :-> " + name);
        });
    }

    private static void convertToMapFromLists() {

        List<Integer> idList = Arrays.asList(4,3,2,1);
        List<String> nameList = Arrays.asList("name1", "name2", "name3", "name4");


        Map<Integer, String> personTreeMap =
                IntStream.range(0, idList.size())
                        .boxed()
                        .collect(Collectors.toMap(idList::get, nameList::get));


        personTreeMap.forEach((id, name) -> {
            System.out.println("id-> " + id + " name :-> " + name);
        });

    }

    private static void convertToMap() {

        List<PersonModel> personList = buildPerson();

        Map<Integer, String> personTreeMap = personList
                .stream()
                .collect(Collectors.toMap(PersonModel::getId, PersonModel::getName));

        personTreeMap.forEach((id, name) -> {
            System.out.println("id-> " + id + " name :-> " + name);
        });

    }


    public static void main(String[] args) {

        AllCollectionsAndFunctions allCollectionsAndFunctions = new AllCollectionsAndFunctions();

//        Integer intValue = (Integer) allCollectionsAndFunctions.intSupplier.get();
//        System.out.println(intValue);
//
//        allCollectionsAndFunctions.consumer.accept(100);
//        allCollectionsAndFunctions.biConsumer.accept("jahjdhjashd", 200);
//
//        System.out.println();
//        System.out.println("biFunction1 = " + allCollectionsAndFunctions.biFunction1.andThen(
//                allCollectionsAndFunctions.getSum).apply(200, 300));

        // convert to map
        //convertToMap();

        //convertToMapFromLists();

        convertToMapFromListsDuplicates();
    }


}
