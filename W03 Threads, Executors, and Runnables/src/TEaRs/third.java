package TEaRs;

public class third implements Runnable{

		public void run() {
			for (int i=0; i<=6; i++) {
				if (i==0) {
					System.out.println("First Output: " + i);
				}
				else {
					System.out.println("Executor: " + i);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
			 System.out.println("Executor Complete");
		}

}

