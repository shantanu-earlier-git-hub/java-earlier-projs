package basics.streams.lambda.excersizes;

import java.util.List;
import java.util.Optional;

public class ClientDao {


    public List<Client> getClientList() {

        Client client1 = Client.builder().id(100).name("sam")
                .email("")
                .build();

        Client client2 = Client.builder().id(200).name("mike")
                .email("").build();

        Client client3 = Client.builder().id(300).name("bob")
                .email("bob@email.com").build();

        Client client4 = Client.builder().id(400).name("tom")
                .email("tom@email.com").build();

        Client client5 = Client.builder().id(500).name("smith")
                .email("smith@email.com").build();

        return List.of(client1, client2, client3, client4, client5);

    }


    public Optional<Client> clientByClientId(int clientId) {

        List<Client> clients = getClientList();
        return clients.stream()
                .filter(client -> client.getId() == clientId)
                .findFirst();
    }


}
