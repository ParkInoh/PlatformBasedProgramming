package uk.epl.player;

public class Defender extends Player {
    private int STRENGTH_POINT = 10;
    private String positionName = "Defender";

    @Override
    protected float getStamina() {
        return super.getStamina() + STRENGTH_POINT;
    }

    @Override
    public String getPositionName() {
        return positionName;
    }

    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing) {
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
