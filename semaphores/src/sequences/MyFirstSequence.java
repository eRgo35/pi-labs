/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequences;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Rau7
 */
public class MyFirstSequence {

    private static final int SLEEP = 1;
    private static final int COUNT = 10;
    

    //declare all necessary semaphores 
//    private static final Semaphore SEM_A = new Semaphore(0, true);



    public static void main(String[] args) {
        new PrintA().start();
        new PrintB().start();
        new PrintC().start();
         
    }

    private static final class PrintA extends Thread { //thread definition

        @Override
        @SuppressWarnings("SleepWhileInLoop")
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                    Thread.sleep(SLEEP);
                    //use semaphore

                    System.out.print("A ");
                    //use semaphore

                }
            } catch (InterruptedException ex) {
                System.out.println("Thread PrintA: Ooops..." + ex);
            }
            System.out.println("Thread PrintA: I'm done...");
        }
    }

    private static final class PrintB extends Thread {

        @Override
        @SuppressWarnings("SleepWhileInLoop")
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                    Thread.sleep(SLEEP);
                    //use semaphore

                    System.out.print("B ");
                    //use semaphore

                }
            } catch (InterruptedException ex) {
                System.out.println("Thread PrintB: Ooops..." + ex);
            }
            System.out.println("Thread PrintB: I'm done...");
        }
    }

    private static final class PrintC extends Thread { //thread definition

        @Override
        @SuppressWarnings("SleepWhileInLoop")
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                    Thread.sleep(SLEEP);
                    //use semaphore

                    System.out.print("C ");
                     //use semaphore
                     
                     
                     
                }
            } catch (InterruptedException ex) {
                System.out.println("Thread PrintC: Ooops..." + ex);
            }
            System.out.println("Thread PrintC: I'm done...");
        }
    }

    
    

    
    
}
