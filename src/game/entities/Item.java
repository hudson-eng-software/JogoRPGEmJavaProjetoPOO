package game.entities;

public class Item {
    private String name, type; // "potion", "weapon" (futuro)
    private int power;
    public Item(String name, String type, int power) {
        this.name = name; this.type = type; this.power = power;
    }
    public void applyEffect(Player player) {
        if ("potion".equals(type)) {
            player.health += power;
            System.out.println(player.name + " recuperou " + power + " HP!");
        }
    }
    public String getName() { return name; }
}
