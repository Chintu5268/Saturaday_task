import java.util.LinkedHashSet;

public class HashSetDemo {

  public static void main(String[] args) {
    LinkedHashSet linkedHashSet = new LinkedHashSet();
      linkedHashSet.add("ram"); 
      linkedHashSet.add("shyam");
      linkedHashSet.add(null); 
      linkedHashSet.add(10); 
      linkedHashSet.add("ram");
      linkedHashSet.add(475);
      System.out.println(linkedHashSet);
  }
}