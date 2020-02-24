public class Wolf implements Runner {

    private int WOLF_SPEED;

    public Wolf(int WOLF_SPEED) {
        this.WOLF_SPEED = WOLF_SPEED;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "WOLF_SPEED=" + WOLF_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.WOLF_SPEED;
    }
}
