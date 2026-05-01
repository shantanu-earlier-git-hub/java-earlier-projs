package adv_java_course.genlist.ext.tickets;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class BookTicket {


    public static void main(String[] args) {

        List<List<String>> destinationList = asList(
                asList("city1", "city2"),
                asList("city3", "city4")
        );
        List<List<Ticket>> allTickets = asList(
                asList(new AdultTicket(), new AdultTicket()),
                asList(new ChildTicket(), new ChildTicket())
        );

        List<String> destinations = flattenList(destinationList);
        System.out.println("list1 = " + destinations);
        
        List<Ticket> tickets = flattenList(allTickets);
        System.out.println("tickets = " + tickets);

        System.out.println("Total amount ->  " + totalAmount(tickets));

        List<AdultTicket> adultTicketsList = asList(
                new AdultTicket(),
                new AdultTicket());

        System.out.println("New Total amount ->  " + totalAmount(adultTicketsList));


    }


    private static <T> List<T> flattenList(List<List<T>> nestedList) {

        List<T> singleList = new ArrayList<>();
        nestedList.forEach(singleList::addAll);

        return singleList;

    }

    private static double totalAmount(List<? extends Ticket> ticketList) {
        double totalAmount = 0.00d;
        for (Ticket ticket : ticketList)
            totalAmount += ticket.getPrice();


        return totalAmount;
    }

}
