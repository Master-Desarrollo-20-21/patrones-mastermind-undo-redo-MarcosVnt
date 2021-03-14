package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class ProposalController extends Controller {

	//Mejor proponer y clase GameCOntroller
	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;

	public ProposalController(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);

	}

	public Error addProposedCombination(List<Color> colors) {

		// delegar en ACtion y retornar ..
		return this.actionController.addProposedCombination(colors);	


		/* Error error = null;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}				
			}
		}
		if (error == null){
			this.game.addProposedCombination(colors);
			if (this.game.isWinner() || this.game.isLooser()) {
				this.state.next();
			}
		}
		return error;	 */
	}

	public boolean isWinner() {
		return this.actionController.isWinner();
	}

	public boolean isLooser() {
		return this.actionController.isLooser();
	}
	
	public int getAttempts() {
		return this.actionController.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.actionController.getColors(position);
	}

	public int getBlacks(int position) {
		return this.actionController.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.actionController.getWhites(position);
	}


	
	public void undo() {
		this.undoController.undo();
	}

	public boolean isUndoable() {
		return this.undoController.isUndoable();
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean isRedoable() {
		return this.redoController.isRedoable();
	}
	



	
	//tecnica doble despacho
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
