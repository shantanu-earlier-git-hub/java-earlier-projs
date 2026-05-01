package basics.array;

public class Example1 {


    private static void arrayEx() {
        int[][][] z = {{{1, 2, 3}}, {{4, 5}}, {null}, null};

        System.out.println(z.length);

        System.out.println(z[0].length);

        System.out.println(z[0][0][0]);

        // negative array size exception
        //int[] x = new int[-1];

        int[] x1, x2;

        x1 = new int[2];
        //x2 =10; // doesn't work as x2 is also array
        x2 = new int[3];


        //int x1[], x2; // x1 is array and x2 is int;


    }

    public static void main(String[] args) {

        arrayEx();
    }

}
