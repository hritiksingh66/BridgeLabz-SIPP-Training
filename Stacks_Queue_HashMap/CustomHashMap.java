import java.util.LinkedList;

public class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;
    private int size;
    
    static class Entry<K, V> {
        K key;
        V value;
        
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
    
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        
        bucket.add(new Entry<>(key, value));
        size++;
    }
    
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        
        return null;
    }
    
    public V remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return entry.value;
            }
        }
        
        return null;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 8);
        
        System.out.println("apple: " + map.get("apple"));
        System.out.println("banana: " + map.get("banana"));
        System.out.println("Size: " + map.size());
        
        map.remove("banana");
        System.out.println("After removing banana, size: " + map.size());
        System.out.println("banana: " + map.get("banana"));
    }
}