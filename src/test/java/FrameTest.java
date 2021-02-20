
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FrameTest {
    @Test
    void testRoll() {
        Frame frame = new Frame();
        int initialPinCnt = frame.getPinCnt();
        frame.doRoll();
        int currentPinCnt = frame.getPinCnt();
        Assertions.assertTrue(0 <= currentPinCnt && currentPinCnt <= initialPinCnt);
    }

    @Test
    void testTrial() {
        Frame frame = new Frame();
        frame.doRoll();
        assertEquals(frame.getTrialCnt(), 1);
    }
}