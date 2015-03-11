package br.ufc.quixada.versao01;

public class LaunchEvent implements Runnable {
	private int start;
	private String message;
	ITimeMonitor tm;
	
	public LaunchEvent(int start, String message, ITimeMonitor monitor)	{
		this.start = start;
		this.message = message;
		this.tm = monitor;
	}
	@Override
	public void run() {
		/*boolean eventDone = false;
		while (!eventDone){
			try{
				Thread.sleep(10);
			}
			catch (InterruptedException e){}
			if (tm.getTime() <= start){
				System.out.println(this.message);
				eventDone = true;
			}
		}*/
				
				boolean done = false;
				boolean abort = false;
				while(!done){
				// do the thread’s work here
				// set done to true when finished
				try{
					Thread.sleep(100); // sleep a bit
				}
				catch(InterruptedException e){
				abort = true;
				}
				if (tm.getTime() <= start){
					System.out.println(this.message);
					done = true;
					System.out.println("ABORT!!!!");
					tm.abortCountDown();
				}
				if (Thread.interrupted())
				abort = true;
				if (abort)
				break;
				}

	}

}
