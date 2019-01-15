package tuto.first;

import java.util.Random;

import jade.core.Agent;

public class FirstAgent extends Agent{

	@Override
	protected void setup() {
		System.out.println("Hello jade");
		System.out.println("i am the "+(new Random().nextInt(100))+" agent");
		
		doDelete();
	}
}
