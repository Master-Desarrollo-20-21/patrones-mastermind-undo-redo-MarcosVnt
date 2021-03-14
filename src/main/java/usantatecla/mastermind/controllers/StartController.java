package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.State;

public class StartController extends Controller implements AcceptController{

	public StartController(Session session) {
		super(session);
	}
	
	public void start() {
		this.session.next();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
