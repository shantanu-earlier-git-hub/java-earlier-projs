package hackrank.week2;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> outList = new ArrayList<>();

        for(Integer grade : grades){
            if( grade % 5 ==0 ){
                outList.add(grade);
            }else{
                int remain =  grade % 5 ;
                int newGrade = (grade - remain + 5);

                if( newGrade - grade < 3 && grade >= 38)
                    outList.add(newGrade);
                else if( newGrade - grade >= 3 || grade < 40 )
                    outList.add(grade);;

            }
        }
        return outList;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(84,29,44,39, 66);
        System.out.println("grades " + gradingStudents(list));

    }
}