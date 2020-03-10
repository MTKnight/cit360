/**
 * @author Marci Godfrey
 * CIT 360: Threads, Executors, and Runnables (TEaRs)
 */

package TEaRs;

import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 


public class maintear {
	
	static final int THREADPOOL = 3;

	public static void main(String[] args) {
		
		first Thread = new first(); 
		Thread.start();
		
		Thread Runnable = new Thread(new second());
		Runnable.start();
		
		ExecutorService Executor = Executors.newFixedThreadPool(THREADPOOL);

		
		Thread Runnable1 = new Thread(new third());
		Thread Runnable2 = new Thread(new third());
		Thread Runnable3 = new Thread(new third());
		Thread Runnable4 = new Thread(new third());
		Thread Runnable5 = new Thread(new third());
		Thread Runnable6 = new Thread(new third());
		Thread Runnable7 = new Thread(new third());
		Thread Runnable8 = new Thread(new third());
		
		
		Executor.execute(Runnable1);
		Executor.execute(Runnable2);
		Executor.execute(Runnable3);
		Executor.execute(Runnable4);
		Executor.execute(Runnable5);
		Executor.execute(Runnable6);
		Executor.execute(Runnable7);
		Executor.execute(Runnable8);
		
		Executor.shutdown();
		
	}


}
