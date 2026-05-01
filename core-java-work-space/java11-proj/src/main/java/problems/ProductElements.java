package problems;

public class ProductElements {


    public static void main(String[] args) {

        int arr[] = {1, 0, 3, 4,2,2,6,7,1,3};
        long product[] = new long[arr.length];

        new ProductElements().multiplyRoll(arr, 0, product);

    }

    void multiplyRoll(int[] ay, int _i, long product[]) {

        int temp = 1;
        int index = _i;

        if (_i < ay.length) {
            for (int i = 0; i < ay.length; i++) {
                if (index != i)
                    temp = temp * ay[i];
                else continue;
            }
            product[index] = temp;
            multiplyRoll(ay, ++index, product);
        } else {

            System.out.println("len" + product.length);

            for (int i = 0; i < product.length; i++) {
                System.out.println("value= " + product[i]);
            }
        }
    }
}
