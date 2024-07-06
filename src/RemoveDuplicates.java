import java.util.HashMap;

public class RemoveDuplicates {
  public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>();
    hm.put(1, "John");
    hm.put(2, "Alice");
    hm.put(3, "Bob");
    hm.put(4, "Alice"); // Duplicate key
    hm.put(5, "Mary");
    hm.put(6, "John"); 

    System.out.println(hm.get(hm));
  }
}
