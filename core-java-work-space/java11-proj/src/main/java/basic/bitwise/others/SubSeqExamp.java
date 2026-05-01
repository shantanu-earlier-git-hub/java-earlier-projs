package basic.bitwise.others;

public class SubSeqExamp {

        /*
                abc
                0-> 000 => "" => ""
                1-> 001 => c  => a
                2-> 010 => b  => b
                3-> 011 => bc => ab
                4-> 100 => a  => c
                5-> 101 => ac => ac
                6-> 110 => ab => bc
                7-> 111 => abc => abc
         */


    private static void findMappedStr(char[] arr, int num){
        int pos=0;

        while (num > 0){
            int lastBit= (num & 1);
            if(lastBit == 1)  System.out.print(arr[pos]);

            pos++;
            num = num >> 1;
        }
        System.out.println();
    }


    private static void findSubSeq(char[] arr){

        int n = arr.length;

        for(int i=0; i< (1<<n) ; i++){
            findMappedStr(arr, i);
        }

    }

    public static void main(String[] args) {
       char [] chars ="abc".toCharArray();
       findSubSeq(chars);
    }
}
