package adv_java_course.genlist.ext;

public class BallPen extends Pen{

    @Override
    protected double getPrice() {
        return 11.11;
    }

    @Override
    protected String getName() {
        return "ball pen";
    }
}
