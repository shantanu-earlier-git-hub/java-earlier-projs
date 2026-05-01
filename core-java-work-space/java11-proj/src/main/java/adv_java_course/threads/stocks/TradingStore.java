package adv_java_course.threads.stocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TradingStore {

    private synchronized static void purchaseStock(StockChecker stockChecker, int amount, String threadName) {

        int stockAmount = stockChecker.getSharePrice();
        if (stockAmount - amount  < 0)
            System.out.println(threadName + " ... No stock to buy shares ");
        else {
            System.out.println(threadName + " ...  processing share purchase of amount  " + amount );
            stockChecker.updateShare(amount);
            System.out.println(threadName + "... you got the shares");
        }

        System.out.println("stock remained  ->  " + stockChecker.getSharePrice());

    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        StockChecker stockChecker = new StockChecker();

        executorService.submit( () -> purchaseStock(stockChecker, 100 , "three"));
        executorService.submit( () -> purchaseStock(stockChecker, 20 , "two"));
        executorService.submit( () -> purchaseStock(stockChecker, 80, "four"));
        executorService.submit( () -> purchaseStock(stockChecker, 60, "five"));
        executorService.submit( () -> purchaseStock(stockChecker, 20, "one"));
        executorService.shutdown();




    }

}
