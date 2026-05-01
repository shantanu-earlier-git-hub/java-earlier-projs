package hackrank.week2;

public class MarsExploration {

    public static int marsExploration(String s) {

        int count = 0;
        int len = s.length();

        for (int i = 0; i < len; i = i + 3) {
          String sosStr = s.substring(i, i + 3);
//            System.out.println(sosStr);
            if (!("SOS".equalsIgnoreCase(sosStr))) {

                char[] arr1 = sosStr.toUpperCase().toCharArray();
                char[] arr2 = "SOS".toCharArray();

                for(int j=0; j< 3; j++){
                    if(arr1[j] != arr2[j]) ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS";//"SOSSOT" ;//"SOSSPSSQSSOR"; //"SOSTOT";

        System.out.println(marsExploration(str));

    }
}
