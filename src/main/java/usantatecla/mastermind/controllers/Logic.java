package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.models.StateValue;
import usantatecla.mastermind.models.Session;


public class Logic {
	
	private Session session;

	
	private Map<StateValue, Controller> controllers;
		
	public Logic() {
		
		this.session = new Session();

		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
		this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.game, this.state));
		this.controllers.put(StateValue.EXIT, null);
	}
	
	public AcceptController getController() {
		return this.controllers.get(this.session.getValueState());
	}
	
}
