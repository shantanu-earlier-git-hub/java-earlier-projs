package hackrank.week2;

public class CountingSteps {


    public static int countingValleys(int steps, String path) {

        int seaLevel = 0; // sea level
        int valleyDrive =0;

        char [] stepsArr = path.toCharArray();
        for( Character step : stepsArr )
        {

            switch (step){
                case 'U' -> seaLevel =  seaLevel + 1;

                case 'D' -> {
                    if(seaLevel == 0) ++valleyDrive;
                    seaLevel = seaLevel - 1 ;
                }
            }
        }
        return valleyDrive;
    }
        public static void main(String[] args) {

        //"DDUUUUDD"
            //"UDDDUDUU"
            //"DDUUDDUDUUUD"
            String input = "DDUUDDUDUUUD";

            int status = countingValleys(12,input );
            System.out.println(status);
        }
}
