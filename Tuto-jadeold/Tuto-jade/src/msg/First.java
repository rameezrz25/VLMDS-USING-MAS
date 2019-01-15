package msg;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.*;

public class First extends Agent {

	@Override
	protected void setup()
	{
		addBehaviour(new OneShotBehaviour() {
			int a = 10;
			@Override
			public void action() {
				ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
				msg.setContent(Integer.toString(a));
				msg.addReceiver(new AID("second",AID.ISLOCALNAME));
				send(msg);
				
			}
		});
	}
}
