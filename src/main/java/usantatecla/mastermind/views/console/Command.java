package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

public abstract class Command extends usantatecla.utils.Command {

    protected ProposalController proposalController;




    protected Command(String title, ProposalController proposalController) {
        super(title);
        this.proposalController = proposalController;
    }
    
    
}
