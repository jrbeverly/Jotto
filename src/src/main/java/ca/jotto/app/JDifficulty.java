package ca.jotto.app;

/**
 * The difficulty level as perceived by the application.
 */
public enum JDifficulty {
    /**
     * The easy difficulty setting.
     */
    Easy(0),
    /**
     * The normal difficulty setting.
     */
    Normal(1),
    /**
     * The hard difficulty setting.
     */
    Hard(2);

    private final int _level;

    /**
     * Initializes a difficulty with a specialized level.
     *
     * @param level The level as defined by an Integer.
     */
    JDifficulty(int level) {
        _level = level;
    }

    /**
     * Gets a numeric value representing the level.
     *
     * @return The difficulty level.
     */
    public int getLevel() {
        return _level;
    }
}