// Name 
// Email


import java.util.*;
import java.io.*;

/**
 * GraphNode represents a node in a graph with connections to other nodes in
 * four directions: North, South, East, and West.
 */
public class GraphNode implements Serializable {
    private boolean hasNorth;
    private GraphNode north;
    private int northWeight;
    private boolean hasSouth;
    private GraphNode south;
    private int southWeight;
    private boolean hasEast;
    private GraphNode east;
    private int eastWeight;
    private boolean hasWest;
    private GraphNode west;
    private int westWeight;
    private boolean isGoalNode;
    private String id;

    public int priority;
    public GraphNode previousNode;
    public String previousDirection;

    /**
     * Constructs a new GraphNode with the given ID and goal state.
     *
     * @param id   the unique identifier for this node
     * @param goal true if this node is a goal node, false otherwise
     */
    public GraphNode(String id, boolean goal) {
        this.id = id;
        hasNorth = false;
        hasSouth = false;
        hasWest = false;
        hasEast = false;
        isGoalNode = goal;
    }

    // The following methods should not be used directly

    private void setNorthWeight(int northWeight) {
        this.northWeight = northWeight;
    }

    private void setSouthWeight(int southWeight) {
        this.southWeight = southWeight;
    }

    private void setEastWeight(int eastWeight) {
        this.eastWeight = eastWeight;
    }

    private void setWestWeight(int westWeight) {
        this.westWeight = westWeight;
    }

    // The following methods can be used directly

    /**
     * Sets the node to the north and its weight.
     *
     * @param north  the node to the north
     * @param weight the weight of the connection to the north node
     */
    public void setNorth(GraphNode north, int weight) {
        this.north = north;
        this.hasNorth = true;
        this.setNorthWeight(weight);
    }

    /**
     * Sets the node to the south and its weight.
     *
     * @param south  the node to the south
     * @param weight the weight of the connection to the south node
     */
    public void setSouth(GraphNode south, int weight) {
        this.south = south;
        this.hasSouth = true;
        this.setSouthWeight(weight);
    }

    /**
     * Sets the node to the east and its weight.
     *
     * @param east   the node to the east
     * @param weight the weight of the connection to the east node
     */
    public void setEast(GraphNode east, int weight) {
        this.east = east;
        this.hasEast = true;
        this.setEastWeight(weight);
    }

    /**
     * Sets the node to the west and its weight.
     *
     * @param west   the node to the west
     * @param weight the weight of the connection to the west node
     */
    public void setWest(GraphNode west, int weight) {
        this.west = west;
        this.hasWest = true;
        this.setWestWeight(weight);
    }

    public int getSouthWeight() {
        return southWeight;
    }

    public int getWestWeight() {
        return westWeight;
    }

    public int getEastWeight() {
        return eastWeight;
    }

    public boolean hasNorth() {
        return hasNorth;
	}

	/**
	 * Gets the node to the north.
	 *
	 * @return the north node
	 */
	public GraphNode getNorth() {
		return north;
	}
	
	public boolean hasSouth() {
		return hasSouth;
	}
	
	/**
	 * Gets the node to the south.
	 *
	 * @return the south node
	 */
	public GraphNode getSouth() {
		return south;
	}
	
	public boolean hasEast() {
		return hasEast;
	}
	
	/**
	 * Gets the node to the east.
	 *
	 * @return the east node
	 */
	public GraphNode getEast() {
		return east;
	}
	
	public boolean hasWest() {
		return hasWest;
	}
	
	/**
	 * Gets the node to the west.
	 *
	 * @return the west node
	 */
	public GraphNode getWest() {
		return west;
	}
	
	/**
	 * Checks if this node is a goal node.
	 *
	 * @return true if this node is a goal node, false otherwise
	 */
	public boolean isGoalNode() {
		return isGoalNode;
	}
	
	/**
	 * Gets the ID of this node.
	 *
	 * @return the ID of this node
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Gets the weight of the connection to the north node.
	 *
	 * @return the weight of the connection to the north node
	 */
	public int getNorthWeight() {
		return northWeight;
	}
	
	/**
	 * Returns a string representation of this node, including its ID and connections.
	 *
	 * @return a string representation of this node
	 */
	public String toString() {
		String s = "ID: " + this.id;
		if (this.hasNorth) {
			s += " - north: " + this.north.getId() + " weight " + this.northWeight;
		}
	
		if (this.hasSouth) {
			s += " - south: " + this.south.getId() + " weight " + this.southWeight;
		}
	
		if (this.hasWest) {
			s += " - west: " + this.west.getId() + " weight " + this.westWeight;
		}
	
		if (this.hasEast) {
			s += " - east: " + this.east.getId() + " weight " + this.eastWeight;
		}
		return s;
	
	}
}	