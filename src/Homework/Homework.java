package Homework;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Homework extends Thread{
public static void main (String [] args) throws InterruptedException {
   ExecutorService executor = Executors.newFixedThreadPool(10);
    int processors =  Runtime.getRuntime().availableProcessors();
    System.out.println("The number of processors are :" + processors);
   // Runnable fib = new Fibonacci();
    long start1 = System.nanoTime();
    Runnable workerSubstraction = new Homework();
   executor.execute(workerSubstraction);
   executor.shutdown();
    long stop1 = System.nanoTime();
    System.out.println("The time for multi thread execution is   :" + (stop1-start1));

    long start2 = System.nanoTime();
   Homework h1 = new Homework();

   h1.run();
    long stop2 = System.nanoTime();
    System.out.println("The time for single thread  execution is :" + (stop2-start2));
}


public void run() {
    int   a = 1;
    int   b = 0;

    for (int i = 0; i <100000 ; i++) {
        a +=b ;
     //   System.out.println(a);
        b +=a ;
    //    System.out.println(b);

    }

 }
}
