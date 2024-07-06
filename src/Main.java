import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Main {
  /*public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

      for(Map.Entry<String, Integer> entry :map.entrySet()){
        System.out.println("Keys "+ entry.getKey()+" values "+entry.getValue());
      }
    } */  
  
    
    
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
    
            for (String fruit : list) {
                if ("Banana"==(fruit)) {
                    //list.remove(fruit);  This will cause ConcurrentModificationException
                    System.out.println("Its Sucess..");
                }else{
                  System.out.println("Its failed..");
                }
            }
        
    }
    
}
