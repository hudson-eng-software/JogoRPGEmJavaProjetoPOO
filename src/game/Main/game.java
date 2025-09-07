package game.Main;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your hero's name: ");
        String name = sc.nextLine();

        Player player = new Player(name);
        Enemy goblin = new Enemy("Goblin", 50, 10, 3);

        Map map = new Map();
        map.showLocations();

        Battle.fight(player, goblin);
    }
}
