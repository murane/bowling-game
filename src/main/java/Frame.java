import java.util.*;

public class Frame {

    private static final int INITIAL_PIN_CNT = 10;
    private static final int INITIAL_TRIAL_CNT = 2;
    private final Count pinCnt;
    private final Count trialCnt;
    private List<Integer> rolls = new ArrayList<>();

    public Frame() {
        this.pinCnt = new Count(INITIAL_PIN_CNT);
        this.trialCnt = new Count(INITIAL_TRIAL_CNT);
    }

    public int getPinCnt() {
        return pinCnt.getValue();
    }

    public int getTrialCnt() {
        return trialCnt.getValue();
    }

    public boolean isSpare() {
        return pinCnt.getValue() == 0 || trialCnt.getValue() == 0;
    }

    public boolean isStrike() {
        return pinCnt.getValue() == 0 || trialCnt.getValue() == 1;
    }

    private boolean isEnd() {
        if (pinCnt.getValue() == 0 || trialCnt.getValue() == 0) {
            return true;
        }
        return false;
    }

    public void doFrame() {
        while (!isEnd()) {
            doRoll();
        }
    }

    public void doRoll() {
        int downPinCnt = generateRandomNumber(pinCnt.getValue());
        pinCnt.minus(downPinCnt);
        trialCnt.minus(1);
        rolls.add(downPinCnt);
    }

    private int generateRandomNumber(int num) {
        Random random = new Random();
        return random.nextInt(num + 1);
    }

}
