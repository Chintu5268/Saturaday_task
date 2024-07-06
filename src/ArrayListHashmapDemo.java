import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashmapDemo {
  
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Sandesh");
    list.add("Piyush");
    list .add("Amit");
    list .add("Rakesh");
    list .add("Amol");
    list .add("Hemant");

    HashMap<String,ArrayList<String>> hm = new HashMap<>();
    hm.put("Fruits", list);

    ArrayList<String> retrivedArrayList = hm.get("Fruits");
    System.out.println(retrivedArrayList);
  }
}
