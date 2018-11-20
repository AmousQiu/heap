import java.io.*;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String args[]) throws IOException{
        Heap<Process> memory=new Heap<Process>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the filename:");
        String filename=keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        int id;
        int timeRead;
        int priority;
        int timeArrival;
        while(inputFile.hasNext()){
            id=inputFile.nextInt();
            timeRead=inputFile.nextInt();
            priority=inputFile.nextInt();
            timeArrival=inputFile.nextInt();
            Process p=new Process(id,timeRead,priority,timeArrival);
            memory.add(p);
        }
        int timeCount=1;//mean the time unit
        while(!memory.isEmpty()){
            System.out.println("Time Unit:"+timeCount);
            System.out.println();
        }
    }
}
