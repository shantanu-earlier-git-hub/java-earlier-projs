package basic.abs;

public class DisplayClient {


    public static void main(String[] args) {

        Idisplay screenDisplay= new ScreenDisplay();
        Idisplay consoleDisplay= new ConsoleDisplay();


        screenDisplay.display();
        consoleDisplay.display();

    }
}
