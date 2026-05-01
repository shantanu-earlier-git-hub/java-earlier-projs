package basics.streams.lambda.excersizes;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client implements Comparable<Client> {

    private int id;

    private String name;

    private String email;


    @Override
    public int compareTo(Client client) {
        return this.id - client.id;
    }
}







/*

client ( name, address, email , ) --- email no given
ticket( departure, destination, date, client , price)

solve ....

1. Having a list of tickets and a destination return the number of tickets with given destination.

2. Having list of tickets and the a date print out tickets for given date

3. Having a list of tickets and the name of client , check if there is atleast one ticket reserved for given client.

4. Having a list of tickets , return average value of prices for all the tickets in the list.

5. list of tickets , check if all the clients have email defined.

6. list of tickets ... return comma seperated destinations in the ticket list.

 */