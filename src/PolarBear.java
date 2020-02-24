public class PolarBear extends Bear {
    private int POLAR_BEAR_SPEED;

    public PolarBear(int POLAR_BEAR_SPEED) {
        this.POLAR_BEAR_SPEED = POLAR_BEAR_SPEED;
    }

    @Override
    public String toString() {
        return "PolarBear{" +
                "POLAR_BEAR_SPEED=" + POLAR_BEAR_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.POLAR_BEAR_SPEED;
    }
}
