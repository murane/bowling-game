import java.util.Random;

public class Frame {
    private static final int INITIAL_PIN_CNT = 10;
    private final PinCount pinCnt;

    public Frame() {
        this.pinCnt = new PinCount(INITIAL_PIN_CNT);
    }

    public int getPinCnt() {
        return pinCnt.getValue();
    }

    public void doRoll() {
        int downPinCnt = generateRandomNumber(pinCnt.getValue());
        pinCnt.minus(downPinCnt);
    }

    private int generateRandomNumber(int num) {
        Random random = new Random();
        return random.nextInt(num + 1);
    }
}
