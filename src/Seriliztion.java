import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Seriliztion {
  public static void main(String[] args) {
   try {
    FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\sandesh.txt");
    Scanner sc = new Scanner(fis);
    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
    sc.close();
   } catch (IOException e) {
    e.getMessage();
   }
  }
}
