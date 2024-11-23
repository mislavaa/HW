package Football;

import Football.Player.Game;
import Football.Player.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.addPlayer("Player 1");
        game.addPlayer("Player 2");
        game.addPlayer("Player 3");

        System.out.println(game);
        game.info();

        game.addPlayer("Player 4");
        game.addPlayer("Player 5");
        System.out.println(game);

        game.addPlayer("Player 6");
        System.out.println(game);

        game.addPlayer("Player 7");
        System.out.println(game);

        game.checkPlayer(new Player("player 1"));
        game.checkPlayer(new Player("Player 7"));

        game.info();

        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        game.getPlayers(5).run();
        System.out.println(game);

        game.addPlayer("Player 9");
        System.out.println(game);

        game.getPlayers(0).run();
        game.getPlayers(0).run();
        game.getPlayers(0).run();
        game.getPlayers(0).run();
        game.getPlayers(0).run();
        System.out.println(game);
        game.getPlayers(0).run();
        game.getPlayers(0).run();
        game.getPlayers(0).run();
        game.getPlayers(0).run();
        game.getPlayers(0).run();

        System.out.println(game);
    }
}