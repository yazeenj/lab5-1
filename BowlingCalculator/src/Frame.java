public class Frame {
    private int[] throwScores;
    private int currentThrow;

    public Frame() {
        this.throwScores = new int[2];
        this.currentThrow = 0;
    }

    public void addThrow(int throwScore) {
        if (this.currentThrow < 2) {
            this.throwScores[currentThrow] = throwScore;
            this.currentThrow++;
        }
    }

    public int getFirstThrow() {
        int returnValue = -1;
        if (this.currentThrow > 0) {
            returnValue = this.throwScores[0];
        }
        return returnValue;
    }

    public int getSecondThrow() {
        int returnValue = -1;
        if (this.currentThrow > 1) {
            returnValue = this.throwScores[1];
        }
        return returnValue;
    }

    public int countTotalScore() {
        return this.throwScores[0] + this.throwScores[1];
    }
}
