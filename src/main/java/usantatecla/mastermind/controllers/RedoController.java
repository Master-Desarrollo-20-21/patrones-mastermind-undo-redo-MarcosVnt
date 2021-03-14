package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends Controller {
    
    RedoController(Session session) {
        super(session);
      }
    
      void redo() {
        this.session.redo();
      }
    
      boolean isRedoable() {
        return this.session.isRedoable();
      }
}
