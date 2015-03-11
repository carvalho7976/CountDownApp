package br.ufc.quixada.versao02;

public class CountDownClockNew implements Runnable {
	private int t;
	public CountDownClockNew(int t) {
		this.t = t;
	}
	
	@Override
	public synchronized void  run() {
		System.out.println("T  menos " + t);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
