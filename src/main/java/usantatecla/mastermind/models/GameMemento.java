package usantatecla.mastermind.models;

import java.util.List;

public class GameMemento {

	private ProposedCombination proposedCombination;

	private Result result;

    private int attempts;
    
    //conoce combinaciones propuestas  y devuelve resultado .. 
  
    GameMemento(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
		this.proposedCombination = proposedCombinations.get(attempts).copy();
        
        this.result = results.get(attempts).copy();
        this.attempts = attempts;
    }
  
    ProposedCombination getproposedCombination() {
      return this.proposedCombination;
    }
  
    Result getResult() {
      return this.result;
    }

	public int getAttempts() {
		return this.attempts;
	}
}
