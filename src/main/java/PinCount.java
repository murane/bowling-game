public class PinCount {
    int count;

    public PinCount(int count) {
        this.count = count;
        checkRange();
    }

    public int getValue() {
        return count;
    }

    public void minus(int num) {
        count -= num;
        checkRange();
    }

    private void checkRange() {
        if(count < 0) {
            throw new IllegalStateException("PinCount can't be negative integer.");
        }
    }

}
