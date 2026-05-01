package basics.datetime;

import java.util.Calendar;

public class AppCalender {

    private Calendar calendar = Calendar.getInstance();

    public void calender_timezone_type() {
        System.out.println("calendar.getCalendarType() = " + calendar.getCalendarType());
        System.out.println("time zone = " + calendar.getTimeZone());
        System.out.println("calendar.getFirstDayOfWeek() = " + calendar.getFirstDayOfWeek());
    }

    public Calendar five_days_back() {
        calendar.add(Calendar.DATE, -5);
        return calendar;
    }

    public int get_monthOfYear() {
        return calendar.get(Calendar.MONTH);
    }

    public int get_dayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int get_dayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int get_dayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int get_date() {
        return calendar.get(Calendar.DATE);
    }


}
