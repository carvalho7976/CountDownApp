package br.ufc.quixada.versao02;

public class CountDownClock extends Thread{
	
	@Override
	public synchronized void run() {
		for (int t = 20; t >= 0; t--) {
			System.out.println("T menos " + t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
