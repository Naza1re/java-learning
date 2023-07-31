package FileInputOutputStream;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do{
            System.out.println("Хотите добавить работника в файл?");
            System.out.println("1(yes) 2(no)");
            x = in.nextInt();
            switch (x){

                case 1:
                    String name;
                    int age;
                    String email;
                    int department;

                    System.out.println("Введите имя работника");
                    name = in.next();
                    System.out.println("Введите возраст работника");
                    age = in.nextInt();
                    System.out.println("Введите email работника");
                    email = in.next();
                    System.out.println("Введите отдел работника");
                    department = in.nextInt();
                    writeWorkers(new Worker(name,age,email,department));

                    break;
                case 2:
                    System.exit(1);
                    break;
                case 3:
                    readWorkers();
                    break;
            }


        }while (true);
    }

    public static void writeWorkers(Worker worker){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("workers.txt"));
            fileOutputStream.write(worker.toString().getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readWorkers(){
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("workers.txt"));
            int i;
            while((i=fileInputStream.read())!=-1){

                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" ");
    }
}
