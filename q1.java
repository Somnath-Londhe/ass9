import java.io.File;
public class Demo {
   public static void main(String[] args) {
      try {
         File file = new File("demo1.txt");
         file.createNewFile();
         System.out.println("Is file hidden? " + file.isHidden());
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}