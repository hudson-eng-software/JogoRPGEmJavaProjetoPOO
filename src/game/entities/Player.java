package game.entities;

import game.mechanics.Inventory;

public class Player extends Character {
    public Inventory inventory = new Inventory();
    public Player(String name){
        super(name,100,15,5);

    }

    @Override
    public void attack(Character target) {
        int damage = Math.max(0, this.attack - target.defense);
        target.health -= damage;

        System.out.println(name + " atacou " + target.name + " causando " + damage);

    }
    public Inventory getInventory() { return inventory; }
}


