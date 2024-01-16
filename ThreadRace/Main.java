import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i< 4;i++){
            threads.add(new Thread(new threadOperations()));
        }

        for(Thread th:threads) {
            th.start();
            th.join();
        }

    }

}
