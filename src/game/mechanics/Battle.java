package game.mechanics;
import game.entities.*;

public class Battle {
    public static void fight(Player player, Enemy enemy) {
        System.out.println("⚔️ " + player.name + " vs " + enemy.name);
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (!enemy.isAlive()) { System.out.println(enemy.name + " caiu!"); break; }
            enemy.attack(player);
            if (!player.isAlive()) { System.out.println(player.name + " foi derrotado!"); }
        }
    }
}

