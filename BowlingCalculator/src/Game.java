public class Game {
    private Frame[] frames;
    private int round = 0;
    private int[] bonus = {0, 0};

    public Game() {
        frames = new Frame[10];
        //array init
        for(int i=0; i< this.frames.length; i++){
            this.frames[i] = new Frame();
        }
    }

    public Frame[] getAllFrames() {
        return frames;
    }

    public int getGameScore(){
        int gameScore = 0;
        for(int i=0; i < this.frames.length;i++){
            if(this.frames[i].getFirstThrow() == 10) {
                if(i < this.frames.length - 1) {
                    if(this.frames[i + 1].getFirstThrow() == 10) {
                        if((i + 2) < this.frames.length) {
                            int score = 20;
                            score += this.frames[i + 2].getFirstThrow();
                            gameScore += score;
                        } else {
                            gameScore += 20 + this.bonus[0];
                        }

                    } else {
                        int score = 10;
                        score += this.frames[i + 1].countTotalScore();
                        gameScore += score;
                    }
                } else {
                    int score = 10;
                    score += this.bonus[0] + this.bonus[1];
                    gameScore += score;
                }
            } else if (this.frames[i].countTotalScore() == 10) {
                if(i < this.frames.length - 1) {
                    int score = 10;
                    score += this.frames[i + 1].getFirstThrow();
                    gameScore += score;
                } else {
                    int score = 10;
                    score += this.bonus[0];
                    gameScore += score;
                }
            } else {
                gameScore +=this.frames[i].countTotalScore();
            }
        }
        return gameScore;
    }

    public void setGameRoundFrameScore(int [] arr){
        this.frames[round].addThrow(arr[0]);
        this.frames[round].addThrow(arr[1]);
        round++;
    }

    public void setGameRoundBonusScore(int[] bonus) {
        this.bonus = bonus;
    }
}
