package ca.jotto.model.listeners;

import ca.jotto.model.JMatch;
import ca.jotto.model.Jotto;

/**
 * The listener interface for receiving match and player game events.
 */
public interface GameListener extends JottoListener {

    /**
     * Invoked when a match is started.
     *
     * @param jotto The jotto game referenced.
     * @param match The current game match.
     */
    void onMatchStart(Jotto jotto, JMatch match);

    /**
     * Invoked when a match is over.
     *
     * @param jotto The jotto game referenced.
     * @param match The current game match.
     */
    void onMatchOver(Jotto jotto, JMatch match);

    /**
     * Invoked when a player has yielded.
     *
     * @param jotto The jotto game referenced.
     * @param match The current game match.
     */
    void onPlayerYield(Jotto jotto, JMatch match);

    /**
     * Invoked when the player wins.
     *
     * @param jotto The jotto game referenced.
     * @param match The current game match.
     */
    void onPlayerWin(Jotto jotto, JMatch match);

    /**
     * Invoked when the player loses.
     *
     * @param jotto The jotto game referenced.
     * @param match The current game match.
     */
    void onPlayerLoss(Jotto jotto, JMatch match);
}
