package game.main;

import game.entities.*;
import game.mechanics.*;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do herói: ");
        Player player = new Player(sc.nextLine());

        Map map = new Map();
        map.showLocations();

        // Demo: adicionar item e usar
        Item potion = new Item("Poção de Vida", "potion", 20);
        player.getInventory().addItem(potion);
        potion.applyEffect(player);

        // Inimigo de teste
        Enemy goblin = new Enemy("Goblin", 50, 10, 3);
        Battle.fight(player, goblin);
    }
}
