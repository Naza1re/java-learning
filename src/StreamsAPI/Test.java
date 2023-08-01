package StreamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("nikoly",25,2500,"nick@mail.ru",4));
        workers.add(new Worker("nikitinio",25,3000,"nikita@mail.ru",4));
        workers.add(new Worker("leonardo",15,1600,"leo@mail.ru",2));
        workers.add(new Worker("maskapone",25,2330,"musk@mail.ru",5));
        System.out.println(workers);
        List<Worker> adultWorkers = workers.stream().filter(worker -> worker.getAge()>18).toList();
        System.out.println(adultWorkers);
    }
}
