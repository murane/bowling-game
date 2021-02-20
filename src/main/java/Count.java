public class Count {

    int count;

    public Count(int count) {
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
        if (count < 0) {
            throw new IllegalStateException("PinCount can't be negative integer.");
        }
    }

}
