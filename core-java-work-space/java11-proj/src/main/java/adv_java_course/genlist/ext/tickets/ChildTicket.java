package adv_java_course.genlist.ext.tickets;

public class ChildTicket extends Ticket{

    @Override
    protected double getPrice() {
        return 10;
    }

    @Override
    public String toString() {
        return "Child Ticket";
    }
}
