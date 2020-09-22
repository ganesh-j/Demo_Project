package com.mutithread;

class SumUp{
	long startIndex;
	long endIndex;
	long sum =0;
	static long MAX_NUM = Integer.MAX_VALUE;
	
	public SumUp(long startIndex, long endIndex) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	
	public void add() {
		for(long i= startIndex; i <=endIndex;i++) {
			sum = sum +i;
		}
		System.out.println(Thread.currentThread().getName());
	}
	
}




public class SumUpDemo {

	public static void main(String[] args) throws InterruptedException {
		singleThreadDemo();
		TwoThreadsDemo();

	}

	private static void TwoThreadsDemo() throws InterruptedException {
		long start = System.currentTimeMillis();
		 SumUp s1= new SumUp(1,Integer.MAX_VALUE/2); // 1 to n/2
		 SumUp s2= new SumUp((Integer.MAX_VALUE/2)+1 ,Integer.MAX_VALUE); // n/2 +1
		 
		 Runnable r1 = ()->s1.add();
		 Runnable r2 = ()->s2.add();
		 
		 Thread t1= new Thread(r1);
		 Thread t2 = new Thread(r2);
		 t1.start();
		 t2.start();
		 
		 t1.join();
		 t2.join();
		 long sum = s1.sum +s2.sum;
		 long end = System.currentTimeMillis();
		 System.out.println("Multi thread : time - " + (end-start) + " sum =" + sum );
		
			
		
	}

	private static void singleThreadDemo() {
		
       long start = System.currentTimeMillis();
       SumUp s= new SumUp(1,Integer.MAX_VALUE);
       s.add();
       long end = System.currentTimeMillis();
       System.out.println("Single thread : time " + (end-start) + " sum ="+s.sum );
       
       
		
	}

}
