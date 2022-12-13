/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producer;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Rau7
 */
public class Producer1 {

  private static final int SLEEP = 1;
  private static final int SLEEP2 = 10;
  private static final int SLEEP3 = 100;
  private static final int COUNT = 20;
  // declare all necessary semaphores
  // private static final Semaphore SEM_A = new Semaphore(0, true);

  // Producent ma parking o pojemności 5 samochodów, na początku parking jest
  // pusty
  // Transport może przewozić 1 samochód, na początku jest pusty
  // Sprzedawca ma parking o pojemności 3 samochodów, na początku parking jest
  // pusty
  // Zsycnhronizować 3 wątki aby prces produkcji transportu i sprzedaży fizycznie
  // mógł być realizowany;
  // np. nie można sprzedać auta jeżeli nie zostało ono wyprodukowane i
  // dostarczone
  // nie można produkować kolejnych aut jeżeli nie ma wolnego miejsca na parkingu

  // The manufacturer has a car park with a capacity of 5 cars, at the beginning
  // the car park is empty
  // The transport can carry 1 car, it is empty at the beginning
  // The seller has a car park with a capacity of 3 cars, at the beginning the car
  // park is empty
  // Synchronize the 3 threads so that the transport and sales and production
  // process can be physically carried out;
  // e.g. a car cannot be sold if it has not been manufactured and delivered
  // no more cars can be produced if there is no free parking space

  private static int manufactured_car = 0;
  private static int car_sold = 0;
  private static int car_transported = 0;
  private static int storage = 5;
  
  private static final Semaphore M = new Semaphore(1); // mux
  private static final Semaphore S = new Semaphore(0); // state
  private static final Semaphore X = new Semaphore(storage); // storage left
  private static final Semaphore T = new Semaphore(0); // transport queue

  public static void main(String[] args) {
    new Produce().start();
    new Transport().start();
    new Sale().start();
  }

  private static final class Produce extends Thread { // thread definition

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
      try {
        for (int i = 0; i < COUNT; i++) {
          Thread.sleep(SLEEP2);
          manufactured_car++;
          System.out.print("\n Produce" + manufactured_car);
          X.acquire();
          M.acquire();
          T.release();
          M.release();
          S.release();
        }
      } catch (InterruptedException ex) {
        System.out.println("Thread PrintA: Ooops..." + ex);
      }
      System.out.println("\n Thread PrintA: I'm done... ");
    }
  }

  private static final class Transport extends Thread {

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
      try {
        for (int i = 0; i < COUNT; i++) {
          Thread.sleep(SLEEP2);
          T.acquire();
          car_transported++;
          System.out.print(" \n Transport" + car_transported);
        }
      } catch (InterruptedException ex) {
        System.out.println("Thread PrintB: Ooops..." + ex);
      }
      System.out.println("\n Thread PrintB: I'm done... ");
    }
  }

  private static final class Sale extends Thread { // thread definition

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
      try {
        for (int i = 0; i < COUNT; i++) {
          Thread.sleep(SLEEP2);
          S.acquire();
          M.acquire();
          T.release();
          M.release();
          car_sold++;
          System.out.print("\n Sale " + car_sold);
        }
      } catch (InterruptedException ex) {
        System.out.println("Thread PrintC: Ooops..." + ex);
      }
      System.out.println("\n Thread PrintC: I'm done... ");
    }
  }

}
