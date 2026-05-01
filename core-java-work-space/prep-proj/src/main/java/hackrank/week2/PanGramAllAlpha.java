package hackrank.week2;


// pangram contains all the alphabets....
public class PanGramAllAlpha {

    public static String pangrams(String s) {

        String returnStr = "pangram";
        String str = "abcdefghijklmnopqrstuvwxyz";

        for (Character ch : str.toCharArray()) {
            CharSequence lSeq=  String.valueOf(ch);
            if( ! (s.contains(lSeq) || s.contains(lSeq.toString().toUpperCase())) ){
                returnStr = "not " + returnStr;
                break;
            }
        }
        return returnStr;
    }

    public static void main(String[] args) {

        // "The quick brown fox jumps over the lazy dog"
        // "We promptly judged antique ivory buckles for the next prize"
        //  "We promptly judged antique ivory buckles for the prize"
        String str = "We promptly judged antique ivory buckles for the  prize";

        System.out.println(pangrams(str));
    }
}
