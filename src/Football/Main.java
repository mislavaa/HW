package Football;

import Football.Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = Player.addPlayer();
        Player.info();

        Player player2 = Player.addPlayer();

        Player player3 = Player.addPlayer();
        if (player3 != null) {
            player3.run();
        }

        Player player4 = Player.addPlayer();

        Player player5 = Player.addPlayer();
        Player.info();

        Player player6 = Player.addPlayer();

        Player player7 = Player.addPlayer();
        Player.info();

        if (player1 != null) {
            player1.run();
            player1.run();
            player1.run();
            player1.run();
            player1.run();
            player1.run();
            player1.run();
            player1.run();
            player1.run();
            player1.run();
        }
        if (player7 != null) {
            player7.run();
        }

        Player player8 = Player.addPlayer();
        Player.info();

        if (player4 != null) {
            player4.run();
            player4.run();
            player4.run();
        }

        if (player1 != null) {
            player1.run();
        }
    }
}