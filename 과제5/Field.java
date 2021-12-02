package uk.epl.game;

import uk.epl.player.Defender;
import uk.epl.player.Forward;
import uk.epl.player.Midfielder;
import uk.epl.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player player) {
        players.add(player);
    }

    public void start() {
        for (Player val : players) {
            if (val.getClass() == Forward.class) val.setPosition(34, 25);
            else if (val.getClass() == Midfielder.class) val.setPosition(34, 50);
            else if (val.getClass() == Defender.class) val.setPosition(34, 75);
        }
    }

    public void info() {
        for (Player val : players) {
            System.out.println(val);
        }
    }

    public void stop() {
        players.removeAll(players);
    }

    public void moveUp(int jerseyNumber) {
        Player player = null;
        for (Player val : players) {
            if (jerseyNumber == val.getJerseyNumber()) {
                player = val;
                break;
            }
        }
        if (player == null)
            throw new NullPointerException("No Player");
        else player.moveUp();
    }

    public void moveDown(int jerseyNumber) {
        Player player = null;
        for (Player val : players) {
            if (jerseyNumber == val.getJerseyNumber()) {
                player = val;
                break;
            }
        }
        if (player == null)
            throw new NullPointerException("No Player");
        else player.moveDown();
    }

    public void moveLeft(int jerseyNumber) {
        Player player = null;
        for (Player val : players) {
            if (jerseyNumber == val.getJerseyNumber()) {
                player = val;
                break;
            }
        }
        if (player == null)
            throw new NullPointerException("No Player");
        else player.moveLeft();
    }

    public void moveRight(int jerseyNumber) {
        Player player = null;
        for (Player val : players) {
            if (jerseyNumber == val.getJerseyNumber()) {
                player = val;
                break;
            }
        }
        if (player == null)
            throw new NullPointerException("No Player");
        else player.moveRight();
    }
}
