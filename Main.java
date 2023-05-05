// Name 
// Email


/**
 * Main class to demonstrate the usage of GraphWrapper and GraphNode classes.
 */
public class Main {
    /**
     * The main method to run the program.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a GraphWrapper object.
        GraphWrapper graphWrapper = new GraphWrapper();

        // Get the home node from the GraphWrapper object.
        GraphNode homeNode = graphWrapper.getHome();
        System.out.println("Home node ID: " + homeNode.getId());

        // Check and display the North neighbor of the home node, if present.
        if (homeNode.hasNorth()) {
            System.out.println("Home node has a North neighbor with ID: " + homeNode.getNorth().getId() + " and weight: " + homeNode.getNorthWeight());
        }
        // Check and display the South neighbor of the home node, if present.
        if (homeNode.hasSouth()) {
            System.out.println("Home node has a South neighbor with ID: " + homeNode.getSouth().getId() + " and weight: " + homeNode.getSouthWeight());
        }
        // Check and display the East neighbor of the home node, if present.
        if (homeNode.hasEast()) {
            System.out.println("Home node has an East neighbor with ID: " + homeNode.getEast().getId() + " and weight: " + homeNode.getEastWeight());
        }
        // Check and display the West neighbor of the home node, if present.
        if (homeNode.hasWest()) {
            System.out.println("Home node has a West neighbor with ID: " + homeNode.getWest().getId() + " and weight: " + homeNode.getWestWeight());
        }
    }
}
