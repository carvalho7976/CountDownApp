package br.ufc.quixada;

import java.util.ArrayList;

public class CountDownApp {
	public static void main(String[] args)	{
		/*Thread clock = new CountDownClock();
		
		Runnable flood, ignition, liftoff;
		
		flood = new LaunchEvent(16, "Flood the pad!");
		ignition = new LaunchEvent(6, "Start engines!");
		liftoff = new LaunchEvent(0, "Liftoff!");
		
		
		clock.start();
		new Thread(flood).start();
		new Thread(ignition).start();
		new Thread(liftoff).start();
		*/
		//Thread clock = new CountDownClock();
		
		CountDownClock clock = new CountDownClock(20);
		ArrayList<Runnable> events
		= new ArrayList<Runnable>();
		events.add(new LaunchEvent(16, "Flood the pad!", clock));
		events.add(new LaunchEvent(6, "Start engines!", clock));
		events.add(new LaunchEvent(0, "Liftoff!", clock));
		clock.start();
		
		for (Runnable e : events){
			new Thread(e).start();	
		}
	}
}
