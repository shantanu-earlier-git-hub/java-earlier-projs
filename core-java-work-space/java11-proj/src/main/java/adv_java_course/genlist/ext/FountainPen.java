package adv_java_course.genlist.ext;

public class FountainPen extends Pen{


    @Override
    protected double getPrice() {
        return 12.12;
    }

    @Override
    protected String getName() {
        return "fountain pen";
    }
}
