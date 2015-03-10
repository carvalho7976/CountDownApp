package br.ufc.quixada;

public class CountDownClock extends Thread implements ITimeMonitor {
	private int t;
	
	public CountDownClock(int start) {
		this.t = start;
	}
	public void run(){
		boolean aborted = false;
		for (; t >= 0; t--){
			System.out.println("T minus " + t);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				aborted = true;
			}
			if (Thread.interrupted())
				aborted = true;
				if (aborted){
					System.out.println("Stopping the clock!");
					break;
				}
		}
	}
	public synchronized void abortCountDown()	{
		Thread[] threads = new Thread[Thread.activeCount()];
		Thread.enumerate(threads);
		for(Thread t : threads)
			t.interrupt();
	}

	@Override
	public int getTime() {
		return t;
	}
}
