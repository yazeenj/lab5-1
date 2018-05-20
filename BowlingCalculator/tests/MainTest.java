import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    /**
     *      1. Frame
     */

    @Test
    public void frame() {
        Frame frame = new Frame();
        frame.addThrow(3);
        frame.addThrow(5);
        int firstThrow = frame.getFirstThrow();
        int secondThrow = frame.getSecondThrow();
        assertEquals(3, firstThrow);
        assertEquals(5, secondThrow);
    }

    /**
     *      2. Frame Score
     */

    @Test
    public void frameScore() {
        Frame frame = new Frame();
        frame.addThrow(3);
        frame.addThrow(5);
        int result = frame.countTotalScore();
        assertEquals(8, result);
    }

    /**
     *      3. Game
     */

    @Test
    public void game() {
        Game game = new Game();
        Frame frameArr[] = game.getAllFrames();
        assertEquals(10, frameArr.length);
    }

    /**
     *      4. Game Score
     */
    @Test
    public void gameScore(){
        Game game = new Game();
        int [] arr = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        int[] scorearr = {0, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        int result = game.getGameScore();
        assertEquals(81, result);
    }

    /**
     *      5. Strike
     */
    @Test
    public void strike() {
        Game game = new Game();
        int [] arr = {10, 0, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        int[] scorearr = {0, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        int result = game.getGameScore();
        assertEquals(94, result);
    }

    /**
     *      6. Spare
     */
    @Test
    public void spare() {
        Game game = new Game();
        int [] arr = {1, 9, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        int[] scorearr = {0, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        int result = game.getGameScore();
        assertEquals(88, result);
    }

    /**
     *      7. Strike and spare
     */
    @Test
    public void strikeAndSpare() {
        Game game = new Game();
        int [] arr = {10, 0, 4, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        int[] scorearr = {0, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        int result = game.getGameScore();
        assertEquals(103, result);
    }

}