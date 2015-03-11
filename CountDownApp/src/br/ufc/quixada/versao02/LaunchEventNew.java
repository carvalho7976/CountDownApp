package br.ufc.quixada.versao02;

public class LaunchEventNew implements Runnable {
	private String message;
	
	public LaunchEventNew(String m) {
		this.message = m;
	}
	
	@Override
	public void run() {
		System.out.println(message);

	}

}
