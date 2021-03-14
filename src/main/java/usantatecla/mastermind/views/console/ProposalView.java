package usantatecla.mastermind.views.console;

import java.util.List;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.views.console.ErrorView;
import usantatecla.utils.WithConsoleView;
import usantatecla.mastermind.views.MessageView;

class ProposalView extends WithConsoleView {
    void interact(ProposalController proposalController) {
        new ProposalMenu(proposalController).execute();
        new GameView(proposalController).write();
    }
	void interacts(ProposalController proposalController) {
}

}
