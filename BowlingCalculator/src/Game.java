public class Game {
    private Frame[] frames;

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

    public void setGameFrameScore(int [] arr){
        int arrCount = 0;
        for(int i=0; i< this.frames.length; i++){
            this.frames[i].addThrow(arr[arrCount]);
            this.frames[i].addThrow(arr[arrCount+1]);
            arrCount+=2;
        }
    }
}
