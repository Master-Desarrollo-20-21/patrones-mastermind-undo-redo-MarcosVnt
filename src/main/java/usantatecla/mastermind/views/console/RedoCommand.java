package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;

public class RedoCommand extends Command {
    RedoCommand(ProposalController proposalController) {
        super(MessageView.REDO_COMMAND.getMessage(), proposalController);
      }
    
      @Override
      protected void execute() {
        this.proposalController.redo();
      }
    
      @Override
      protected boolean isActive() {
        return this.proposalController.isRedoable();
      }
}
