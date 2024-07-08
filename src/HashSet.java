import java.util.HashMap;

public class HashSet <E>{
    // Internal HashMap to store elements
    private transient HashMap<E, Object> map;

    // Dummy value to associate with each key in the HashMap
    private static final Object PRESENT = new Object();

    public HashSet() {
        map = new HashMap<>();
    }

    // Adds an element to the set
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    // Removes an element from the set
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    // Checks if the set contains an element
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

}
