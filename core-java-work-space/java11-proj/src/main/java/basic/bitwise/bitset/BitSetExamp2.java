package basic.bitwise.bitset;

import java.util.BitSet;
import java.util.Random;

public class BitSetExamp2 {

    private static final int NO_OF_BITS= 8;

    private static void printInBits(String str, BitSet bitset){

        System.out.print(str);

        for(int i=0; i< NO_OF_BITS; i++){
            System.out.print(bitset.get(i) ? "1": "0");
        }

        System.out.println();
    }

    private static void setRandomBits(BitSet bitSet){

        Random r= new Random();
        for(int i=0; i< NO_OF_BITS/2 ; i++){
            bitSet.set(r.nextInt(NO_OF_BITS));
        }
    }

    public static void main(String[] args) {

        BitSet bitSet1 = new BitSet(NO_OF_BITS);
        BitSet bitSet2 = new BitSet(NO_OF_BITS);

        printInBits("Initial Values of bit set 1:-  " , bitSet1);
        printInBits("Initial Values of bit set 2:-  " , bitSet2);

        setRandomBits(bitSet1);
        setRandomBits(bitSet2);

        printInBits("After random set Values of bit set 1:-  " , bitSet1);

        // finding the highest bit set using bitset, but can get using Integer...
        /*
        int arr[] = bitSet1.stream().toArray();
        int l = arr.length;
        int b =0;
        for(int i = (l-1); i>= 0; i--)b = 7 - arr[i];

        System.out.println("the value .." + (1<<b) );
*/

        printInBits("After random set Values of bit set 2:-  " , bitSet2);

/*
        bitSet1.and(bitSet2);
        printInBits("After and() of b1 and b2:-  " , bitSet1);

        bitSet1.or(bitSet2);
        printInBits("After or() of b1 and b2:-  " , bitSet1);

        bitSet1.xor(bitSet2);
        printInBits("After xor() of b1 and b2:-  " , bitSet1);


        System.out.println("cardinality of bitset 1: " + bitSet1.cardinality());
        System.out.println("cardinality of bitset 2: " + bitSet2.cardinality());
*/



        System.out.println("the position where indices are set for b1 : " + bitSet1.toString());
        System.out.println("the position where indices are set for b2 :" + bitSet2.toString());



    }
}
