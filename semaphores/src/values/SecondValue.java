/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Rau7
 */
public class SecondValue {

  private static int A = 0;
  private static int B = 0;
  private static int C = 3;

  private static final int SLEEP = 1;

  // declare all necessary semaphores
  // private static final Semaphore NONAME = new Semaphore(1, true);
  private static final Semaphore S2 = new Semaphore(0);
  private static final Semaphore R2 = new Semaphore(0);
  private static final Semaphore S1 = new Semaphore(0);
  private static final Semaphore R1 = new Semaphore(0);
  private static final Semaphore S3 = new Semaphore(0);

  //! 46
  public static void main(String[] args) {
    new P2().start();
    new P1().start();
    new P3().start();
    new P4().start();
  }

  private static final class P1 extends Thread {

    @Override
    public void run() {
      try {
        Thread.sleep(SLEEP);
        A = 10;
        S2.acquire();
        B = B + 5;
        R2.release();
        S3.acquire();
        C = C + A;

        Thread.sleep(SLEEP);
        System.out.println("Thread P1 is done...");

      } catch (InterruptedException ex) {
        System.out.println("Ooops...");
        Thread.currentThread().interrupt();
        throw new RuntimeException(ex);
      }
    }
  }

  private static final class P2 extends Thread {

    @Override
    public void run() {
      try {
        Thread.sleep(SLEEP);
        B = B + C;
        S3.acquire();
        A = A + B;

        Thread.sleep(SLEEP);

        System.out.println("Thread P2 is done...");

      } catch (InterruptedException ex) {
        System.out.println("Ooops...");
        Thread.currentThread().interrupt();
        throw new RuntimeException(ex);
      }
    }
  }

  private static final class P3 extends Thread {

    @Override
    public void run() {
      try {
        Thread.sleep(SLEEP);
        S2.acquire();
        A = 2 * A;
        R2.release();
        S1.acquire();
        C = B + 10;
        R1.release();
        S3.acquire();
        B = B + A;

        Thread.sleep(SLEEP);
        System.out.println("Thread P3 is done...");

      } catch (InterruptedException ex) {
        System.out.println("Ooops...");
        Thread.currentThread().interrupt();
        throw new RuntimeException(ex);
      }
    }
  }

  private static final class P4 extends Thread {

    @Override
    public void run() {
      try {
        Thread.sleep(SLEEP);
        S2.release(2);
        R2.acquire(2);
        S1.release();
        R1.acquire();
        System.out.println("Sum result: " + A + " + " + B + " + " + C + " = " + (A + B + C));
        S3.release(3);
        Thread.sleep(SLEEP);
        System.out.println("Thread P4 is done...");

      } catch (InterruptedException ex) {
        System.out.println("Ooops...");
        Thread.currentThread().interrupt();
        throw new RuntimeException(ex);
      }
    }
  }

}
