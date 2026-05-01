package adv_java_course.genlist.ext.tickets;

public class AdultTicket extends Ticket{


    @Override
    protected double getPrice() {
        return 100;
    }


    @Override
    public String toString() {
        return "Adult Ticket";
    }
}
