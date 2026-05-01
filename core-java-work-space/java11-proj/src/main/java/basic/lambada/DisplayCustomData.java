package basic.lambada;

public class DisplayCustomData {

    public static void main(String[] args) {

        DisplayData displayData = () -> {
            System.out.println(" Display from here");

        };

        displayData.display();


    }


}
