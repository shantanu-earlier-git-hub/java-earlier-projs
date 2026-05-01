package hackrank.week2;

public class FlippingBits {


//    public static long flippingBits(long n) {
//
//    }


    public static void main(String[] args) {

        long val =9l;

        String binaryStr= Long.toBinaryString(val);

        StringBuilder builder = new StringBuilder();
        binaryStr =binaryStr.replace('0', '2')
                .replace('1', '0')
                .replace('2', '1');

        builder.append("1".repeat(32-binaryStr.length()))
                .append(binaryStr);

        binaryStr = builder.toString();

        long conVal = Long.parseLong(binaryStr, 2);

        System.out.println(conVal);



    }

}