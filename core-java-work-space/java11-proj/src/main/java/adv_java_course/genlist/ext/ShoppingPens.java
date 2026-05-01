package adv_java_course.genlist.ext;

import java.util.ArrayList;
import java.util.List;

public class ShoppingPens {

    public static void main(String[] args) {

        FountainPen f1 = new FountainPen();
        penDetails(f1);

        BallPen b1 = new BallPen();
        penDetails(b1);

        List<Pen> penList = new ArrayList<>();

        penList.add(f1);
        penList.add(b1);
        listOutPens(penList);

    }


    private static void penDetails(Pen pen) {
        System.out.println("The Pen Price: " + pen.getPrice() + " The Pen Name: " + pen.getName());
    }

    private static void listOutPens(List<? extends Pen> penList) {

        for (Pen pen : penList)
            penDetails(pen);
    }

}
