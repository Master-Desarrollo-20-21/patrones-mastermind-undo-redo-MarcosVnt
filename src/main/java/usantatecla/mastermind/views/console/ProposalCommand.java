package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;

public class ProposalCommand extends Command{

	public ProposalCommand(ProposalController proposalController) {
        super(MessageView.PROPOSED_COMBINATION.getMessage(), proposalController);
	}

    @Override
    protected void execute() {
		this.proposalController.propose();

	}

    @Override
    protected boolean isActive() {
        return true;
    }
    
}
