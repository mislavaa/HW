package Football.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {
    protected static int playerCount;
    protected static final int MAX_COUNT = 6;
    protected static List<Player> players = new ArrayList<>();

    public void addPlayer(String name) {
        if (playerCount < MAX_COUNT) {
            ++playerCount;
            Player newPlayer = new Player(name);
            players.add(newPlayer);
            System.out.println("Игрок " + name + " вышел на поле, количество игроков на поле: " + playerCount);
        } else {
            System.out.println("Игрок " + name + " не сможет выйти на поле, нет свободных мест");
        }
    }

    public Player getPlayers(int a) {
        if (a < players.size()) {
            return players.get(a);
        } else {
            return players.get(a - 1);
        }
    }

    public void checkPlayer(Player player) {
        String message = "";
        for (Player listPlayer : players) {
            if (listPlayer.getName().equalsIgnoreCase(player.getName())) {
                message = "Игрок " + player.getName() + " есть в списке";
                break;
            } else {
                message = player.getName() + " - такого игрока нет в списке";

            }
        }
        System.out.println(message);
    }

    protected void removePlayer(Player player) {
        players.remove(player);
    }

    @Override
    public String toString() {
        return "Game{" +
                "players = " + players +
                '}';
    }

    public void info() {
        if (playerCount < MAX_COUNT && playerCount >= 0) {
            System.out.println("Команды неполные, на поле ещё есть " + (MAX_COUNT - playerCount) + " свободных мест");
        } else if (playerCount >= MAX_COUNT) {
            System.out.println("На поле нет свободных мест");
        }
    }
}
