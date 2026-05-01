
void main() {
    var list1 = new LinkedList<>();
    list1.add("abc");
    System.out.println("print list >" + list1);
    System.out.println("reversed ->" + list1.reversed());
    System.out.println("contains 10?  ->" + list1.contains(10));
    System.out.println("first -> " + list1.getFirst());
    System.out.println("last-> " + list1.getLast());
    System.out.println("get 2nd element -> " + list1.get(1));

    for (var element : list1) {
        System.out.println("elements -> " + element);
    }

}


