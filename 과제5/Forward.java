package uk.epl.player;

public class Forward extends Player {
    private int ACCELERATION_POINT = 10;
    private String positionName = "Forward";

    @Override
    protected float getSpeed() {
        return super.getSpeed() + ACCELERATION_POINT;
    }

    @Override
    public String getPositionName() {
        return positionName;
    }

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    public String toString() {
        return String.format("Player Name='%s, JerseyNumber=%d Position (%d, %d) " +
                        "%s SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                getName(), getJerseyNumber(), getPosition().x, getPosition().y,
                getPositionName(), getSpeed(), getStamina(), getPassing());
    }
}
