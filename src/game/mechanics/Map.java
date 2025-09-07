package game.mechanics;

public class Map {
    private final String[] locations = {"Vila", "Floresta", "Masmorra"};
    public void showLocations() {
        System.out.println("Locais:");
        for (String l : locations) System.out.println("- " + l);
    }
}
