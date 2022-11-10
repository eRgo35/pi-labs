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

// ! BCBA
public class MyFirstSequence {

  private static final int SLEEP = 1;
  private static final int COUNT = 10;

  // declare all necessary semaphores
  // private static final Semaphore SEM_A = new Semaphore(0, true);
  private static final Semaphore A = new Semaphore(0);
  private static final Semaphore B = new Semaphore(0);
  private static final Semaphore C = new Semaphore(0);

  public static void main(String[] args) {
    new PrintA().start();
    new PrintB().start();
    new PrintC().start();

  }

  private static final class PrintA extends Thread { // thread definition

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
      try {
        for (int i = 0; i < COUNT; i++) {
          Thread.sleep(SLEEP);
          A.acquire();
          System.out.print("A ");
          C.release();
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
        for (int i = 0; i < COUNT * 2; i++) { // ? This count incrementation is required? or the program shall ignore
                                              // ? the pattern after count?
          B.acquire();
          Thread.sleep(SLEEP);
          System.out.print("B ");
          C.release();
        }
      } catch (InterruptedException ex) {
        System.out.println("Thread PrintB: Ooops..." + ex);
      }
      System.out.println("Thread PrintB: I'm done...");
    }
  }

  private static final class PrintC extends Thread { // thread definition

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
      try {
        for (int i = 0; i < COUNT; i++) {
          Thread.sleep(SLEEP);
          B.release();
          C.acquire();
          System.out.print("C ");
          B.release();
          C.acquire();
          A.release();
          C.acquire();
        }
      } catch (InterruptedException ex) {
        System.out.println("Thread PrintC: Ooops..." + ex);
      }
      System.out.println("Thread PrintC: I'm done...");
    }
  }

}
