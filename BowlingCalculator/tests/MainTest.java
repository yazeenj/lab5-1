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

}