// Name 
// Email


import java.util.ArrayList;
import java.util.HashMap;

/**
 * CustomHashMap is a simple implementation of a HashMap-like structure.
 * This class uses an ArrayList to store key-value pairs.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class CustomHashMap<K, V> {
    private final ArrayList<Entry<K, V>> map;

    /**
     * Constructs an empty CustomHashMap.
     */
    public CustomHashMap() {
        this.map = new ArrayList<>();
    }

    /**
     * Associates the specified value with the specified key in this map.
     *
     * @param key   the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     */
    public void set(K key, V value) {
        for (Entry<K, V> entry : map) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        map.add(new Entry<>(key, value));
    }

    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or null if this map contains no mapping for the key
     */
    public V getValue(K key) {
        for (Entry<K, V> entry : map) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /**
     * Returns true if this map contains a mapping for the specified key.
     *
     * @param key the key whose presence in this map is to be tested
     * @return true if this map contains a mapping for the specified key, false otherwise
     */
    public boolean hasKey(K key) {
        for (Entry<K, V> entry : map) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a HashMap containing the same mappings as this CustomHashMap.
     *
     * @return a HashMap containing the same mappings as this CustomHashMap
     */
    public HashMap<K, V> getMap() {
        HashMap<K, V> hashMap = new HashMap<>();
        for (Entry<K, V> entry : map) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}
