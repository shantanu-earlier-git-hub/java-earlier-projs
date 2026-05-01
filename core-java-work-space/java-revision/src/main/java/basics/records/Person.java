package basics.records;

public record Person(Integer id, String name, Address address) {

    record Address(String street, String city) {

    }
}
