package Football.Player;

import java.util.Random;

public class Player {
    private String name;
    private int stamina;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 10;
    Random rand = new Random();

    public Player(String name) {
        this.name = name;
        this.stamina = rand.nextInt(9, MAX_STAMINA + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void run() {
        if (Game.playerCount == Game.MAX_COUNT) {
            --stamina;
            if (stamina <= MAX_STAMINA && stamina > MIN_STAMINA) {
                System.out.println("Игрок " + name + " побежал, выносливость: " + stamina);
            } else if (stamina == MIN_STAMINA) {
                System.out.println("Выносливость игрока " + name + ": " + stamina + ", он уходит с поля, количество игроков на поле: "
                        + --Game.playerCount);
                Game.players.remove(this);
            }
        } else if (Game.playerCount < 6) {
            System.out.println("Игра не начнётся, пока на поле не выйдут все игроки");
        }
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", stamina=" + stamina;
    }
}