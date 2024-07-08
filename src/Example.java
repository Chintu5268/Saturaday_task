public class Example {
  
public static void geString(){
  System.out.println("This is Static method");
}
public void geStringMessage(){
  System.out.println("This is Non-Static method");
}
  public static void main(String[] args) {
    Example example = new Example();
  
    example.geString();
    example.geStringMessage();
  }
}
