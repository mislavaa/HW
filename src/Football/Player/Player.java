package Football.Player;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 10;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    Random rand = new Random();

    private Player() {
        this.stamina = rand.nextInt(9, MAX_STAMINA + 1);
    }

    public int getStamina() {
        return stamina;
    }

    public static Player addPlayer() {
        if (countPlayers < 6) {
            ++countPlayers;
            System.out.println("Игрок вышел на поле, количество игроков на поле: " + countPlayers);
            return new Player();
        } else {
            System.out.println("Игрок не сможет выйти на поле, нет свободных мест");
            return null;
        }
    }

    public void run() {
        if (countPlayers == 6) {
            --stamina;
            if (stamina <= MAX_STAMINA && stamina > MIN_STAMINA) {
                System.out.println("Игрок побежал, выносливость: " + stamina);
            } else if (stamina == MIN_STAMINA) {
                System.out.println("Выносливость игрока: " + stamina + ", он уходит с поля, количество игроков на поле: "
                        + --countPlayers);
            } else if (stamina < MIN_STAMINA) {
                System.out.println("Игрок уже ушёл с поля");
            }
        } else if (countPlayers < 6) {
            System.out.println("Игра не начнётся, пока на поле не выйдут все игроки");
        }
    }

    public static void info() {
        if (countPlayers < 6 && countPlayers >= 0) {
            System.out.println("Команды неполные, на поле ещё есть " + (6 - countPlayers) + " свободных мест");
        } else if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        }
    }
}