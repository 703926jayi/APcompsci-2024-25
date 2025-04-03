public class C4Result {
    private String winner;
    private String winDirection;
    private int gameNum;
    private static int numGames = 0;
    private int numChips;

    public C4Result(String winner, String winDirection, int numChips) {
        this.winner = winner;
        this.winDirection = winDirection;
        this.gameNum = numGames++;
        this.numChips = numChips;
    }

    @Override
    public String toString() {
        if (winner.equals("Tie")) {
            return "Connect Four  Game # " + gameNum + "  Tie";
        }
        return "Connect Four  Game # " + gameNum + "  " + winner + " wins " + winDirection + " in " + numChips + " moves.";
    }

    public String getWinner() {
        return winner;
    }

    public int getNumChips() {
        return numChips;
    }
}