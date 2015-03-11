package br.ufc.quixada.versao02;

import java.util.concurrent.ScheduledThreadPoolExecutor;



public class DoTwoThings {
	
	ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
	CountDownClock  clock = new CountDownClock();
	
	public DoTwoThings() {
		pool.execute(clock);
		pool.execute(clock);
		pool.shutdown();
	}
	
	
	public static void main(String[] args) {
		new DoTwoThings();
		
	}
}
