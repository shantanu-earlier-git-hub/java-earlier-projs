package problems;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//5 3
//10 20 30 40 50


class Result {
    public static int activityNotifications(List<Integer> expenditure, int d) {

        // Write your code here
        int [] values = expenditure.stream().mapToInt(v -> v).toArray();

        IntStream indexStream= IntStream.iterate(d+1 , i -> i >=0 , i -> i - 1);
        return 0;
    }
}

public class ExpenditureNotification {

    public static void main(String[] args) throws Exception {

        String OUTPUT_PATH = "E:\\data\\output\\result.txt";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_PATH));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}




