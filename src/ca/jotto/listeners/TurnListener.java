package ca.jotto.listeners;

import ca.jotto.core.JGuess;
import ca.jotto.core.Jotto;

/**
 * The listener interface for receiving turn game events. The class that is
 * interested in processing an game event implements this interface, and the
 * object created with that class is registered with a JottoEventMap, using the
 * component's addListener method. When the action event occurs, that object's
 * event method is invoked.
 */
public interface TurnListener extends JottoListener {

	/**
	 * Invoked when a player guess was incorrect.
	 * 
	 * @param jotto
	 *            the jotto game referenced.
	 * @param guess
	 *            The guess that the player submitted.
	 */
	void onTurnIncorrect(Jotto jotto, JGuess guess);

	/**
	 * Invoked when a player guess was correct.
	 * 
	 * @param jotto
	 *            the jotto game referenced.
	 * @param guess
	 *            The guess that the player submitted.
	 */
	void onTurnCorrect(Jotto jotto, JGuess guess);

	/**
	 * Invoked when a player guesses.
	 * 
	 * @param jotto
	 *            the jotto game referenced.
	 * @param guess
	 *            The guess that the player submitted.
	 */
	void onTurnGuess(Jotto jotto, JGuess guess);
}