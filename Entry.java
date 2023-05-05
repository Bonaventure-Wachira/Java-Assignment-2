// Name 
// Email


/**
 * A simple key-value pair class called Entry.
 *
 * @param <K> the type of the key
 * @param <V> the type of the value
 */
public class Entry<K, V> {
    private final K key;
    private V value;

    /**
     * Constructs an Entry with the specified key and value.
     *
     * @param key   the key for this entry
     * @param value the value for this entry
     */
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the key for this entry.
     *
     * @return the key for this entry
     */
    public K getKey() {
        return key;
    }

    /**
     * Returns the value for this entry.
     *
     * @return the value for this entry
     */
    public V getValue() {
        return value;
    }

    /**
     * Sets the value for this entry.
     *
     * @param value the new value for this entry
     */
    public void setValue(V value) {
        this.value = value;
    }
}
