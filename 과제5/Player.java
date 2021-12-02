package uk.epl.player;

public abstract class Player {
    private String name;
    private int jerseyNumber;

    private int[] abilities = new int[3];
    final int SPEED = 0, STAMINA = 1, PASSING = 2;

    Position position;

    public class Position {
        public int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Player(String name, int jerseyNumber, int speed, int stamina, int passing) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.abilities[SPEED] = speed;
        this.abilities[STAMINA] = stamina;
        this.abilities[PASSING] = passing;
        this.position = new Position(0, 0);
    }

    public void setPosition(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return new Position(position.x, position.y);
    }

    public void moveUp() {
        float move_delta = getMoveDelta();
        position.y = (int) (position.y - move_delta);
        decreaseStamina();
    }

    public void moveDown() {
        float move_delta = getMoveDelta();
        position.y = (int) (position.y + move_delta);
        decreaseStamina();
    }

    public void moveLeft() {
        float move_delta = getMoveDelta();
        position.x = (int) (position.x - move_delta);
        decreaseStamina();
    }

    public void moveRight() {
        float move_delta = getMoveDelta();
        position.x = (int) (position.x + move_delta);
        decreaseStamina();
    }

    private void decreaseStamina() {
        abilities[STAMINA] = (int) (abilities[STAMINA] - 2);
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPositionName() {
        return null;
    }

    private float getMoveDelta() {
        return 1 + getSpeed() / 100 * getStamina() / 100;
    }

    protected float getStamina() {
        return (float) abilities[STAMINA];
    }

    protected float getSpeed() {
        return (float) abilities[SPEED];
    }

    protected float getPassing() {
        return (float) abilities[PASSING];
    }
}
