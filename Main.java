public class Main {
    public static void main(String[] args) {
        GraphWrapper graphWrapper = new GraphWrapper();

        GraphNode homeNode = graphWrapper.getHome();
        System.out.println("Home node ID: " + homeNode.getId());

        if (homeNode.hasNorth()) {
            System.out.println("Home node has a North neighbor with ID: " + homeNode.getNorth().getId() + " and weight: " + homeNode.getNorthWeight());
        }
        if (homeNode.hasSouth()) {
            System.out.println("Home node has a South neighbor with ID: " + homeNode.getSouth().getId() + " and weight: " + homeNode.getSouthWeight());
        }
        if (homeNode.hasEast()) {
            System.out.println("Home node has an East neighbor with ID: " + homeNode.getEast().getId() + " and weight: " + homeNode.getEastWeight());
        }
        if (homeNode.hasWest()) {
            System.out.println("Home node has a West neighbor with ID: " + homeNode.getWest().getId() + " and weight: " + homeNode.getWestWeight());
        }
    }
}
