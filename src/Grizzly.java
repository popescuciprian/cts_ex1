public class Grizzly extends Bear {
    private int GRIZZLY_SPEED;

    public Grizzly(int GRIZZLY_SPEED) {
        this.GRIZZLY_SPEED = GRIZZLY_SPEED;
    }

    @Override
    public String toString() {
        return "Grizzly{" +
                "GRIZZLY_SPEED=" + GRIZZLY_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.GRIZZLY_SPEED;
    }
}
