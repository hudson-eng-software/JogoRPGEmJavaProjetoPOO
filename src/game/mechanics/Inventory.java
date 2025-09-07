package game.mechanics;
import game.entities.Item;
import java.util.*;

public class Inventory {
    private final List<Item> items = new ArrayList<>();
    public void addItem(Item item){ items.add(item); System.out.println(item.getName()+" adicionado."); }
    public void showItems(){ items.forEach(i -> System.out.println("- " + i.getName())); }
    public List<Item> getItems(){ return Collections.unmodifiableList(items); }
}

