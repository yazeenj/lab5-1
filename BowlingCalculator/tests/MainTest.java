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

    /**
     *      8. Multiple strike
     */
    @Test
    public void multipleStrikes() {
        Game game = new Game();
        int [] arr = {10, 0, 10, 0, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        int[] scorearr = {0, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        int result = game.getGameScore();
        assertEquals(112, result);
    }

    /**
     *      9. Multiple spares
     */
    @Test
    public void multipleSpares() {
        Game game = new Game();
        int [] arr = {8, 2, 5, 5, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        int[] scorearr = {0, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        int result = game.getGameScore();
        assertEquals(98, result);
    }

    /**
     *      10. Spare as a last frame
     */
    @Test
    public void spareAsALastFrame() {
        Game game = new Game();
        int [] arr = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 8};
        int[] scorearr = {0, 0};
        int[] bonus = {7, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        game.setGameRoundBonusScore(bonus);
        int result = game.getGameScore();
        assertEquals(90, result);

    }

    /**
     *      11. Strike as a last frame
     */
    @Test
    public void strikeAsALastFrame() {
        Game game = new Game();
        int [] arr = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 10, 0};
        int[] scorearr = {0, 0};
        int[] bonus = {7, 2};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        game.setGameRoundBonusScore(bonus);
        int result = game.getGameScore();
        assertEquals(92, result);
    }

    /**
     *      12. Bonus is a strike
     */
    @Test
    public void bonusIsAStrike() {
        Game game = new Game();
        int [] arr = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 8};
        int[] scorearr = {0, 0};
        int[] bonus = {10, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        game.setGameRoundBonusScore(bonus);
        int result = game.getGameScore();
        assertEquals(93, result);
    }

    /**
     *      13. Best score
     */
    @Test
    public void bestScore() {
        Game game = new Game();
        int [] arr = {10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        int[] scorearr = {0, 0};
        int[] bonus = {10, 10};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        game.setGameRoundBonusScore(bonus);
        int result = game.getGameScore();
        assertEquals(300, result);
    }

    /**
     *      14. Real game
     */
    @Test
    public void realGame() {
        Game game = new Game();
        int [] arr = {6, 3, 7, 1, 8, 2, 7, 2, 10, 0, 6, 2, 7, 3, 10, 0, 8, 0, 7, 3};
        int[] scorearr = {0, 0};
        int[] bonus = {10, 0};
        for(int i = 0; i < 10; i++) {
            scorearr[0] = arr[2 * i];
            scorearr[1] = arr[2 * i + 1];
            game.setGameRoundFrameScore(scorearr);
        }
        game.setGameRoundBonusScore(bonus);
        int result = game.getGameScore();
        assertEquals(135, result);
    }
}