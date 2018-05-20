public class Game {
    private Frame[] frames;
    private int round = 0;

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
            gameScore +=this.frames[i].countTotalScore();
        }
        return gameScore;
    }

    public void setGameRoundFrameScore(int [] arr){
        this.frames[round].addThrow(arr[0]);
        this.frames[round].addThrow(arr[1]);
        round++;
    }
}
