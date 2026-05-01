package adv_java_course.threads.stocks;

public class StockChecker {

    private int shareAmount = 200;


    public int getSharePrice(){
        return shareAmount;
    }


    public  void updateShare(int amount ){

        shareAmount -= amount;

    }



}
