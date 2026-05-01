package basics.exceptions;

public class MainClass {

    public static void main(String[] args) {

        try (var ops = new Operations()) {
            ops.divide(10, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
