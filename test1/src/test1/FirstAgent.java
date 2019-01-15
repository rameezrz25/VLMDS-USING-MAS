package test1;

import jade.core.Agent;

public class FirstAgent extends Agent{

	@Override
	protected void setup() {
		System.out.println("Hello jade");
		System.out.println("i am the first agent");
		//doDelete();
	}
}
