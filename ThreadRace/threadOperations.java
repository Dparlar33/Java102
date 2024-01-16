import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class threadOperations implements Runnable{

    List<Integer> list = new ArrayList<>();
    Random rand = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    List<Integer> list4 = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    private final Object LOCK = new Object();

    @Override
    public void run() {


        createMainList();
        createDivededList();
        synchronized (LOCK){
            findOddorEvenNumber();
        }


       /* printList(list);
        System.out.println(" ");

        printList(list1);
        System.out.println(" ");

        printList(list2);
        System.out.println(" ");*/

        printList(evenList);
        System.out.println(" ");

        printList(oddList);
        System.out.println(" ");

        System.out.println(evenList.size());
        System.out.println(oddList.size());
    }

    public void findOddorEvenNumber(){
       isContain(list1);
       isContain(list2);
       isContain(list3);
       isContain(list4);
    }
    public void isContain(List<Integer> list){
        for (Integer number:list){
            if(number % 2 == 0){
                evenList.add(number);
            }else{
                oddList.add(number);
            }
        }
    }
    public void createMainList(){
        for(int i=0;i<10000;){
            int number = rand.nextInt(10000);
            if(isContain(number,list)) {
                list.add(number);
                i++;
            }
        }
    }
    public  boolean isContain(int number, List<Integer> list){
        for (Integer integer : list) {
            if (number == integer) {
                return false;
            }
        }
        return true;
    }

    public  void createDivededList(){
        for(int i=0; i<10000;i++){
            if(i<2500){
                list1.add(list.get(i));
            } else if (i >= 2500 && i < 5000 ) {
                list2.add(list.get(i));
            } else if (i >= 5000 && i < 7500) {
                list3.add(list.get(i));
            }else {
                list4.add(list.get(i));
            }
        }
    }

    public  void printList(List<Integer> list){
        for(Integer number:list){
            System.out.print(" " + number);
        }
    }

}
