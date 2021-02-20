
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
}