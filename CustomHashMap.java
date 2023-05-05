import java.util.ArrayList;
import java.util.HashMap;

public class CustomHashMap<K, V> {
    private final ArrayList<Entry<K, V>> map;

    public CustomHashMap() {
        this.map = new ArrayList<>();
    }

    public void set(K key, V value) {
        for (Entry<K, V> entry : map) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        map.add(new Entry<>(key, value));
    }

    public V getValue(K key) {
        for (Entry<K, V> entry : map) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public boolean hasKey(K key) {
        for (Entry<K, V> entry : map) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public HashMap<K, V> getMap() {
        HashMap<K, V> hashMap = new HashMap<>();
        for (Entry<K, V> entry : map) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}
