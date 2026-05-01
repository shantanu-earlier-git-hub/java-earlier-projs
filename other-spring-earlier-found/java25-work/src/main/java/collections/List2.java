void main() {

    var list2 = IntStream
            .range(0, 10)
            .boxed()
            .toList();

    System.out.println("list using int-stream" + list2);

    for (var ele : list2) {
        System.out.println(ele);
    }

    list2.stream()
            .forEach(System.out::println);

    //using iterator
    for (var it = list2.iterator(); it.hasNext(); ) {
        System.out.println(it.next());
    }

}