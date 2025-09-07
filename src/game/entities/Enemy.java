package game.entities;

public class Enemy extends Character {
    public Enemy(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }

    @Override
    public void attack(Character target) {
        int damage = Math.max(0, this.attack - target.defense);
        target.health -= damage;
        System.out.println(name + " atingiu " + target.name + " por " + damage);
    }

}
