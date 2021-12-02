package uk.epl.player;

public class Midfielder extends Player {
    private int PASSING_POINT = 10;
    private String positionName = "Midfielder";

    @Override
    protected float getPassing() {
        return super.getPassing() + PASSING_POINT;
    }

    @Override
    public String getPositionName() {
        return positionName;
    }

    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
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
