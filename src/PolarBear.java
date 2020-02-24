public class PolarBear extends Bear {
    private final int POLAR_BEAR_SPEED = 80;

    public PolarBear() {
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
