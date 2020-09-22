package com.mutithread;

public class EvenOddThreadDemo {

	int count = 1;
	int MAX = 10;
	boolean flag = false;

	private void printOddNumber() {

		while (count < MAX) {

			synchronized (this) {
				while (flag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " :" + count);
				count++;
				flag = true;
				notify(); //notifyAll();

			}
		}

	}

	private void printEvenNumber() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (count < MAX) {

			synchronized (this) {

				while (!flag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + ":" + count);
				count++;
				flag = false;
				notify();

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		EvenOddThreadDemo eo = new EvenOddThreadDemo();

		Runnable r1 = () -> eo.printOddNumber();

		Runnable r2 = () -> eo.printEvenNumber();

		Thread t1 = new Thread(r1, "Odd Thread");

		Thread t2 = new Thread(r2, "Even Thread");
		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

}
